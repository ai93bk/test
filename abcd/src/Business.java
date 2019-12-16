import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Business {
	static String in_dir=".\\in\\";
	static String success_dir=".\\in\\success\\";
	static String error_dir=".\\in\\error\\";
	static String out_dir=".\\out\\";
	static String conf_dir=".\\conf\\";
	static String log_dir=".\\log\\";
	static String tmp_dir=".\\tmp\\";
	static BufferedReader br;
/*
	static String bin_dir=new File("").getAbsolutePath();
	static String in_dir=new File("").getAbsolutePath().replace("bin","")+"in\\";
	static String success_dir=new File("").getAbsolutePath().replace("bin","")+"in\\success\\";
	static String error_dir=new File("").getAbsolutePath().replace("bin","")+"in\\error\\";
	static String out_dir=new File("").getAbsolutePath().replace("bin","")+"out\\";
	static String conf_dir=new File("").getAbsolutePath().replace("bin","")+"conf\\";
	static String log_dir=new File("").getAbsolutePath().replace("bin","")+"log\\";
	static String tmp_dir=new File("").getAbsolutePath().replace("bin","")+"tmp\\";
*/

	Logger log = Logger.getLogger(Business.class);
	GetLogUtil glu = new GetLogUtil();
	GetPathUtil gpu = new GetPathUtil();
	GetBinaryUtil gbu = new GetBinaryUtil();
	Header head = new Header();
	ArrayList<Sensor1Body> s1body = new ArrayList<Sensor1Body>();
	ArrayList<Sensor2Body> s2body = new ArrayList<Sensor2Body>();

	File[] csv_path_list;
	int[] errorfile = new int[gpu.getLength()];
	String dat ="";
	int mode = 0;
	ArrayList<String[]> readline = new ArrayList<String[]>();

	/*
	 * 変更箇所
	 * */
	String time1 = "";
	String time2 = "";


	public Calendar getCl() {
		return Calendar.getInstance();
	}

	public String getTime1(Calendar cl) {
		return new SimpleDateFormat("yyyyMMdd").format(cl.getTime()).toString();
	}

	public String getTime2(Calendar cl) {
		return new SimpleDateFormat("yyyyMMddHHmmss").format(cl.getTime()).toString();
	}

	public void setLog4j_conf(String time) {
		System.setProperty("str", time);
		DOMConfigurator.configure(conf_dir+"log4j.xml");
	}

	public ArrayList<String[]> readCSV(int filenum) throws IOException{
		br = new BufferedReader(new InputStreamReader(new FileInputStream(csv_path_list[filenum]),"UTF-8"));
		String line;
		String[] read = null;
		ArrayList<String[]> readline = new ArrayList<String[]>();
		log.info(glu.getInfoLog(18)+"\t"+csv_path_list[filenum].getName());
		while((line=br.readLine())!=null) {
			read=line.split(",",-1);
			readline.add(read);
		}
		br.close();
		return readline;
	}

	public void checkRecordNum(ArrayList<String[]> readline,int filenum) {
		if(readline.size()>601) {
			errorfile[filenum]=2;
			log.warn(glu.getWarnLog(13)+"\t"+csv_path_list[filenum]+readline.size()+"行");
		}
	}

	public void checkColmunNum(ArrayList<String[]> readline,int filenum) {
		for(int j=0; j<readline.size();j++) {
			String[] s = readline.get(j);;
			if(s.length!=60) {
				errorfile[filenum]=2;
				log.warn(glu.getWarnLog(12)+"\t"+csv_path_list[filenum]+" "+j+"行");
			}
		}
	}

	public void checkSensorType(ArrayList<String[]> readline,int filenum) {
		for(int j=0; j<readline.size(); j++) {
			String[] s = readline.get(j);
			if(j!=0) {
				if(s[0].equals("01")) {
					mode=1;
				}else if(s[0].equals("02")) {
					mode=2;
				}else{
					errorfile[filenum]=2;
					log.warn(glu.getWarnLog(9)+"\t"+csv_path_list[filenum]+" "+j+"行目 １列目");
				}
			}
		}
	}


	/*
	 *
	 * 変更箇所
	 *
	 * */
	public void checkInputData(ArrayList<String[]> readline,int filenum) {
		for(int j=0; j<readline.size(); j++) {
			String[] s =readline.get(j);
			if(j!=0) {
				for(int k=1; k<s.length; k++) {
					InputCheckUtil icu = new InputCheckUtil(s[k]);
					if(mode==1) {
						if(!(icu.CheckSensorData1(k,j))) {
							log.warn(glu.getWarnLog(11)+"\t"+j+"行目 "+k+"列目");
							errorfile[filenum]=2;
						}
					}else if(mode==2) {
						if(!(icu.CheckSensorData2(k,j))) {
							log.warn(glu.getWarnLog(11)+"\t"+j+"行目 "+k+"列目 "+s[k]);
							errorfile[filenum]=2;
						}
					}
				}
			}
		}
	}

	/*
	 *
	 * 変更箇所
	 *
	 */
	public void toMoveCSV(String time)throws IOException {
		for(int i=0; i<errorfile.length; i++) {
			if(errorfile[i]==1) {
				if(!(new File(success_dir+"\\"+time).exists())) {
					new File(success_dir+"\\"+time).mkdir();
				}
				FileMoveUtil fmu = new FileMoveUtil(csv_path_list[i].getPath(),success_dir+"\\"+time+"\\"+csv_path_list[i].getName());
				fmu.moveFile();
			}else if(errorfile[i]==2) {
				if(!(new File(error_dir+"\\"+time).exists())) {
					new File(error_dir+"\\"+time).mkdir();
				}
				FileMoveUtil fmu = new FileMoveUtil(csv_path_list[i].getPath(),error_dir+"\\"+time+"\\"+csv_path_list[i].getName());
				 fmu.moveFile();
			}
		}
	}

	public void toMoveDat(String time,int filenum)throws IOException {
		dat = csv_path_list[filenum].getName().substring(0,csv_path_list[filenum].getName().lastIndexOf('.')) + ".dat";
		if(new File(out_dir + "\\" + dat).exists()) {
			if(!(new File(out_dir+"\\"+time).exists())) {
				new File(out_dir+"\\"+time).mkdir();
			}
			FileMoveUtil fmu = new FileMoveUtil(new File(out_dir+"\\"+dat).getPath(),out_dir+"\\"+time+"\\"+dat);
			fmu.moveFile();
		}
	}

	public void setHead(int filenum) {
		String[] read_data=readline.get(1);
		head.setStartCoode(gbu.getHexBinary("AA55AA55"));
		head.setCommand(gbu.getHexBinary(read_data[3]));
		head.setIp(gbu.getStringBinary(read_data[5]));
		String seq = read_data[5]+read_data[1]+String.format("%09d",filenum);
		head.setSequence1(gbu.getStringBinary(seq.substring(0,16)));
		head.setSequence2(gbu.getStringBinary(seq.substring(16,32)));
		head.setSequence3(gbu.getStringBinary(seq.substring(32,35)));
		head.setTerminalCat(gbu.getBCDBinary(read_data[4]));
		head.setImei(gbu.getBCDBinary(String.format("%016d", Long.valueOf(read_data[6]))));
	}

	public void setSensor1Body(int mode) {
		if(mode==1) {
			Sensor1Body body = new Sensor1Body();
			for(int j=0; j<readline.size(); j++) {
				String[] s =readline.get(j);
				if(j!=0) {
					head.setDataSize(gbu.getHexBinary(String.valueOf((readline.size()-1)*82+4),4));
					body.setType(gbu.getHexBinary("0070"));
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
		}
	}

	public void setSensor2Body(int mode) {
		if(mode==2){
			Sensor2Body body = new Sensor2Body();
			for(int j=0; j<readline.size(); j++) {
				String[] s = readline.get(j);
				if(j!=0) {
					head.setDataSize(gbu.getHexBinary(String.valueOf((readline.size()-1)*120+11),4));
					body.setType(gbu.getHexBinary("0071"));
					body.setS_dataNum(gbu.getHexBinary("600",2));
					body.setDate(gbu.getBCDBinary(s[1]));
					body.setpDataCat_postion(gbu.getStringBinary("90"));
					body.setClassfy(gbu.getStringBinary("00"));
					body.setpDataSize_p(gbu.getHexBinary("32",4));
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
					body.setpDataSize_p(gbu.getHexBinary("72",4));
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
	}

	public void writeSensor1(int mode)throws IOException{
		if(mode==1) {
			log.info(glu.getInfoLog(20)+"\t"+dat);
		    BufferedOutputStream bf = new BufferedOutputStream(new FileOutputStream(out_dir+"\\"+dat));
		    bf.write(head.getStartCoode());
		    bf.write(head.getCommand());
		    bf.write(head.getSequence1());
		    bf.write(head.getSequence2());
		    bf.write(head.getSequence3());
		    bf.write(head.getTerminalCat());
		    bf.write(head.getIp());
		    bf.write(head.getImei());
		    bf.write(head.getDataSize());
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
			log.info(glu.getInfoLog(21)+"\t"+dat);
		}
	}

	public void writeSensor2(int mode)throws IOException{
		if(mode==2) {
			log.info(glu.getInfoLog(20)+"\t"+dat);
		    BufferedOutputStream bf = new BufferedOutputStream(new FileOutputStream(out_dir+"\\"+dat));
			Sensor2Body b=s2body.get(0);
		    bf.write(head.getStartCoode());
		    bf.write(head.getCommand());
		    bf.write(head.getSequence1());
		    bf.write(head.getSequence2());
		    bf.write(head.getSequence3());
		    bf.write(head.getTerminalCat());
		    bf.write(head.getIp());
		    bf.write(head.getImei());
		    bf.write(head.getDataSize());
		    bf.write(b.getType());
			bf.write(b.getS_dataNum());
			bf.write(b.getDate());
			for(int j=0; j<s2body.size(); j++) {
				Sensor2Body body=s2body.get(j);
				byte[][] fb = body.getFb_Accel();
				byte[][] lr = body.getLr_Accel();
				byte[][] ud = body.getUd_Accel();
				byte[][] a = body.getA_Correct();
				bf.write(body.getpDataCat_postion());
				bf.write(body.getClassfy());
		        bf.write(body.getpDataNum_p());
		        bf.write(body.getDate());
		        bf.write(body.getLat());
		        bf.write(body.getLatSec());
		        bf.write(body.getLon());
		        bf.write(body.getLonSec());
		        bf.write(body.getSpeed());
		        bf.write(body.getQuality());
		        bf.write(body.getMode());
		        bf.write(body.getSatellite_num());
		        bf.write(body.getPDOP());
		        bf.write(body.getPosition());
		        bf.write(body.getHeight());
		        bf.write(body.getP_Correct());
		        bf.write(body.getpDataCat_sensor());
		        bf.write(body.getClassfy());
		        bf.write(body.getpDataNum_a());
		        for(int k=0; k<10; k++) {
					bf.write(fb[k]);
					bf.write(lr[k]);
					bf.write(ud[k]);
					bf.write(a[k]);
				}
			}
			bf.flush();
			bf.close();
			log.info(glu.getInfoLog(21)+"\t"+dat);
		}
	}

	public void plusCheckCode()throws IOException{
		byte[] read_byte = null;
		byte checkcode = 0;
		Path file = Paths.get(out_dir+"\\"+dat);
		read_byte = Files.readAllBytes(file);
		checkcode=BinaryUtil.getCheckCode(read_byte);
		BufferedOutputStream bf = new BufferedOutputStream(new FileOutputStream(out_dir+"\\"+dat));
		bf.write(read_byte);
		bf.write(checkcode);
		bf.flush();
		bf.close();
	}

	public void execute_main(){
		Calendar cl = getCl();
		time1 = getTime1(cl);
		time2 = getTime2(cl);
		setLog4j_conf(time1);

		log.info(glu.getInfoLog(16));


		if(gpu.getLength()>0) {
			csv_path_list=gpu.getCSVPathList();
			for(int i=0; i<gpu.getLength(); i++) {
				try {
					readline.clear();
					s1body.clear();
					s2body.clear();
					readline = readCSV(i);

					checkRecordNum(readline,i);
					checkColmunNum(readline,i);
					checkSensorType(readline,i);
					checkInputData(readline,i);

					if(errorfile[i]==2) {
						continue;
					}

					errorfile[i]=1;
					log.info(glu.getInfoLog(19)+"\t"+csv_path_list[i].getName());
					setHead(i);
					setSensor1Body(mode);
					setSensor2Body(mode);

					toMoveDat(time2,i);
					writeSensor1(mode);
					writeSensor2(mode);

					plusCheckCode();
				}catch(IOException e) {
					errorfile[i]=2;
					log.error(glu.getErrorLog()+"IOException"+e.getLocalizedMessage());
				}catch(IndexOutOfBoundsException e) {
					errorfile[i]=2;
					log.error(glu.getErrorLog()+"IndexOutOfBoundsException"+e.getLocalizedMessage());
				}
			}
			log.info(glu.getInfoLog(17));
			try {
				toMoveCSV(time2);
			} catch (IOException e) {
			}
		}else if(gpu.getLength() == 0){
			log.warn(glu.getWarnLog(7)+"\t"+in_dir);
			log.info(glu.getInfoLog(17));
		}
	}
}