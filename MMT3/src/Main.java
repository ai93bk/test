import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

/*
 * 変更箇所
 * GetBinaryUtil
 * Header 全属性値バイナリでゲッターセッター有り
 * Sensor1Body 全属性値バイナリでゲッターセッター有り
 * Sensor2Body 全属性値バイナリでゲッターセッター有り
 * Main 全エラーチェック後にerrorfile[j]==1の場合continue
 * Main センサ種別チェック for(int k)の削除
 * Main センサ1ボディ部 a[]削除
 * Main Javaプログラム終了ログ番号17に変更
 * Main センサ種別チェック 3番目else if()→elseに変更
 * Main ヘッダ・ボディ部にバイナリ変換後の値を代入
 * */
public class Main {
	/*static String in_dir=".\\in\\";
	static String success_dir=".\\in\\success\\";
	static String error_dir=".\\in\\error\\";
	static String out_dir=".\\out\\";
	static String conf_dir=".\\conf\\";
	static String log_dir=".\\log\\";
	static String tmp_dir=".\\tmp\\";*/
	static BufferedReader br;

	static String bin_dir=new File("").getAbsolutePath();
	static String in_dir=new File("").getAbsolutePath().replace("bin","")+"in\\";
	static String success_dir=new File("").getAbsolutePath().replace("bin","")+"in\\success\\";
	static String error_dir=new File("").getAbsolutePath().replace("bin","")+"in\\error\\";
	static String out_dir=new File("").getAbsolutePath().replace("bin","")+"out\\";
	static String conf_dir=new File("").getAbsolutePath().replace("bin","")+"conf\\";
	static String log_dir=new File("").getAbsolutePath().replace("bin","")+"log\\";
	static String tmp_dir=new File("").getAbsolutePath().replace("bin","")+"tmp\\";

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Calendar cl = Calendar.getInstance();
		Logger log = Logger.getLogger(Main.class);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMddHHmmss");
		String time1=sdf1.format(cl.getTime()).toString();
		String time2=sdf2.format(cl.getTime()).toString();
		System.setProperty("str", time1);
		DOMConfigurator.configure(conf_dir+"log4j.xml");

		GetLogUtil glu = new GetLogUtil();
		File[] csv_path_list;
		GetPathUtil gpu = new GetPathUtil();
		int[] errorfile = new int[gpu.getLength()];

