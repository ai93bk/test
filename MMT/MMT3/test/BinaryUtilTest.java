import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.nio.charset.StandardCharsets;

import org.junit.Test;

/***
 *<pre>
 *BinryUtilのテスト用クラス
 *BinryUtil=readしたString文字をbinary文字に変換するクラス
 *</pre>
 */
public class BinaryUtilTest {
	BinaryUtil bu = new BinaryUtil();
	byte[] b1 = "10".getBytes(StandardCharsets.UTF_8);
	byte b2 = 10;


	/***
	 * <pre>
	 * getCheckCode計算結果が期待値するチェックコードの値と合致するか
	 * IN(引数)	byte配列:UTF-8文字"10"をキャスト変換した値
	 * OUT(期待値)	文字列"35"(byteを文字列にキャストした値)
	 * </pre>
	 */
	@Test
	public void test_getCheckCode() {
		assertThat(String.valueOf(BinaryUtil.getCheckCode(b1)),is("35"));
	}

	/***
	 * <pre>
	 * calcCRC8計算結果が期待値するチェックコードの値と合致するか
	 * IN(引数)	byte配列:UTF-8文字"10"をキャスト変換した値, byte:0, オフセット値:0, byte配列の長さ
	 * OUT(期待値)	文字列"35"(byteを文字列にキャストした値)
	 * </pre>
	 */
	@Test
	public void test1_calcCRC8() {
		byte crc=0;
		assertThat(String.valueOf(BinaryUtil.calcCRC8(b1,crc,0,b1.length-1)),is("35"));
	}

	/***
	 * <pre>
	 * calcCRC8計算結果が期待値するチェックコードの値と合致するか
	 * IN(引数)	byte:1,byte:0
	 * OUT(期待値)	文字列"35"(byteを文字列にキャストした値)
	 * </pre>
	 */
	@Test
	public void test2_calcCRC8() {
		assertThat(String.valueOf(BinaryUtil.calcCRC8(b2,0)),is("86"));
	}
}
