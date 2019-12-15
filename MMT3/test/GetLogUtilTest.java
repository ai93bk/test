import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class GetLogUtilTest {
	GetLogUtil glu = new GetLogUtil();


	/**
	 * 引数をもとに期待するログが返却されるか
	 * IN	なし
	 * OUT	[E020001]errorログ
	 */
	@Test
	public void errortest1() {
		assertThat(glu.getErrorLog(),is("[E020001]システムエラーが発生しました"));
	}

	/**
	 * 引数をもとに期待するログが返却されるか
	 * IN	整数値2
	 * OUT	[W010002]warnログ
	 */
	@Test
	public void warntest1() {
		assertThat(glu.getWarnLog(2),is("[W010002]既に実行しているため多重実行できません"));
	}

	/**
	 * 引数をもとに期待するログが返却されるか
	 * IN	整数値3
	 * OUT	[W010003]warnログ
	 */
	@Test
	public void warntest2() {
		assertThat(glu.getWarnLog(3),is("[W010003]プロパティファイルが存在しません"));
	}

	/**
	 * 引数をもとに期待するログが返却されるか
	 * IN	整数値4
	 * OUT	[W010004]warnログ
	 */
	@Test
	public void warntest3() {
		assertThat(glu.getWarnLog(4),is("[W010004]プロパティファイル中の設定事項に誤りがあります"));
	}

	/**
	 * 引数をもとに期待するログが返却されるか
	 * IN	整数値5
	 * OUT	[W010005]warnログ
	 */
	@Test
	public void warntest4() {
		assertThat(glu.getWarnLog(5),is("[W010005]ディスク容量がいっぱいのため実行できません"));
	}
	/**
	 * 引数をもとに期待するログが返却されるか
	 * IN	整数値6
	 * OUT	[W020006]warnログ
	 */
	@Test
	public void warntest5() {
		assertThat(glu.getWarnLog(6),is("[W020006]ディレクトリが存在しません"));
	}

	/**
	 * 引数をもとに期待するログが返却されるか
	 * IN	整数値7
	 * OUT	[W020007]warnログ
	 */
	@Test
	public void warntest6() {
		assertThat(glu.getWarnLog(7),is("[W020007]ディレクトリ内にCSVファイルが存在しません"));
	}

	/**
	 * 引数をもとに期待するログが返却されるか
	 * IN	整数値8
	 * OUT	[W020008]warnログ
	 */
	@Test
	public void warntest7() {
		assertThat(glu.getWarnLog(8),is("[W020008]CSVファイルの読み込みに失敗しました"));
	}

	/**
	 * 引数をもとに期待するログが返却されるか
	 * IN	整数値9
	 * OUT	[W020009]warnログ
	 */
	@Test
	public void warntest8() {
		assertThat(glu.getWarnLog(9),is("[W020009]必須項目チェックエラーが発生しました"));
	}

	/**
	 * 引数をもとに期待するログが返却されるか
	 * IN	整数値10
	 * OUT	[W020010]warnログ
	 */
	@Test
	public void warntest9() {
		assertThat(glu.getWarnLog(10),is("[W020010]桁数チェックエラーが発生しました"));
	}

	/**
	 * 引数をもとに期待するログが返却されるか
	 * IN	整数値11
	 * OUT	[W020011]warnログ
	 */
	@Test
	public void warntest10() {
		assertThat(glu.getWarnLog(11),is("[W020011]フォーマットチェックエラーが発生しました"));
	}

	/**
	 * 引数をもとに期待するログが返却されるか
	 * IN	整数値12
	 * OUT	[W020012]warnログ
	 */
	@Test
	public void warntest11() {
		assertThat(glu.getWarnLog(12),is("[W020012]CSVファイル中の要素に誤りがあります"));
	}

	/**
	 * 引数をもとに期待するログが返却されるか
	 * IN	整数値13
	 * OUT	[W020013]warnログ
	 */
	@Test
	public void warntest12() {
		assertThat(glu.getWarnLog(13),is("[W020013]CSVファイルのレコード数が規定(600行)と異なるためDATファイルの生成を中断します"));
	}

	/**
	 * 規定範囲外の引数を渡した際期待するエラーハンドリングがされるか
	 * IN	整数値1(規定範囲外)
	 * OUT	空白文字
	 */
	@Test
	public void warntest13() {
		assertThat(glu.getWarnLog(1),is(""));
	}

	/**
	 * 規定範囲外の引数を渡した際期待するエラーハンドリングがされるか
	 * IN	整数値-1(規定範囲外)
	 * OUT	空白文字
	 */
	@Test
	public void warntest14() {
		assertThat(glu.getWarnLog(-1),is(""));
	}


	/**
	 * 引数をもとに期待するログが返却されるか
	 * IN	整数値14
	 * OUT	[I010014]infoログ
	 */
	@Test
	public void infotest1() {
		assertThat(glu.getInfoLog(14),is("[I010014]開始：Bash/Shell"));
	}

	/**
	 * 引数をもとに期待するログが返却されるか
	 * IN	整数値15
	 * OUT	[I010015]infoログ
	 */
	@Test
	public void infotest2() {
		assertThat(glu.getInfoLog(15),is("[I010015]終了：Bash/Shell"));
	}

	/**
	 * 引数をもとに期待するログが返却されるか
	 * IN	整数値16
	 * OUT	[I020016]infoログ
	 */
	@Test
	public void infotest3() {
		assertThat(glu.getInfoLog(16),is("[I020016]開始：javaプログラム"));
	}

	/**
	 * 引数をもとに期待するログが返却されるか
	 * IN	整数値17
	 * OUT	[I020017]infoログ
	 */
	@Test
	public void infotest4() {
		assertThat(glu.getInfoLog(17),is("[I020017]終了：javaプログラム"));
	}
	/**
	 * 引数をもとに期待するログが返却されるか
	 * IN	整数値18
	 * OUT	[I020018]infoログ
	 */
	@Test
	public void infotest5() {
		assertThat(glu.getInfoLog(18),is("[I020018]開始：CSVファイル読込み"));
	}

	/**
	 * 引数をもとに期待するログが返却されるか
	 * IN	整数値19
	 * OUT	[I020019]infoログ
	 */
	@Test
	public void infotest6() {
		assertThat(glu.getInfoLog(19),is("[I020019]終了：CSVファイル読込み"));
	}

	/**
	 * 引数をもとに期待するログが返却されるか
	 * IN	整数値20
	 * OUT	[I020020]infoログ
	 */
	@Test
	public void infotest7() {
		assertThat(glu.getInfoLog(20),is("[I020020]開始：DATファイル生成"));
	}

	/**
	 * 引数をもとに期待するログが返却されるか
	 * IN	整数値21
	 * OUT	[I020021]infoログ
	 */
	@Test
	public void infotest8() {
		assertThat(glu.getInfoLog(21),is("[I020021]終了：DATファイル生成"));
	}

	/**
	 * 規定範囲外の引数を渡した際期待するエラーハンドリングがされるか
	 * IN	整数値1(規定範囲外)
	 * OUT	空白文字
	 */
	@Test
	public void errortest9() {
		assertThat(glu.getInfoLog(1),is(""));
	}

	/**
	 * 規定範囲外の引数を渡した際期待するエラーハンドリングがされるか
	 * IN	整数値-1(規定範囲外)
	 * OUT	空白文字
	 */
	@Test
	public void errortest10() {
		assertThat(glu.getInfoLog(-1),is(""));
	}
}
