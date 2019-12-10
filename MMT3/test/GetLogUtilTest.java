import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class GetLogUtilTest {

	@Test
	public void testGetErrorLog() {
		GetLogUtil glu = new GetLogUtil();
		String test = glu.getErrorLog();
		assertThat(test,is("[E020001システムエラーが発生しました"));
	}

	@Test
	public void testGetWarnLog() {
		GetLogUtil glu = new GetLogUtil();
		String t1 = glu.getWarnLog(1);
		String t2 = glu.getWarnLog(2);
		String t3 = glu.getWarnLog(3);
		String t4 = glu.getWarnLog(4);
		String t5 = glu.getWarnLog(5);
		String t6 = glu.getWarnLog(6);
		String t7 = glu.getWarnLog(7);
		String t8 = glu.getWarnLog(8);
		String t9 = glu.getWarnLog(9);
		String t10 = glu.getWarnLog(10);
		String t11 = glu.getWarnLog(11);
		String t12 = glu.getWarnLog(12);
		String t13 = glu.getWarnLog(13);
		assertThat(t1,is(""));
		assertThat(t2,is("[W010002]既に実行しているため多重実行できません"));
		assertThat(t3,is("[W010003]プロパティファイルが存在しません"));
		assertThat(t4,is("[W010004]プロパティファイル中の設定事項に誤りがあります"));
		assertThat(t5,is("[W010005]ディスク容量がいっぱいのため実行できません"));
		assertThat(t6,is("[W020006]ディレクトリが存在しません"));
		assertThat(t7,is("[W020007]ディレクトリ内にCSVファイルが存在しません"));
		assertThat(t8,is("[W020008]CSVファイルの読み込みに失敗しました"));
		assertThat(t9,is("[W020009]必須項目チェックエラーが発生しました"));
		assertThat(t10,is("[W020010]桁数チェックエラーが発生しました"));
		assertThat(t11,is("[W020011]フォーマットチェックエラーが発生しました"));
		assertThat(t12,is("[W020012]CSVファイル中の要素に誤りがあります"));
		assertThat(t13,is("[W020013]CSVファイルのレコード数が規定(600行)と異なるためDATファイルの生成を中断します"));
	}

	@Test
	public void testGetInfoLog() {
		GetLogUtil glu = new GetLogUtil();
		String t1 = glu.getInfoLog(1);
		String t2 = glu.getInfoLog(14);
		String t3 = glu.getInfoLog(15);
		String t4 = glu.getInfoLog(16);
		String t5 = glu.getInfoLog(17);
		String t6 = glu.getInfoLog(18);
		String t7 = glu.getInfoLog(19);
		String t8 = glu.getInfoLog(20);
		String t9 = glu.getInfoLog(21);
		assertThat(t1,is(""));
		assertThat(t2,is("[I010014]開始：Bash/Shell"));
		assertThat(t3,is("[I010015]終了：Bash/Shell"));
		assertThat(t4,is("[I020016]開始：javaプログラム"));
		assertThat(t5,is("[I020017]終了：javaプログラム"));
		assertThat(t6,is("[I020018]開始：CSVファイル読込み"));
		assertThat(t7,is("[I020019]終了：CSVファイル読込み"));
		assertThat(t8,is("[I020020]開始：DATファイル生成"));
		assertThat(t9,is("[I020021]終了：DATファイル生成"));
	}
}
