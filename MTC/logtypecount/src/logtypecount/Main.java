package logtypecount;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		String infile = args[0];	//読み込むファイルパス
		String outfile = new File("").getAbsolutePath().replace("bin","")+"out\\"+getDate() + ".txt";	//出力ファイルパス
		writeText(outfile,"msgID={abc}：" + countType(infile,"msgID=\\{abc}"));
		writeText(outfile,"msgID={abc}：" + countType(infile,"msgID=\\{xyz}"));
	}

	//ファイルを1行ずつ読み込み、検索文字列があった場合はカウンタ変数(sum)を+1する
	//第1引数：読み込むファイル名
	//第2引数：検索する文字列
	static int countType(String filename, String searchword) {
		int	sum = 0;
		try {
	        //ファイルを読み込む
	        FileReader fr = new FileReader(filename);
	        BufferedReader br = new BufferedReader(fr);

	        //条件に合う行があった場合、第3引数を+1
	        String line;
	        while ((line = br.readLine()) != null) {
	          Pattern p = Pattern.compile(searchword);
	          Matcher m = p.matcher(line);

	          if (m.find()){
	        	  sum++;
	          }
	        }

	        br.close();
	        fr.close();

	    } catch (IOException ex) {
	        ex.printStackTrace();
	    }
		return sum;
	}

	//カウントした種別をテキストに出力するメソッド
	//第1引数：出力するファイル名
	//第2引数：書き込む文字列
	static void writeText(String file, String str) {
		try {
            FileWriter fw = new FileWriter(file,true);
            fw.write(str+"\n");
            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
	}

	static //yyyyMMddhhmmss形式の日付を取得するメソッド
	String getDate() {
		Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
        return sdf.format(cal.getTime());
	}
}