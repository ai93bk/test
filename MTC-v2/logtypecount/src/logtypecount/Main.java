package logtypecount;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		String infile = ""; //読み込むファイルパス
		String outfile = "";       //出力ファイルパス
		String prfile = "";		//プロパティファイルパス
		int scale = 0;
		try {
			infile = args[0]; //読み込むファイルパス
			outfile = new File(args[1]).getAbsolutePath().replace("bin","")+"out\\"+getDate() + ".txt";       //出力ファイルパス
			prfile = new File(args[1]).getAbsolutePath().replace("bin","")+"conf\\setting.properties";        //プロパティファイルパス
			scale = Integer.valueOf(args[2]);        //集計間隔（1=1分, 2=10分, 3=60分）
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ERROR：読み込むログファイルのパスが空です。入力してください。");
			System.exit(0);
		}

		//プロパティファイルの読込み
		Properties properties = new Properties();
		try {
			properties.load(Files.newBufferedReader(Paths.get(prfile), StandardCharsets.UTF_8));
		} catch (IOException e) {
			System.out.println(String.format("ERROR：ファイルの読み込みに失敗しました。ファイル名:%s", prfile));
			System.exit(0);
		}
		//プロパティファイルからreadMinuteのvalue（ログファイルを何秒間読み込むか）を読み込む
		int startMinute = 0;
		int endMinute = 0;
		try {
			startMinute = getMinute(Integer.valueOf(properties.getProperty("startTime", "23:59").substring(0,2)),Integer.valueOf(properties.getProperty("startTime", "23:59").substring(3,5)));
			if(startMinute > 86400) {
				System.out.println("WARNING：プロパティファイルのキー値:startTimeには23:59以下の数値を設定してください。");
				System.exit(0);
			}
			endMinute = getMinute(Integer.valueOf(properties.getProperty("endTime", "23:59").substring(0,2)),Integer.valueOf(properties.getProperty("endTime", "23:59").substring(3,5)))+59;
			if(endMinute > 86400) {
				System.out.println("WARNING：プロパティファイルのキー値:endTimeには23:59以下の数値を設定してください。");
				System.exit(0);
			}
		}catch (NumberFormatException e) {
			System.out.println("ERROR：プロパティファイルのキー値に誤りがあります。確認してください。");
			System.exit(0);
		}

		ArrayList<String> searchWordList = new ArrayList<String>();         //検索する文字列のリスト
		searchWordList.add("AUCBOT");        //検索する文字列をリストに追加
		searchWordList.add("AUCSTR");
		searchWordList.add("AUCEND");
		searchWordList.add("AUCIC");
		searchWordList.add("AUCDRI");
		searchWordList.add("AUCUNS");
		searchWordList.add("AUCSTS");
		searchWordList.add("AUCARA");
		searchWordList.add("AUCEVE");
		searchWordList.add("AUCSEN");
		searchWordList.add("AUCVID");
		searchWordList.add("ADXVID");
		searchWordList.add("BUXVID");
		searchWordList.add("CDCVID");
		searchWordList.add("CUCVID");
		searchWordList.add("ADXDRI");
		searchWordList.add("BUXDRI");
		searchWordList.add("ADXRGG");
		searchWordList.add("BUXRGG");
		searchWordList.add("ADCRGS");
		searchWordList.add("DDCRGS");
		searchWordList.add("ADCDNS");
		searchWordList.add("ADXPRG");
		searchWordList.add("BUXPRG");
		searchWordList.add("ADCPRS");
		searchWordList.add("ADXMSG");
		searchWordList.add("BUXMSG");
		searchWordList.add("AUCCFM");
		searchWordList.add("OK");
		searchWordList.add("ER");
		searchWordList.add("AUCOSP");
		searchWordList.add("ADXLOG");
		searchWordList.add("BUXLOG");
		searchWordList.add("CDCLOG");
		searchWordList.add("CUCLOG");
		searchWordList.add("ADCFIM");
		searchWordList.add("AUCEXS");
		searchWordList.add("AUCXEV");
		searchWordList.add("ADXSDG");
		searchWordList.add("BUXSDG");
		searchWordList.add("ADCSDS");
		searchWordList.add("CDCPBS");
		searchWordList.add("CUCPBS");
		searchWordList.add("AUCPBC");
		searchWordList.add("AUCREM");
		searchWordList.add("CDCREQ");
		searchWordList.add("CUCREQ");


		ArrayList<int[]> countList = new ArrayList<int[]>();	//検索文字列が合致した回数が記載されているリスト

		//カウントメソッドを実行
		countType(infile, searchWordList, countList, startMinute, endMinute, scale);
		//ファイル出力メソッドを実行
		writeText(outfile, searchWordList, countList, startMinute,scale);
		long endTime = System.currentTimeMillis();
		System.out.println("");
		System.out.println("処理時間：" + (endTime - startTime) + "ms");
	}

	//ファイルを1行ずつ読み込み、検索文字列があった場合はカウンタ変数(=第3引数)を+1する
	//第1引数：読み込むファイル名
	//第2引数：検索する文字列
	//第3引数：カウンタ用の変数
	//第4引数：ログファイルを読込み開始時間（単位：秒）
	//第5引数：ログファイルを読込み終了時間（単位：秒）
	//第6引数：集計間隔
	static void countType(String filename, ArrayList<String> wordlist, ArrayList<int[]> countlist, int startMinute, int endMinute, int scale) {
		if(startMinute > endMinute) {
			System.out.println("WARNING：プロパティファイルのキー値:startTimeがキー値:endTimeより大きいです。確認してください。");
		}
		try {
			//ファイルを読み込む
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);

			//条件に合う行があった場合、第3引数を+1
			String line;     //読込む文字列
			int sum = 0;   //行数をカウント
			int timeStart = 0;      //開始時の秒数
			int timeNow = 0;      //読込んだ行の秒数
			int timeScale = 0;	//集計間隔用の秒数
			int flg = 0;
			int count[] = null;	//検索文字列が合致した回数が記載されている配列
			int scaleList[] = {60,600,3600};	//集計間隔（1分,10分,60分）
			while ((line = br.readLine()) != null) {
				sum++;
				try {
					if(flg == 0) {  //開始時の秒数を記録しておく
						timeStart = getMinute(Integer.valueOf(line.substring(11,13)), Integer.valueOf(line.substring(14,16)));
						if(startMinute <= timeStart) {
							timeScale = timeStart + scaleList[scale-1];
							count = new int[wordlist.size()];
							for(int i=0; i<wordlist.size(); i++) {
								count[i] = 0;
							}
							flg = 1;
						}
					}
					timeNow = getMinute(Integer.valueOf(line.substring(11,13)), Integer.valueOf(line.substring(14,16))) - timeStart;
					//現在の行の時間(秒)-開始時の時間(秒)
					//プロパティで設定した秒数以内の時、読み込んだ行に対して文字の検索を行う
					if(startMinute <= timeNow && endMinute >= timeNow){
						if(timeScale <= timeNow) {	//集計間隔(timeScale)を超過した場合、集計結果リスト(countlist)に集計結果(count)を追加する
							countlist.add(count);
							count = new int[wordlist.size()];
							for(int i=0; i<wordlist.size(); i++) {
								count[i] = 0;
							}
							timeScale = timeScale + scaleList[scale-1];
						}
						for(int i = 0; i < wordlist.size(); i++) {
							Pattern p = Pattern.compile("teleMsgId=\\[" + wordlist.get(i) + "]");
							Matcher m = p.matcher(line + ":");
							if (m.find()){
								count[i] = count[i] + 1;
							}
						}
					}
				}catch(NumberFormatException e) {
					System.out.println("WARNING：" + sum + "行目のログにフォーマット誤りがあります。確認してください。");
				}catch(StringIndexOutOfBoundsException e) {
					System.out.println("WARNING：" + sum + "行目のログにフォーマット誤りがあります。確認してください。");
				}
			}
			countlist.add(count);
			br.close();
			fr.close();
		}catch (IOException e) {
			System.out.println(String.format("ERROR：ファイルの読み込みに失敗しました。ファイル名:%s", filename));
			System.exit(0);
		}
	}

	//カウントした種別をテキストに出力するメソッド
	//第1引数：出力するファイル名
	//第2引数：書き込む文字列リスト
	//第3引数：集計結果リスト
	//第4引数：開始時間秒数
	//第5引数：集計間隔
	static void writeText(String filename, ArrayList<String> list, ArrayList<int[]> count, int startMinute, int scale) {
		int scaleList[] = {60,600,3600};	//集計間隔（1分,10分,60分）
		int value[] = new int[list.size()];
		try {
			FileWriter fw = new FileWriter(filename,true);
			for(int i = 0; i < count.size(); i++) {
				fw.write("\t" + getMinuteFormat(startMinute+(scaleList[scale-1]*i)));
			}
			fw.write("\n");
			for(int i = 0; i < list.size(); i++) {
				fw.write(list.get(i) + "\t");
				for(int j = 0; j < count.size(); j++) {
					value = count.get(j);
					fw.write(value[i] + "\t");
				}
				fw.write("\n");
			}
			fw.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	//yyyyMMddHHmmss形式の日付を取得するメソッド
	static String getDate() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		return sdf.format(cal.getTime());
	}

	//HH:mm:ss→秒に変換するメソッド
	static int getMinute(int hour, int minute) {
		return hour*3600 + minute*60;
	}

	//秒→HH:mmに変換するメソッド
	static String getMinuteFormat(int min) {
		return String.format("%02d",min/3600) + "：" + String.format("%02d",(min%3600)/60);
	}
}
