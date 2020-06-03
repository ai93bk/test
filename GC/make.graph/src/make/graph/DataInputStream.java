package make.graph;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataInputStream {
	ArrayList<Data> list = new ArrayList<Data>();
	String path = new File("").getAbsolutePath().replace("bin","")+"in\\data.log";

	public ArrayList<Data> getData(){
		try {
	        // 1.ファイルのパスを指定する
	        File file = new File(path);

	        // 2.ファイルが存在しない場合に例外が発生するので確認する
	        if (!file.exists()) {
	            System.out.print("/inにログファイルdata.logが存在しません\n");
	            System.exit(0);
	        }

	        // 3.FileReaderクラスとreadメソッドを使って1文字ずつ読み込み表示する
	        BufferedReader br = new BufferedReader(new FileReader(file));

	        String line;
	        // 1行ずつCSVファイルを読み込む
	        while ((line = br.readLine()) != null) {
	          String[] lines = line.split(",", 0); // 行をカンマ区切りで配列に変換
		      Data data = new Data();
	          data.setX(lines[0]);
	          data.setY(lines[1]);
	          list.add(data);
	        }

	        // 4.最後にファイルを閉じてリソースを開放する
	        br.close();

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
		return list;
	}

}
