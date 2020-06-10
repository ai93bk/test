package make.graph;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@SuppressWarnings("unchecked")
	@Override public void start(Stage stage) {
		// ■プロパティファイルの読み込み
		// プロパティファイルには画面サイズ(幅・高さ)とY軸(min,max)を定義する
		Properties properties = new Properties();
		String strpass = new File("").getAbsolutePath().replace("bin","")+"conf\\setting.properties";
		try {
            InputStream istream = new FileInputStream(strpass);
            properties.load(istream);
        } catch (IOException e) {
            System.out.print("/confにプロパティファイルsetting.propertiesが存在しません\n");
            System.exit(0);
        }

		// ■X軸とY軸の設定
		CategoryAxis xAxis = new CategoryAxis(); // X座標の値
		NumberAxis yAxis;
		if(properties.getProperty("y_min").isEmpty() || properties.getProperty("y_max").isEmpty()) {
			yAxis = new NumberAxis(); // Y座標の値(最小値・最大値はjavafxにお任せ)
		}else {
			yAxis = new NumberAxis(Integer.valueOf(properties.getProperty("y_min")),Integer.valueOf(properties.getProperty("y_max")),10); // Y座標の値(最小値・最大値はプロパティから読み込み)
		}
		try {
			yAxis.setLabel(new String(properties.getProperty("y_label","").getBytes("8859_1"), "UTF-8"));
		} catch (UnsupportedEncodingException e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		} // ☆Y軸のラベルを設定


		// ■エリアグラフを作成
		AreaChart<String, Number> areaChart = new AreaChart<>(xAxis, yAxis);
		areaChart.setTitle("");	//☆グラフのタイトル
		//XYChart.Series<String,Number> series= new XYChart.Series<String,Number>();
        //series.setName("");	//☆数式のタイトル
        ObservableList<XYChart.Data<String, Number>> list = FXCollections.observableArrayList();
        int num = 1;
        String path = new File("").getAbsolutePath().replace("bin","")+"in\\data.log";

        try {
	        File file = new File(path);	// 1.ファイルのパスを指定する

	        if (!file.exists()) {	// 2.ファイルが存在しない場合に例外が発生するので確認する
	            System.out.print("/inにログファイルdata.logが存在しません\n");
	            System.exit(0);
	        }

	        BufferedReader br = new BufferedReader(new FileReader(file));	// 3.FileReaderクラスとreadメソッドを使って1文字ずつ読み込み表示する

	        String line;
	        while ((line = br.readLine()) != null) {	// 1行ずつCSVファイルを読み込む
	          String[] lines = line.split(",", 0); // 行をカンマ区切りで配列に変換
	          if(lines.length != 2) {
	        	  System.out.println(num + "行目が不正です");
	          }
	          try {
	        	  Float.valueOf(lines[1]);
	          }catch (NumberFormatException e) {
		        	  System.out.println(num + "行目が不正です");
	          }catch (ArrayIndexOutOfBoundsException e) {
	        	  System.out.println(num + "行目が不正です");
	          }
	          list.add(new XYChart.Data<String,Number>(lines[0], Float.valueOf(lines[1])));
	        }
	        br.close();	// 4.最後にファイルを閉じてリソースを開放する
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
        XYChart.Series<String,Number> series = new XYChart.Series<String,Number>(list);
		areaChart.getData().addAll(series); // エリアグラフにデータ(series)を追加

		// ■グラフの描画
		// 画面サイズの設定
		Scene scene;
		scene = new Scene(areaChart,Integer.valueOf(properties.getProperty("length","1000")), Integer.valueOf(properties.getProperty("width","500"))); //画面サイズを設定(プロパティファイルから値読込み)
		stage.setScene(scene); // Sceneを追加
		stage.show(); // ウィンドウを表示
	}
}