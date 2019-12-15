import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

/**<pre>
 *GetLogUtilのテスト用クラス
 *GetLogUtil=整数値の引数をもとにログの文字列を返却するクラス
 </pre>*/
public class GetLogUtilTest {
	GetLogUtil glu = new GetLogUtil();


	/**<pre>
	 * <pre>
	 * 引数をもとに期待するログが返却されるか
	 * IN(引数)	なし
	 * OUT(期待値)	[E020001]errorログ
	 * </pre>
	 </pre>*/
	@Test
	public void errortest1() {
		assertThat(glu.getErrorLog(),is("[E020001]システムエラーが発生しました"));
	}

	/**<pre>
	 * <pre>
	 * 引数をもとに期待するログが返却されるか
	 * IN(引数)	整数値2
	 * OUT(期待値)	[W010002]warnログ
	 * </pre>
	 </pre>*/
	@Test
	public void warntest1() {
		assertThat(glu.getWarnLog(2),is("[W010002]既に実行しているため多重実行できません"));
	}

	/**<pre>
	 * <pre>
	 * 引数をもとに期待するログが返却されるか
	 * IN(引数)	整数値3
	 * OUT(期待値)	[W010003]warnログ
	 * </pre>
	 </pre>*/
	@Test
	public void warntest2() {
		assertThat(glu.getWarnLog(3),is("[W010003]プロパティファイルが存在しません"));
	}

	/**<pre>
	 * <pre>
	 * 引数をもとに期待するログが返却されるか
	 * IN(引数)	整数値4
	 * OUT(期待値)	[W010004]warnログ
	 * </pre>
	 </pre>*/
	@Test
	public void warntest3() {
		assertThat(glu.getWarnLog(4),is("[W010004]プロパティファイル中の設定事項に誤りがあります"));
	}

	/**<pre>
	 * <pre>
	 * 引数をもとに期待するログが返却されるか
	 * IN(引数)	整数値5
	 * OUT(期待値)	[W010005]warnログ
	 * </pre>
	 </pre>*/
	@Test
	public void warntest4() {
		assertThat(glu.getWarnLog(5),is("[W010005]ディスク容量がいっぱいのため実行できません"));
	}
	/**<pre>
	 * <pre>
	 * 引数をもとに期待するログが返却されるか
	 * IN(引数)	整数値6
	 * OUT(期待値)	[W020006]warnログ
	 * </pre>
	 </pre>*/
	@Test
	public void warntest5() {
		assertThat(glu.getWarnLog(6),is("[W020006]ディレクトリが存在しません"));
	}

	/**<pre>
	 * <pre>
	 * 引数をもとに期待するログが返却されるか
	 * IN(引数)	整数値7
	 * OUT(期待値)	[W020007]warnログ
	 * </pre>
	 </pre>*/
	@Test
	public void warntest6() {
		assertThat(glu.getWarnLog(7),is("[W020007]ディレクトリ内にCSVファイルが存在しません"));
	}

	/**<pre>
	 * <pre>
	 * 引数をもとに期待するログが返却されるか
	 * IN(引数)	整数値8
	 * OUT(期待値)	[W020008]warnログ
	 * </pre>
	 </pre>*/
	@Test
	public void warntest7() {
		assertThat(glu.getWarnLog(8),is("[W020008]CSVファイルの読み込みに失敗しました"));
	}

	/**<pre>
	 * <pre>
	 * 引数をもとに期待するログが返却されるか
	 * IN(引数)	整数値9
	 * OUT(期待値)	[W020009]warnログ
	 * </pre>
	 </pre>*/
	@Test
	public void warntest8() {
		assertThat(glu.getWarnLog(9),is("[W020009]必須項目チェックエラーが発生しました"));
	}

	/**<pre>
	 * <pre>
	 * 引数をもとに期待するログが返却されるか
	 * IN(引数)	整数値10
	 * OUT(期待値)	[W020010]warnログ
	 * </pre>
	 </pre>*/
	@Test
	public void warntest9() {
		assertThat(glu.getWarnLog(10),is("[W020010]桁数チェックエラーが発生しました"));
	}

	/**<pre>
	 * 引数をもとに期待するログが返却されるか
	 * IN(引数)	整数値11
	 * OUT(期待値)	[W020011]warnログ
	 </pre>*/
	@Test
	public void warntest10() {
		assertThat(glu.getWarnLog(11),is("[W020011]フォーマットチェックエラーが発生しました"));
	}

