package datmaker.plusdata;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextInputStream {
	String str = "";
	String path = new File("").getAbsolutePath().replace("bin","")+"in\\base.txt";

	public String readText() {
	    try {
	        // 1.ファイルのパスを指定する
	        File file = new File(path);

	        // 2.ファイルが存在しない場合に例外が発生するので確認する
	        if (!file.exists()) {
	            System.out.print("ファイルが存在しません");
	            System.exit(0);
	        }

	        // 3.FileReaderクラスとreadメソッドを使って1文字ずつ読み込み表示する
	        FileReader fileReader = new FileReader(file);
	        int data;
	        while ((data = fileReader.read()) != -1) {
	            str = Integer.toString(data);
	        }

	        // 4.最後にファイルを閉じてリソースを開放する
	        fileReader.close();

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
		return str;
	}
}
