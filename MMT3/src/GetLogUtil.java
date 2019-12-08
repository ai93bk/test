
public class GetLogUtil {
	public GetLogUtil() {

	}

	String getErrorLog() {
		String str="[E020001システムエラーが発生しました";

		return str;
	}

	String getWarnLog(int i) {
		String str = "";
		switch(i) {
		case 2:
			str="[W010002]既に実行しているため多重実行できません";
			break;
		case 3:
			str="[W010003]プロパティファイルが存在しません";
			break;
		case 4:
			str="[W010004]プロパティファイル中の設定事項に誤りがあります";
			break;
		case 5:
			str="[W010005]ディスク容量がいっぱいのため実行できません";
			break;
		case 6:
			str="[W020006]ディレクトリが存在しません";
			break;
		case 7:
			str="[W020007]ディレクトリ内にCSVファイルが存在しません";
			break;
		case 8:
			str="[W020008]CSVファイルの読み込みに失敗しました";
			break;
		case 9:
			str="[W020009]必須項目チェックエラーが発生しました";
			break;
		case 10:
			str="[W020010]桁数チェックエラーが発生しました";
			break;
		case 11:
			str="[W020011]フォーマットチェックエラーが発生しました";
			break;
		case 12:
			str="[W020012]CSVファイル中の要素に誤りがあります";
			break;
		case 13:
			str="[W020013]CSVファイルのレコード数が規定(600行)と異なるためDATファイルの生成を中断します";
			break;
		default:
			break;
		}
		return str;
	}
	String getInfoLog(int i) {
		String str="";
		switch(i) {
			case 14:
				str="[I010014]開始：Bash/Shell";
				break;
			case 15:
				str="[I010015]終了：Bash/Shell";
				break;
			case 16:
				str="[I020016]開始：javaプログラム";
				break;
			case 17:
				str="[I020017]終了：javaプログラム";
				break;
			case 18:
				str="[I020018]開始：CSVファイル読込み";
				break;
			case 19:
				str="[I020019]終了：CSVファイル読込み";
				break;
			case 20:
				str="[I020020]開始：DATファイル生成";
				break;
			case 21:
				str="[I020021]終了：DATファイル生成";
				break;
			default:
				break;
		}
		return str;
	}
}
