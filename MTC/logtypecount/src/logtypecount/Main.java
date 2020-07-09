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

		String infile = args[0];	//読み込むファイルパス
		String outfile = new File("").getAbsolutePath().replace("bin","")+"out\\"+getDate() + ".txt";	//出力ファイルパス
		String prfile = new File("").getAbsolutePath().replace("bin","")+"conf\\setting.properties";	//プロパティファイルパス

		//プロパティファイルの読込み
		Properties properties = new Properties();
		try {
			properties.load(Files.newBufferedReader(Paths.get(prfile), StandardCharsets.UTF_8));
		} catch (IOException e) {
			System.out.println(String.format("ファイルの読み込みに失敗しました。ファイル名:%s", prfile));
		}
		//プロパティファイルからreadMinuteのvalue（ログファイルを何秒間読み込むか）を読み込む
		int minute = 0;
		try {
			minute = Integer.valueOf(properties.getProperty("readMinute", "86400"));
			if(minute > 86400) {
				System.out.println("プロパティファイルのキー値:readMinuteには86400以下の数値を設定してください。");
				System.exit(0);
			}
		}catch (NumberFormatException e) {
			System.out.println("プロパティファイルのキー値:readMinuteには整数値を設定してください。");
			System.exit(0);
		}

		ArrayList<String> searchWordList = new ArrayList<String>();	//検索する文字列のリスト
		searchWordList.add("AUCBOT");	//検索する文字列をリストに追加
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
		searchWordList.add("ADXDRI");
		searchWordList.add("BUXDRI");
		searchWordList.add("ADXRGG");
		searchWordList.add("BUXRGG");
		searchWordList.add("ADCRGS");
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
		searchWordList.add("ADCFIM");
		searchWordList.add("AUCREM");
		searchWordList.add("ADXAVI");
		searchWordList.add("BUXAVI");

		int countList[] =  new int[searchWordList.size()];	//検索文字列が合致した回数が記載されている配列
		for(int i = 0; i < countList.length; i++) {		//初期化
			countList[i] = 0;
		}

		//カウントメソッドを実行
		countType(infile, searchWordList, countList, minute);
		//ファイル出力メソッドを実行
		writeText(outfile, searchWordList, countList);
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}

	//ファイルを1行ずつ読み込み、検索文字列があった場合はカウンタ変数(=第3引数)を+1する
	//第1引数：読み込むファイル名
	//第2引数：検索する文字列
	//第3引数：カウンタ用の変数
	//第4引数：ログファイルを読み込む時間（単位：秒）
	static void countType(String filename, ArrayList<String> list, int[] count, int minute) {
		try {
			//ファイルを読み込む
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);	//条件に合う行があった場合、第3引数を+1
			String line;
			while ((line = br.readLine()) != null) {
				//プロパティで設定した秒数以内の時、読み込んだ行に対して文字の検索を行う
				if(minute >= (Integer.valueOf(line.substring(11,13))*3600 + Integer.valueOf(line.substring(14,16))*60 + Integer.valueOf(line.substring(17,19)))){
					for(int i = 0; i < list.size(); i++) {
						Pattern p = Pattern.compile("teleMsgId=\\[" + list.get(i) + "]");
						Matcher m = p.matcher(line);
						if (m.find()){
							count[i] = count[i] + 1;
						}
					}
				}
			}
			br.close();
			fr.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	//カウントした種別をテキストに出力するメソッド
	//第1引数：出力するファイル名
	//第2引数：書き込む文字列
	static void writeText(String filename, ArrayList<String> list, int[] count) {
		try {
			FileWriter fw = new FileWriter(filename,true);
			for(int i = 0; i < list.size(); i++) {
				fw.write(list.get(i) + "\t：" + count[i] + "\n");
			}

			fw.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	//yyyyMMddhhmmss形式の日付を取得するメソッド
	static String getDate() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
		return sdf.format(cal.getTime());
	}

}