	/**<pre>
	 * 引数をもとに期待するログが返却されるか
	 * IN(引数)	整数値12
	 * OUT(期待値)	[W020012]warnログ
	 </pre>*/
	@Test
	public void warntest11() {
		assertThat(glu.getWarnLog(12),is("[W020012]CSVファイル中の要素に誤りがあります"));
	}

	/**<pre>
	 * 引数をもとに期待するログが返却されるか
	 * IN(引数)	整数値13
	 * OUT(期待値)	[W020013]warnログ
	 </pre>*/
	@Test
	public void warntest12() {
		assertThat(glu.getWarnLog(13),is("[W020013]CSVファイルのレコード数が規定(600行)と異なるためDATファイルの生成を中断します"));
	}

	/**<pre>
	 * 規定範囲外の引数を渡した際期待するエラーハンドリングがされるか
	 * IN(引数)	整数値1(規定範囲外)
	 * OUT(期待値)	空白文字
	 </pre>*/
	@Test
	public void warntest13() {
		assertThat(glu.getWarnLog(1),is(""));
	}

	/**<pre>
	 * 規定範囲外の引数を渡した際期待するエラーハンドリングがされるか
	 * IN(引数)	整数値-1(規定範囲外)
	 * OUT(期待値)	空白文字
	 </pre>*/
	@Test
	public void warntest14() {
		assertThat(glu.getWarnLog(-1),is(""));
	}


	/**<pre>
	 * 引数をもとに期待するログが返却されるか
	 * IN(引数)	整数値14
	 * OUT(期待値)	[I010014]infoログ
	 </pre>*/
	@Test
	public void infotest1() {
		assertThat(glu.getInfoLog(14),is("[I010014]開始：Bash/Shell"));
	}

	/**<pre>
	 * 引数をもとに期待するログが返却されるか
	 * IN(引数)	整数値15
	 * OUT(期待値)	[I010015]infoログ
	 </pre>*/
	@Test
	public void infotest2() {
		assertThat(glu.getInfoLog(15),is("[I010015]終了：Bash/Shell"));
	}

	/**<pre>
	 * 引数をもとに期待するログが返却されるか
	 * IN(引数)	整数値16
	 * OUT(期待値)	[I020016]infoログ
	 </pre>*/
	@Test
	public void infotest3() {
		assertThat(glu.getInfoLog(16),is("[I020016]開始：javaプログラム"));
	}

	/**<pre>
	 * 引数をもとに期待するログが返却されるか
	 * IN(引数)	整数値17
	 * OUT(期待値)	[I020017]infoログ
	 </pre>*/
	@Test
	public void infotest4() {
		assertThat(glu.getInfoLog(17),is("[I020017]終了：javaプログラム"));
	}
	/**<pre>
	 * 引数をもとに期待するログが返却されるか
	 * IN(引数)	整数値18
	 * OUT(期待値)	[I020018]infoログ
	 </pre>*/
	@Test
	public void infotest5() {
		assertThat(glu.getInfoLog(18),is("[I020018]開始：CSVファイル読込み"));
	}

	/**<pre>
	 * 引数をもとに期待するログが返却されるか
	 * IN(引数)	整数値19
	 * OUT(期待値)	[I020019]infoログ
	 </pre>*/
	@Test
	public void infotest6() {
		assertThat(glu.getInfoLog(19),is("[I020019]終了：CSVファイル読込み"));
	}

	/**<pre>
	 * 引数をもとに期待するログが返却されるか
	 * IN(引数)	整数値20
	 * OUT(期待値)	[I020020]infoログ
	 </pre>*/
	@Test
	public void infotest7() {
		assertThat(glu.getInfoLog(20),is("[I020020]開始：DATファイル生成"));
	}

	/**<pre>
	 * 引数をもとに期待するログが返却されるか
	 * IN(引数)	整数値21
	 * OUT(期待値)	[I020021]infoログ
	 </pre>*/
	@Test
	public void infotest8() {
		assertThat(glu.getInfoLog(21),is("[I020021]終了：DATファイル生成"));
	}

	/**<pre>
	 * 規定範囲外の引数を渡した際期待するエラーハンドリングがされるか
	 * IN(引数)	整数値1(規定範囲外)
	 * OUT(期待値)	空白文字
	 </pre>*/
	@Test
	public void errortest9() {
		assertThat(glu.getInfoLog(1),is(""));
	}

	/**<pre>
	 * 規定範囲外の引数を渡した際期待するエラーハンドリングがされるか
	 * IN(引数)	整数値-1(規定範囲外)
	 * OUT(期待値)	空白文字
	 </pre>*/
	@Test
	public void errortest10() {
		assertThat(glu.getInfoLog(-1),is(""));
	}
}