		log.info(glu.getInfoLog(16));
		if(gpu.getLength()>0) {
			csv_path_list=gpu.getCSVPathList();
			for(int i=0; i<gpu.getLength(); i++) {
				try {
					br = new BufferedReader(new InputStreamReader(new FileInputStream(csv_path_list[i]),"UTF-8"));
					String line;
					String[] read = null;
					ArrayList<String[]> readline = new ArrayList<String[]>();
					log.info(glu.getInfoLog(18)+"\t"+csv_path_list[i].getName());
					while((line=br.readLine())!=null) {
						read=line.split(",",-1);
						readline.add(read);
					}
					int mode=0;
					if(readline.size()>601) {
						errorfile[i]=1;
						log.warn(glu.getWarnLog(13)+"\t"+csv_path_list[i]+readline.size()+"行");
					}
					for(int j=0; j<readline.size();j++) {
						String[] s = readline.get(j);;
						if(s.length!=60) {
							errorfile[i]=1;
							log.warn(glu.getWarnLog(12)+"\t"+csv_path_list[i]+" "+j+"行");
						}
					}
					for(int j=0; j<readline.size(); j++) {
						String[] s = readline.get(j);
						if(j!=0) {
							if(s[0].equals("01")) {
								mode=1;
							}else if(s[0].equals("02")) {
								mode=2;
							}else{
								errorfile[i]=1;
								log.warn(glu.getWarnLog(9)+"\t"+csv_path_list[i]+" "+j+"行目 １列目");
							}
						}
					}
					for(int j=0; j<readline.size(); j++) {
						String[] s =readline.get(j);
						if(j!=0) {
							for(int k=0; k<s.length; k++) {
								InputCheckUtil icu = new InputCheckUtil(s[k]);
								if(mode==1) {
									if(!(icu.CheckSensorData1(k,j))) {
										errorfile[i]=1;
									}
								}else if(mode==2) {
									if(!(icu.CheckSensorData2(k,j))) {
										errorfile[i]=1;
									}
								}
							}
						}
					}
					if(errorfile[i]==1) {
						continue;
					}
					br.close();
					log.info(glu.getInfoLog(19)+"\t"+csv_path_list[i].getName());
					/*if(!(new File(success_dir+"\\"+time2).exists())) {
	alc					new File(success_dir+"\\"+time2).mkdir();
					}
					FileMoveUtil fmu = new FileMoveUtil(csv_path_list[i].getPath(),success_dir+"\\"+time2+"\\"+csv_path_list[i].getName());
					try {
						fmu.moveFile();
					}catch(IOException e) {
						e.printStackTrace();
					}*/
					GetBinaryUtil gbu = new GetBinaryUtil();
					Header head = new Header();
					String[] read_data=readline.get(1);
					head.setStartCoode(gbu.getHexBinary("AA55AA55"));
					head.setCommand(gbu.getHexBinary(read_data[3]));
					head.setIp(gbu.getStringBinary(read_data[5]));
					head.setSequence(gbu.getStringBinary(read_data[5]+read_data[4]+String.format("%09d",i)));
					head.setTerminalCat(gbu.getBCDBinary(read_data[4]));
					head.setImei(gbu.getBCDBinary(read_data[6],1));
					ArrayList<Sensor1Body> s1body = new ArrayList<Sensor1Body>();
					ArrayList<Sensor2Body> s2body = new ArrayList<Sensor2Body>();
					if(mode==1) {
						Sensor1Body body = new Sensor1Body();
						for(int j=0; j<readline.size(); j++) {
							String[] s =readline.get(j);
							if(j!=0) {
								body.setType(gbu.getHexBinary("0070",2));
								body.setS_dataNum(gbu.getHexBinary("600",2));
								body.setDate(gbu.getBCDBinary(s[1]));
								body.setLat(gbu.getHexBinary(s[7],4));
								body.setLon(gbu.getHexBinary(s[8],4));
								body.setSpeed(gbu.getHexBinary(s[9],2));
								body.setPosition(gbu.getHexBinary(s[10],2));
								body.setMode(gbu.getStringBinary(s[11]));
								body.setP_Accel(gbu.getHexBinary(s[12],2));
								byte[][] fb = new byte[10][];
								fb[0]=gbu.getHexBinary(s[13],2);
								fb[1]=gbu.getHexBinary(s[14],2);
								fb[2]=gbu.getHexBinary(s[15],2);
								fb[3]=gbu.getHexBinary(s[16],2);
								fb[4]=gbu.getHexBinary(s[17],2);
								fb[5]=gbu.getHexBinary(s[18],2);
								fb[6]=gbu.getHexBinary(s[19],2);
								fb[7]=gbu.getHexBinary(s[20],2);
								fb[8]=gbu.getHexBinary(s[21],2);
								fb[9]=gbu.getHexBinary(s[22],2);
								body.setFb_Accel(fb);
								byte[][] lr = new byte[10][];
								lr[0]=gbu.getHexBinary(s[23],2);
								lr[1]=gbu.getHexBinary(s[24],2);
								lr[2]=gbu.getHexBinary(s[25],2);
								lr[3]=gbu.getHexBinary(s[26],2);
								lr[4]=gbu.getHexBinary(s[27],2);
								lr[5]=gbu.getHexBinary(s[28],2);
								lr[6]=gbu.getHexBinary(s[29],2);
								lr[7]=gbu.getHexBinary(s[30],2);
								lr[8]=gbu.getHexBinary(s[31],2);
								lr[9]=gbu.getHexBinary(s[32],2);
								body.setLr_Accel(lr);
								byte[][] ud = new byte[10][];
								ud[0]=gbu.getHexBinary(s[33],2);
								ud[1]=gbu.getHexBinary(s[34],2);
								ud[2]=gbu.getHexBinary(s[35],2);
								ud[3]=gbu.getHexBinary(s[36],2);
								ud[4]=gbu.getHexBinary(s[37],2);
								ud[5]=gbu.getHexBinary(s[38],2);
								ud[6]=gbu.getHexBinary(s[39],2);
								ud[7]=gbu.getHexBinary(s[40],2);
								ud[8]=gbu.getHexBinary(s[41],2);
								ud[9]=gbu.getHexBinary(s[42],2);
								body.setUd_Accel(ud);
								s1body.add(body);
							}
						}
					}else if(mode==2){
						Sensor2Body body = new Sensor2Body();
						for(int j=0; j<readline.size(); j++) {
							String[] s = readline.get(j);
							if(j!=0) {
								body.setType(gbu.getHexBinary("0071",2));
								body.setS_dataNum(gbu.getHexBinary("600",2));
								body.setDate(gbu.getBCDBinary(s[1]));
								body.setpDataCat_postion(gbu.getStringBinary("90"));
								body.setClassfy(gbu.getStringBinary("00"));
								body.setpDataNum_p(gbu.getHexBinary("1", 2));
								body.setLat(gbu.getHexBinary(s[7],4));
								body.setLatSec(gbu.getStringBinary(s[58]));
								body.setLon(gbu.getHexBinary(s[8],4));
								body.setLonSec(gbu.getStringBinary(s[59]));
								body.setSpeed(gbu.getHexBinary(s[9],2));
								body.setQuality(gbu.getStringBinary(s[53]));
								body.setMode(gbu.getStringBinary(s[11]));
								body.setSatellite_num(gbu.getHexBinary(String.format("%04d",Integer.valueOf(s[54])),2));
								body.setPDOP(gbu.getHexBinary(s[55],2));
								body.setPosition(gbu.getHexBinary(s[10],2));
								body.setHeight(gbu.getHexBinary(s[56],2));
								body.setP_Correct(gbu.getStringBinary(s[57]));
								body.setpDataCat_sensor(gbu.getStringBinary("92"));
								body.setpDataNum_a(gbu.getHexBinary("10", 2));
								byte[][] fb = new byte[10][];
								fb[0]=gbu.getHexBinary(s[13],2);
								fb[1]=gbu.getHexBinary(s[14],2);
								fb[2]=gbu.getHexBinary(s[15],2);
								fb[3]=gbu.getHexBinary(s[16],2);
								fb[4]=gbu.getHexBinary(s[17],2);
								fb[5]=gbu.getHexBinary(s[18],2);
								fb[6]=gbu.getHexBinary(s[19],2);
								fb[7]=gbu.getHexBinary(s[20],2);
								fb[8]=gbu.getHexBinary(s[21],2);
								fb[9]=gbu.getHexBinary(s[22],2);
								body.setFb_Accel(fb);
								byte[][] lr = new byte[10][];
								lr[0]=gbu.getHexBinary(s[23],2);
								lr[1]=gbu.getHexBinary(s[24],2);
								lr[2]=gbu.getHexBinary(s[25],2);
								lr[3]=gbu.getHexBinary(s[26],2);
								lr[4]=gbu.getHexBinary(s[27],2);
								lr[5]=gbu.getHexBinary(s[28],2);
								lr[6]=gbu.getHexBinary(s[29],2);
								lr[7]=gbu.getHexBinary(s[30],2);
								lr[8]=gbu.getHexBinary(s[31],2);
								lr[9]=gbu.getHexBinary(s[32],2);
								body.setLr_Accel(lr);
								byte[][] ud = new byte[10][];
								ud[0]=gbu.getHexBinary(s[33],2);
								ud[1]=gbu.getHexBinary(s[34],2);
								ud[2]=gbu.getHexBinary(s[35],2);
								ud[3]=gbu.getHexBinary(s[36],2);
								ud[4]=gbu.getHexBinary(s[37],2);
								ud[5]=gbu.getHexBinary(s[38],2);
								ud[6]=gbu.getHexBinary(s[39],2);
								ud[7]=gbu.getHexBinary(s[40],2);
								ud[8]=gbu.getHexBinary(s[41],2);
								ud[9]=gbu.getHexBinary(s[42],2);
								body.setUd_Accel(ud);
								byte[][] a = new byte[10][];
								a[0]=gbu.getStringBinary(s[43]);
								a[1]=gbu.getStringBinary(s[44]);
								a[2]=gbu.getStringBinary(s[45]);
								a[3]=gbu.getStringBinary(s[46]);
								a[4]=gbu.getStringBinary(s[47]);
								a[5]=gbu.getStringBinary(s[48]);
								a[6]=gbu.getStringBinary(s[49]);
								a[7]=gbu.getStringBinary(s[50]);
								a[8]=gbu.getStringBinary(s[51]);
								a[9]=gbu.getStringBinary(s[52]);
								body.setA_Correct(a);
								s2body.add(body);
							}
						}
					}
					FileOutputUtil fou = new FileOutputUtil();
					if(mode==1) {
						String f = tmp_dir+"\\filesize1.tmp";
				        BufferedOutputStream bf = new BufferedOutputStream(new FileOutputStream(f));
						try {
							for(int j=0; j<s1body.size(); j++) {
								Sensor1Body body=s1body.get(j);
								byte[][] fb = body.getFb_Accel();
								byte[][] lr = body.getLr_Accel();
								byte[][] ud = body.getUd_Accel();
						        bf.write(body.getS_dataNum());
						        bf.write(body.getDate());
						        bf.write(body.getLat());
						        bf.write(body.getLon());
						        bf.write(body.getSpeed());
						        bf.write(body.getPosition());
								bf.write(body.getMode());
								bf.write(body.getP_Accel());
								for(int k=0; k<10; k++) {
									bf.write(fb[k]);
									bf.write(lr[k]);
									bf.write(ud[k]);
								}
							}
							bf.flush();
							bf.close();
						}catch (IOException e) {
							e.printStackTrace();
						}
						head.setDataSize(gbu.getHexBinary(fou.getSize(f),4));
						String dat = csv_path_list[i].getName().substring(0,csv_path_list[i].getName().lastIndexOf('.')) + ".dat";
					    BufferedOutputStream bf2 = new BufferedOutputStream(new FileOutputStream(out_dir+"\\"+dat));
						try {
						    bf2.write(head.getStartCoode());
						    bf2.write(head.getCommand());
						    bf2.write(head.getSequence());
						    bf2.write(head.getTerminalCat());
						    bf2.write(head.getIp());
						    bf2.write(head.getImei());
						    bf2.write(head.getDataSize());
							for(int j=0; j<s1body.size(); j++) {
								Sensor1Body body=s1body.get(j);
								byte[][] fb = body.getFb_Accel();
								byte[][] lr = body.getLr_Accel();
								byte[][] ud = body.getUd_Accel();
								bf2.write(body.getS_dataNum());
								bf2.write(body.getDate());
								bf2.write(body.getLat());
								bf2.write(body.getLon());
								bf2.write(body.getSpeed());
								bf2.write(body.getPosition());
								bf2.write(body.getMode());
								bf2.write(body.getP_Accel());
								for(int k=0; k<10; k++) {
									bf2.write(fb[k]);
									bf2.write(lr[k]);
									bf2.write(ud[k]);
								}
							}
							bf2.flush();
							bf2.close();
						}catch (IOException e) {
				            e.printStackTrace();
				        }
					}else if(mode==2) {
						String f2 = tmp_dir+"\\filesize2.tmp";
						String f3 = tmp_dir+"\\filesize3.tmp";
						String f4 = tmp_dir+"\\filesize4.tmp";
						String dat = csv_path_list[i].getName().substring(0,csv_path_list[i].getName().lastIndexOf('.')) + ".dat";
				        BufferedOutputStream bf2 = new BufferedOutputStream(new FileOutputStream(f2));
				        BufferedOutputStream bf3 = new BufferedOutputStream(new FileOutputStream(f3));
				        BufferedOutputStream bf4 = new BufferedOutputStream(new FileOutputStream(f4));
					    BufferedOutputStream bf5 = new BufferedOutputStream(new FileOutputStream(out_dir+"\\"+dat));
						try {
							for(int j=0; j<s2body.size(); j++) {
								Sensor2Body body=s2body.get(j);
								byte[][] fb = body.getFb_Accel();
								byte[][] lr = body.getLr_Accel();
								byte[][] ud = body.getUd_Accel();
								byte[][] a = body.getA_Correct();
						        bf2.write(body.getpDataNum_p());
						        bf2.write(body.getDate());
						        bf2.write(body.getLat());
						        bf2.write(body.getLatSec());
						        bf2.write(body.getLon());
						        bf2.write(body.getLonSec());
						        bf2.write(body.getSpeed());
						        bf2.write(body.getQuality());
						        bf2.write(body.getMode());
						        bf2.write(body.getSatellite_num());
						        bf2.write(body.getPDOP());
						        bf2.write(body.getPosition());
						        bf2.write(body.getHeight());
						        bf2.write(body.getP_Correct());
						        bf3.write(body.getpDataNum_a());
						        for(int k=0; k<10; k++) {
									bf3.write(fb[k]);
									bf3.write(lr[k]);
									bf3.write(ud[k]);
									bf3.write(a[k]);
								}
							}
							for(int j=0; j<s2body.size(); j++) {
								Sensor2Body body=s2body.get(j);
								body.setpDataNum_p(gbu.getHexBinary(fou.getSize(f2),4));
								body.setpDataSize_a(gbu.getHexBinary(fou.getSize(f3),4));
							}
							Sensor2Body b=s2body.get(0);
						    bf4.write(b.getType());
							bf4.write(b.getS_dataNum());
							bf4.write(b.getDate());
							for(int j=0; j<s2body.size(); j++) {
								Sensor2Body body=s2body.get(j);
								byte[][] fb = body.getFb_Accel();
								byte[][] lr = body.getLr_Accel();
								byte[][] ud = body.getUd_Accel();
								byte[][] a = body.getA_Correct();
								bf4.write(body.getpDataCat_postion());
								bf4.write(body.getClassfy());
						        bf4.write(body.getpDataNum_p());
						        bf4.write(body.getDate());
						        bf4.write(body.getLat());
						        bf4.write(body.getLatSec());
						        bf4.write(body.getLon());
						        bf4.write(body.getLonSec());
						        bf4.write(body.getSpeed());
						        bf4.write(body.getQuality());
						        bf4.write(body.getMode());
						        bf4.write(body.getSatellite_num());
						        bf4.write(body.getPDOP());
						        bf4.write(body.getPosition());
						        bf4.write(body.getHeight());
						        bf4.write(body.getP_Correct());
						        bf4.write(body.getpDataCat_sensor());
						        bf4.write(body.getClassfy());
						        bf4.write(body.getpDataNum_a());
						        for(int k=0; k<10; k++) {
									bf4.write(fb[k]);
									bf4.write(lr[k]);
									bf4.write(ud[k]);
									bf4.write(a[k]);
								}
							}
							head.setDataSize(gbu.getHexBinary(fou.getSize(f4),4));
							Sensor2Body b2=s2body.get(0);
						    bf5.write(head.getStartCoode());
						    bf5.write(head.getCommand());
						    bf5.write(head.getSequence());
						    bf5.write(head.getTerminalCat());
						    bf5.write(head.getIp());
						    bf5.write(head.getImei());
						    bf5.write(head.getDataSize());
						    bf5.write(b2.getType());
							bf5.write(b2.getS_dataNum());
							bf5.write(b.getDate());
							for(int j=0; j<s2body.size(); j++) {
								Sensor2Body body=s2body.get(j);
								byte[][] fb = body.getFb_Accel();
								byte[][] lr = body.getLr_Accel();
								byte[][] ud = body.getUd_Accel();
								byte[][] a = body.getA_Correct();
								bf5.write(body.getpDataCat_postion());
								bf5.write(body.getClassfy());
						        bf5.write(body.getpDataNum_p());
						        bf5.write(body.getDate());
						        bf5.write(body.getLat());
						        bf5.write(body.getLatSec());
						        bf5.write(body.getLon());
						        bf5.write(body.getLonSec());
						        bf5.write(body.getSpeed());
						        bf5.write(body.getQuality());
						        bf5.write(body.getMode());
						        bf5.write(body.getSatellite_num());
						        bf5.write(body.getPDOP());
						        bf5.write(body.getPosition());
						        bf5.write(body.getHeight());
						        bf5.write(body.getP_Correct());
						        bf5.write(body.getpDataCat_sensor());
						        bf5.write(body.getClassfy());
						        bf5.write(body.getpDataNum_a());
						        for(int k=0; k<10; k++) {
									bf5.write(fb[k]);
									bf5.write(lr[k]);
									bf5.write(ud[k]);
									bf5.write(a[k]);
								}
							}
							bf2.flush();
							bf3.flush();
							bf4.flush();
							bf5.flush();
							bf2.close();
							bf3.close();
							bf4.close();
							bf5.close();

						}catch (IOException e) {
				            e.printStackTrace();
				        }
					}
				}catch(NullPointerException e) {
					log.error(glu.getErrorLog()+"NullPointerException "+e.getLocalizedMessage());
				}catch(FileNotFoundException e) {
					log.error(glu.getErrorLog()+"FileNotFoundException"+e.getLocalizedMessage());
				}catch(IOException e) {
					try {
						br.close();
						log.error(glu.getErrorLog()+"IOException"+e.getLocalizedMessage());
						if(!(new File(error_dir+"\\"+time2).exists())) {
							new File(error_dir+"\\"+time2).mkdir();
						}
						FileMoveUtil fmu = new FileMoveUtil(csv_path_list[i].getPath(),error_dir+"\\"+time2+"\\"+csv_path_list[i].getName());
						fmu.moveFile();
					}catch(IOException e1) {
						e1.printStackTrace();
					}
				}catch(ArrayIndexOutOfBoundsException e) {
					try {
						br.close();
						log.error(glu.getErrorLog()+"ArrayIndexOutOfBoundsException"+e.getLocalizedMessage());
						if(!(new File(error_dir+"\\"+time2).exists())) {
							new File(error_dir+"\\"+time2).mkdir();
						}
						FileMoveUtil fmu = new FileMoveUtil(csv_path_list[i].getPath(),error_dir+"\\"+time2+"\\"+csv_path_list[i].getName());
						fmu.moveFile();
					}catch(IOException e1) {
						e1.printStackTrace();
					}
				}catch(IndexOutOfBoundsException e) {
					try {
						br.close();
						log.error(glu.getErrorLog()+"IndexOutOfBoundsException"+e.getLocalizedMessage());
						if(!(new File(error_dir+"\\"+time2).exists())) {
							new File(error_dir+"\\"+time2).mkdir();
						}
						FileMoveUtil fmu = new FileMoveUtil(csv_path_list[i].getPath(),error_dir+"\\"+time2+"\\"+csv_path_list[i].getName());
						fmu.moveFile();
					}catch(IOException e1) {
						e1.printStackTrace();
					}
				}finally {
					try {
						br.close();
					}catch(IOException e){
						e.printStackTrace();
					}
				}
			}
			/*for(int i=0; i<errorfile.length; i++) {
				if(errorfile[i]==1) {
					if(!(new File(error_dir+"\\"+time2).exists())) {
						new File(error_dir+"\\"+time2).mkdir();
					}
					FileMoveUtil fmu = new FileMoveUtil(csv_path_list[i].getPath(),error_dir+"\\"+time2+"\\"+csv_path_list[i].getName());
					try {
					 fmu.moveFile();
					}catch(IOException e) {
						e.printStackTrace();
					}
				}
			}*/
			log.info(glu.getInfoLog(17));
		}else if(gpu.getLength() == 0) {
			log.warn(glu.getWarnLog(7)+"\t"+in_dir);
			log.info(glu.getInfoLog(17));
		}

	}

}
