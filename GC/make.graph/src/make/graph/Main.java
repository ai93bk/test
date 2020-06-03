package make.graph;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

import javafx.application.Application;
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
		yAxis.setLabel("%"); // ☆Y軸のラベルを設定

		// ■エリアグラフを作成
		AreaChart<String, Number> areaChart = new AreaChart<>(xAxis, yAxis);
		areaChart.setTitle("");	//☆グラフのタイトル
		XYChart.Series<String,Number> series= new XYChart.Series<String,Number>();
        series.setName("");	//☆数式のタイトル
        ArrayList<Data> list = new DataInputStream().getData();
        for(int i=0; i<list.size(); i++) {
        	Data d = list.get(i);
        	series.getData().add(new XYChart.Data<String,Number>(d.getX(), Float.valueOf(d.getY())));	//logファイルから読み込んだ数値をseriesに設定
        }
		areaChart.getData().add(series); // エリアグラフにデータ(series)を追加

		// ■グラフの描画
		// 画面サイズの設定
		Scene scene;
		if(properties.getProperty("length").isEmpty() || properties.getProperty("width").isEmpty()) {
			scene = new Scene(areaChart,1000, 500); //画面サイズを設定(デフォルト値)
		}else {
			scene = new Scene(areaChart,Integer.valueOf(properties.getProperty("length")), Integer.valueOf(properties.getProperty("width"))); //画面サイズを設定(プロパティファイルから値読込み)
		}
		stage.setScene(scene); // Sceneを追加
		stage.show(); // ウィンドウを表示
	}
}