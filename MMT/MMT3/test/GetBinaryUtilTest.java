import static org.junit.Assert.*;

import javax.xml.bind.DatatypeConverter;

import org.junit.jupiter.api.Test;

/***
 *<pre>
 *GetBinaryUtilのテスト用クラス
 *GetBinaryUtil=byte配列の引数をもとにチェックコード(CRC8)を算出し返却するクラス
 *</pre>
 */
public class GetBinaryUtilTest {

	GetBinaryUtil gbu = new GetBinaryUtil();
	byte[] hexstr1 = DatatypeConverter.parseHexBinary("000"+Integer.toHexString(Integer.valueOf("10")));
	byte[] hex1 = {hexstr1[1],hexstr1[0]};
	byte[] hex2 = DatatypeConverter.parseHexBinary("10");
	byte[] bcd = DatatypeConverter.parseHexBinary("10");
	byte[] str = new String("10").getBytes();


	/**
	 * <pre>
	 * 文字列(データサイズ2)から期待するバイナリ文字列(リトルエンディアン表記,下位0埋め)に変換されているか
	 * IN(引数)	文字列"10",データサイズ2
	 * OU(期待値)T	byte型配列(リトルエンディアン表記,下位0埋め)"10"
	 * </pre>
	 */
	@Test
	public void test_getHexBinary1() {
		assertArrayEquals(gbu.getHexBinary("10",2),hex1);
	}

	/**
	 * <pre>
	 ** 文字列から期待するバイナリ文字列(リトルエンディアン表記)に変換されているか
	 * IN(引数)	16進数文字列"10"
	 * OUT(期待値)	byte型配列"10"
	 * </pre>
	 */
	@Test
	public void test_getHexBinary2() {
		assertArrayEquals(gbu.getHexBinary("10"),hex2);
	}

	/**
	 * <pre>
	 * 16進数文字列から期待するバイナリ文字列に変換されているか
	 * IN(引数)	16進数文字列"10"
	 * OUT(期待値)	byte型配列"10"
	 * </pre>
	 */
	@Test
	public void test_getBCDBinary() {
		assertArrayEquals(gbu.getBCDBinary("10"),bcd);
	}

	/**
	 * <pre>
	 * 文字列から期待するバイナリ文字列に変換されているか
	 * IN(引数)	文字列"10"
	 * OUT(期待値)	byte型配列"10"
	 * </pre>
	 */
	@Test
	public void test_getStringBinary() {
		assertArrayEquals(gbu.getStringBinary("10"),str);
	}

}
