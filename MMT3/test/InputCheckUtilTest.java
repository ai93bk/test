import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

/***
 *<pre>
 *InputCheckUtilのテスト用クラス
 *InputCheckUtil=引数の文字列を入力チェックするクラス
 *</pre>
 */
public class InputCheckUtilTest {

	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:20191224151159
	 * 条件:MeasureDate()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData1_1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("20191224151159");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData1",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,1,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:20191224151159
	 * 条件:RegisterDate()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData1_2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("20191224151159");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData1",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,2,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:10000011
	 * 条件:Command()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData1_3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("10000011");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData1",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,3,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:9999
	 * 条件:TerminalCategory()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData1_4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("9999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData1",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,4,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:255255255255
	 * 条件:IP()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData1_5() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("255255255255");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData1",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,5,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:999999999999999
	 * 条件:IMEI()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData1_6() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("999999999999999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData1",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,6,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:12345678
	 * 条件:Lat()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData1_7() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("12345678");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData1",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,7,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:123456789
	 * 条件:Lon()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData1_8() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("123456789");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData1",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,8,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:9999
	 * 条件:Speed()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData1_9() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("9999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData1",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,9,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:359
	 * 条件:Position()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData1_10() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("359");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData1",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,10,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:4
	 * 条件:MeasureMode()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData1_11() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("4");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData1",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,11,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:9999
	 * 条件:PositionAccel()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData1_12() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("9999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData1",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,12,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:29999
	 * 条件:LeftRightAccel()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData1_13() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("29999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData1",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,23,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:29999
	 * 条件:LeftRightAccel()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData1_14() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("29999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData1",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,23,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:29999
	 * 条件:UpDownAccel()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData1_15() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("29999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData1",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,33,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:20191224151160
	 * 条件:MeasureDate()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData1_16() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("20191224151160");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData1",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,1,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:20191224151160
	 * 条件:RegisterDate()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData1_17() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("20191224151160");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData1",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,2,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:30000011
	 * 条件:Command()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData1_18() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("30000011");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData1",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,3,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:10000
	 * 条件:TerminalCategory()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData1_19() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("10000");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData1",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,4,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:300300300300
	 * 条件:IP()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData1_20() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("300300300300");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData1",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,5,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:-1
	 * 条件:IMEI()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData1_21() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("-1");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData1",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,6,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:123456789
	 * 条件:Lat()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData1_22() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("123456789");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData1",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,7,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:1234567890
	 * 条件:Lon()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData1_23() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("1234567890");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData1",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,8,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:10000
	 * 条件:Speed()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData1_24() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("10000");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData1",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,9,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:400
	 * 条件:Position()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData1_25() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("400");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData1",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,10,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:5
	 * 条件:MeasureMode()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData1_26() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("5");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData1",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,11,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:10000
	 * 条件:PositionAccel()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData1_27() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("10000");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData1",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,12,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:30000
	 * 条件:FrontBehindAccel()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData1_28() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("30000");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData1",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,13,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:30000
	 * 条件:LeftRightAccel()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData1_29() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("30000");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData1",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,23,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:30000
	 * 条件:UpDownAccel()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData1_30() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("30000");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData1",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,33,1);
		assertEquals(expected, actual);
	}

	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:20191224151159
	 * 条件:MeasureDate()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("20191224151159");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,1,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:20191224151159
	 * 条件:RegisterDate()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("20191224151159");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,2,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:10000011
	 * 条件:Command()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("10000011");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,3,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:9999
	 * 条件:TerminalCategory()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("9999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,4,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:255255255255
	 * 条件:IP()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_5() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("255255255255");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,5,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:999999999999999
	 * 条件:IMEI()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_6() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("999999999999999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,6,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:12345678
	 * 条件:Lat()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_7() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("12345678");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,7,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:123456789
	 * 条件:Lon()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_8() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("123456789");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,8,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:9999
	 * 条件:Speed()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_9() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("9999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,9,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:359
	 * 条件:Position()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_10() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("359");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,10,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:4
	 * 条件:MeasureMode()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_11() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("4");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,11,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:29999
	 * 条件:FrontBehindAccel()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_12() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("29999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,13,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:29999
	 * 条件:LeftRightAccel()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_13() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("29999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,23,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:29999
	 * 条件:UpDownAccel()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_14() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("29999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,33,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:2
	 * 条件:AccelCorrection()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_15() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("2");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,43,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:2
	 * 条件:Quality()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_16() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("2");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,53,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:2
	 * 条件:SatelliteNum()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_17() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("2");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,54,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:12
	 * 条件:PDOP()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_18() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("12");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,55,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:-30000
	 * 条件:Height()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_19() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("-30000");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,56,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:2
	 * 条件:PositionCorrection()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_20() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("2");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,57,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:N
	 * 条件:LatSector()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_21() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("N");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,58,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:E
	 * 条件:LonSector()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_22() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("E");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,59,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:20191224151160
	 * 条件:MeasureDate()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_23() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("20191224151160");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,1,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:20191224151160
	 * 条件:RegisterDate()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_24() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("20191224151160");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,2,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:30000011
	 * 条件:Command()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_25() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("30000011");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,3,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:10000
	 * 条件:TerminalCategory()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_26() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("10000");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,4,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:300300300300
	 * 条件:IP()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_27() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("300300300300");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,5,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:-1
	 * 条件:IMEI()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_28() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("-1");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,6,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:123456789
	 * 条件:Lat()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_29() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("123456789");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,7,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:1234567890
	 * 条件:Lon()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_30() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("1234567890");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,8,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:10000
	 * 条件:Speed()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_31() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("10000");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,9,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:400
	 * 条件:Position()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_32() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("400");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,10,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:5
	 * 条件:MeasureMode()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_33() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("5");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,11,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:30000
	 * 条件:FrontBehindAccel()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_34() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("30000");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,13,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:30000
	 * 条件:LeftRightAccel()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_35() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("30000");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,23,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:30000
	 * 条件:UpDownAccel()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_36() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("30000");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,33,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:3
	 * 条件:AccelCorrection()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_37() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("3");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,43,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:3
	 * 条件:Quality()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_38() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("3");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,53,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:13
	 * 条件:SatelliteNum()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_39() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("13");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,54,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:501
	 * 条件:PDOP()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_40() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("501");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,55,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:-30001
	 * 条件:Height()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_41() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("-30001");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,56,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:3
	 * 条件:PositionCorrection()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_42() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("3");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,57,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:A
	 * 条件:LatSector()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_43() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("A");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,58,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:A
	 * 条件:LonSector()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_44() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("A");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,59,1);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:A
	 * 条件:LonSector()
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCheckSensorData2_45() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("A");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CheckSensorData2",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,60,1);
		assertEquals(expected, actual);
	}

	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:20191224151159
	 * 条件:NullCheck,CountCheck(1,2),FormatCheck(0,12)
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testMeasureDate1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("20191224151159");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("MeasureDate");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:""
	 * 条件:NullCheck
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testMeasureDate2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("MeasureDate");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:123456789012345
	 * 条件:CountCheck(14,14)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testMeasureDate3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("123456789012345");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("MeasureDate");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:20190231246060
	 * 条件:FormatCheck()
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testMeasureDate4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("20190231246060");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("MeasureDate");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:20191224151159
	 * 条件:NullCheck,CountCheck(1,2),FormatCheck(0,12)
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testRegisterDate1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("20191224151159");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("RegisterDate");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:""
	 * 条件:NullCheck
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testRegisterDate2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("RegisterDate");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:123456789012345
	 * 条件:CountCheck(14,14)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testRegisterDate3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("123456789012345");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("RegisterDate");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:20190231246060
	 * 条件:FormatCheck()
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testRegisterDate4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("20190231246060");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("RegisterDate");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:20000052
	 * 条件:NullCheck,CountCheck(8,8),FormatCheck(1,1,"1"),FormatCheck(2,6,"0"),FormatCheck(7,7,"1"),FormatCheck(8,8,"1")
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCommand1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("10000011");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("Command");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:20000052
	 * 条件:NullCheck,CountCheck(8,8),FormatCheck(1,1,"2"),FormatCheck(2,6,"0"),FormatCheck(7,7,"2"),FormatCheck(8,8,"2")
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCommand2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("20000022");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("Command");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:10000031
	 * 条件:NullCheck,CountCheck(8,8),FormatCheck(1,1,"2"),FormatCheck(2,6,"0"),FormatCheck(7,7,"3"),FormatCheck(8,8,"1")
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCommand3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("10000031");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("Command");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:10000041
	 * 条件:NullCheck,CountCheck(8,8),FormatCheck(1,1,"2"),FormatCheck(2,6,"0"),FormatCheck(7,7,"4"),FormatCheck(8,8,"1")
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCommand4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("10000041");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("Command");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:""
	 * 条件:NullCheck
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCommand5() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Command");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:123456789
	 * 条件:CountCheck(8,8)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCommand6() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("123456789");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Command");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:30000011
	 * 条件:(FormatCheck(1,1,"1")||FormatCheck(1,1,"2")
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCommand7() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("30000011");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Command");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:21000011
	 * 条件:(FormatCheck(2,6,"0")
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCommand8() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("21000011");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Command");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:20000061
	 * 条件:(FormatCheck(7,7,"1")||FormatCheck(7,7,"2")||FormatCheck(7,7,"3")||FormatCheck(7,7,"4")||FormatCheck(7,7,"5")
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCommand9() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("20000061");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Command");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:20000053
	 * 条件:(FormatCheck(8,8,"1")||FormatCheck(8,8,"2")
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCommand10() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("20000053");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Command");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:9999
	 * 条件:NullCheck,CountCheck(4,4),FormatCheck(0,9999)
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testTerminalCategory1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("9999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("TerminalCategory");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:""
	 * 条件:NullCheck
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testTerminalCategory2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("TerminalCategory");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:12345
	 * 条件:CountCheck(4,4)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testTerminalCategory3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("12345");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("TerminalCategory");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:-123
	 * 条件:FormatCheck(0,9999)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testTerminalCategory4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("-123");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("TerminalCategory");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:255255255255
	 * 条件:NullCheck,CountCheck(12,12),FormatCheck(1,3,0,255)&&FormatCheck(4,6,0,255)&&FormatCheck(7,9,0,255)&&FormatCheck(10,12,0,255)
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testIP1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("255255255255");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("IP");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:""
	 * 条件:NullCheck
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testIP2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("IP");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:1234567890123
	 * 条件:CountCheck(12,12)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testIP3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("1234567890123");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("IP");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:256255255255
	 * 条件:FormatCheck(1,3,0,255)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testIP4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("256255255255");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("IP");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:255256255255
	 * 条件:FormatCheck(4,6,0,255)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testIP5() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("255256255255");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("IP");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:255255256255
	 * 条件:FormatCheck(7,9,0,255)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testIP6() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("255255256255");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("IP");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:255255255256
	 * 条件:FormatCheck(10,12,0,255)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testIP7() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("255255255256");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("IP");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:999999999999999L
	 * 条件:NullCheck,CountCheck(1,16),FormatCheck(0L,999999999999999L)
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testIMEI1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("999999999999999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("IMEI");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:""
	 * 条件:NullCheck
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testIMEI2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("IMEI");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:12345678901234567
	 * 条件:CountCheck(1,16)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testIMEI3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("12345678901234567");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("IMEI");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:-1L
	 * 条件:FormatCheck(0L,999999999999999L)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testIMEI4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("-1");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("IMEI");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:01234567
	 * 条件:NullCheck,CountCheck(8,8)
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testLat1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("01234567");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("Lat");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:""
	 * 条件:NullCheck
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testLat2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Lat");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:012345678
	 * 条件:CountCheck(8,8)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testLat3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("012345678");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Lat");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:012345678
	 * 条件:NullCheck,CountCheck(9,9)
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testLon1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("012345678");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("Lon");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:""
	 * 条件:NullCheck
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testLon2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Lon");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:0123456789
	 * 条件:CountCheck(9,9)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testLon3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("0123456789");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Lon");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:9999
	 * 条件:NullCheck,CountCheck(1,4),FormatCheck(0,9999)
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testSpeed1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("9999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("Speed");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:""
	 * 条件:NullCheck
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testSpeed2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Speed");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:12345
	 * 条件:CountCheck(1,4)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testSpeed3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("12345");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Speed");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:-1
	 * 条件:FormatCheck(0,9999)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testSpeed4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("-1");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Speed");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:359
	 * 条件:NullCheck,CountCheck(1,3),FormatCheck(0,359)
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testPosition1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("359");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("Position");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:""
	 * 条件:NullCheck
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testPosition2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Position");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:1234
	 * 条件:CountCheck(1,3)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testPosition3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("1234");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Position");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:400
	 * 条件:FormatCheck(0,359)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testPosition4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("400");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Position");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:4
	 * 条件:NullCheck,CountCheck(1,1),FormatCheck(1,4)
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testMeasureMode1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("4");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("MeasureMode");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:""
	 * 条件:NullCheck
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testMeasureMode2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("MeasureMode");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:12
	 * 条件:CountCheck(1,1)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testMeasureMode3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("12");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("MeasureMode");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:5
	 * 条件:FormatCheck(1,4)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testMeasureMode4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("5");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("MeasureMode");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:-9999
	 * 条件:NullCheck,CountCheck(1,5),FormatCheck(1,1,"-"),(FormatCheck(2,this.s.length(),0,9999)
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testPositionAccel1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("-9999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("PositionAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:9999
	 * 条件:NullCheck,CountCheck(1,5),(FormatCheck(1,this.s.length(),29999)
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testPositionAccel2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("9999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("PositionAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:""
	 * 条件:NullCheck
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testPositionAccel3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("PositionAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:123456
	 * 条件:CountCheck(1,5)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testPositionAccel4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("123456");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("PositionAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:10000
	 * 条件:(FormatCheck(1,this.s.length(),0,9999)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testPositionAccel5() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("10000");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("PositionAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:-30000
	 * 条件:NullCheck,CountCheck(1,6),FormatCheck(1,1,"-"),(FormatCheck(2,this.s.length(),0,29999)
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testFrontBehindAccel1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("-29999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("FrontBehindAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:29999
	 * 条件:NullCheck,CountCheck(1,6),(FormatCheck(1,this.s.length(),0,29999)
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testFrontBehindAccel2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("29999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("FrontBehindAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:""
	 * 条件:NullCheck
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testFrontBehindAccel3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("FrontBehindAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:1234567
	 * 条件:CountCheck(1,6)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testFrontBehindAccel4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("1234567");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("FrontBehindAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:-30000
	 * 条件:(FormatCheck(1,1,"-")&&FormatCheck(1,this.s.length(),0,29999)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testFrontBehindAccel5() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("-30000");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("FrontBehindAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:-30000
	 * 条件:NullCheck,CountCheck(1,6),FormatCheck(1,1,"-"),(FormatCheck(2,this.s.length(),0,29999)
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testLeftRightAccel1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("-29999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("LeftRightAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:29999
	 * 条件:NullCheck,CountCheck(1,6),(FormatCheck(1,this.s.length(),0,29999)
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testLeftRightAccel2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("29999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("LeftRightAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:""
	 * 条件:NullCheck
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testLeftRightAccel3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("LeftRightAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:1234567
	 * 条件:CountCheck(1,6)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testLeftRightAccel4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("1234567");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("LeftRightAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:-30000
	 * 条件:(FormatCheck(1,1,"-")&&FormatCheck(1,this.s.length(),0,29999)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testLeftRightAccel5() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("-30000");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("LeftRightAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:-30000
	 * 条件:NullCheck,CountCheck(1,6),FormatCheck(1,1,"-"),(FormatCheck(2,this.s.length(),0,29999)
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testUpDownAccel1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("-29999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("UpDownAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:29999
	 * 条件:NullCheck,CountCheck(1,6),(FormatCheck(1,this.s.length(),0,29999)
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testUpDownAccel2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("29999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("UpDownAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:""
	 * 条件:NullCheck
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testUpDownAccel3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("UpDownAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:1234567
	 * 条件:CountCheck(1,6)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testUpDownAccel4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("1234567");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("UpDownAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:-30000
	 * 条件:(FormatCheck(1,1,"-")&&FormatCheck(1,this.s.length(),0,29999)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testUpDownAccel5() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("-30000");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("UpDownAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:2
	 * 条件:NullCheck,CountCheck(1,1),FormatCheck(0,2)
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testAccelCorrection1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("2");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("AccelCorrection");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:""
	 * 条件:NullCheck
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testAccelCorrection2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("AccelCorrection");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:12
	 * 条件:CountCheck(1,1)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testAccelCorrection3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("12");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("AccelCorrection");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:3
	 * 条件:FormatCheck(0,2)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testAccelCorrection4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("3");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("AccelCorrection");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:2
	 * 条件:NullCheck,CountCheck(1,1),FormatCheck(0,2)
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testQuality1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("2");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("Quality");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:""
	 * 条件:NullCheck
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testQuality2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Quality");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:12
	 * 条件:CountCheck(1,1)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testQuality3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("12");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Quality");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:3
	 * 条件:FormatCheck(0,2)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testQuality4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("3");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Quality");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:500
	 * 条件:NullCheck,CountCheck(1,2),FormatCheck(0,12)
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testSatelliteNum1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("12");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("SatelliteNum");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:""
	 * 条件:NullCheck
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testSatelliteNum2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("SatelliteNum");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:123
	 * 条件:CountCheck(1,2)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testSatelliteNum3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("123");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("SatelliteNum");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:13
	 * 条件:FormatCheck(0,12)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testSatelliteNum4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("13");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("SatelliteNum");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:500
	 * 条件:NullCheck,CountCheck(1,3),FormatCheck(0,500)
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testPDOP1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("500");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("PDOP");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:""
	 * 条件:NullCheck
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testPDOP2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("PDOP");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:1234
	 * 条件:CountCheck(1,3)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testPDOP3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("1234");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("PDOP");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:501
	 * 条件:FormatCheck(0,500)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testPDOP4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("501");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("PDOP");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:-30000
	 * 条件:NullCheck,CountCheck(1,6),(FormatCheck(0,2"),FormatCheck(1,1,"-"),(FormatCheck(2,this.s.length(),0,30000)
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testHeight1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("-30000");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("Height");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:30000
	 * 条件:NullCheck,CountCheck(1,6),(FormatCheck(0,2"),(FormatCheck(1,this.s.length(),0,30000)
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testHeight2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("30000");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("Height");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:""
	 * 条件:NullCheck
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testHeight3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Height");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:1234567
	 * 条件:CountCheck(1,6)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testHeight4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("1234567");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Height");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN(引数)	引数:-30001
	 * 条件:(FormatCheck(1,1,"-")&&(FormatCheck(2,this.s.length(),0,30000)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testHeight5() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("-30001");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Height");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:1
	 * 条件:NullCheck,CountCheck(1,1),(FormatCheck(0,2")
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testPositionCorrection1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("1");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("PositionCorrection");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たさずfalseとなるか
	 * IN(引数)	引数:3
	 * 条件:(FormatCheck(0,2")
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testPositionCorrection2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("3");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("PositionCorrection");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たさずfalseとなるか
	 * IN(引数)	引数:""
	 * 条件:NullCheck
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testPositionCorrection3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("PositionCorrection");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たさずfalseとなるか
	 * IN(引数)	引数:10
	 * 条件:CountCheck(1,1)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testPositionCorrection4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("10");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("PositionCorrection");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:N
	 * 条件:NullCheck,CountCheck(1,1),(FormatCheck(1,1,"N")
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testLatSector1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("N");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("LatSector");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:S
	 * 条件:NullCheck,CountCheck(1,1),(FormatCheck(1,1,"S")
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testLatSector2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("S");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("LatSector");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:0
	 * 条件:NullCheck,CountCheck(1,1),(FormatCheck(1,1,"0")
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testLatSector3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("0");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("LatSector");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たさずfalseとなるか
	 * IN(引数)	引数:A
	 * 条件:(FormatCheck(1,1,"N"),(FormatCheck(1,1,"S"),(FormatCheck(1,1,"0")
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testLatSector4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("A");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("LatSector");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たさずfalseとなるか
	 * IN(引数)	引数:10
	 * 条件:CountCheck(1,1)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testLatSector5() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("10");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("LatSector");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たさずfalseとなるか
	 * IN(引数)	引数:""空文字
	 * 条件:NullCheck
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testLatSector6() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("LatSector");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:E
	 * 条件:NullCheck,CountCheck(1,1),(FormatCheck(1,1,"E")
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testLonSector1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("E");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("LonSector");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:W
	 * 条件:NullCheck,CountCheck(1,1),(FormatCheck(1,1,"W")
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testLonSector2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("W");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("LonSector");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN(引数)	引数:0
	 * 条件:NullCheck,CountCheck(1,1),(FormatCheck(1,1,"0")
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testLonSector3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("0");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("LonSector");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たさずfalseとなるか
	 * IN(引数)	引数:A
	 * 条件:(FormatCheck(1,1,"E"),(FormatCheck(1,1,"W"),(FormatCheck(1,1,"0")
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testLonSector4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("A");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("LonSector");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たさずfalseとなるか
	 * IN(引数)	引数:10
	 * 条件:CountCheck(1,1)
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testLonSector5() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("10");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("LonSector");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに下記条件を満たさずfalseとなるか
	 * IN(引数)	引数:""空文字
	 * 条件:NullCheck
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testLonSector6() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("LonSector");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**<pre>
	 * 正常値の引数を渡したときに空値チェックを通しtrueとなるか
	 * IN(引数)	引数:12345	条件:空白文字""ではないか
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testNullCheck1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("12345");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("NullCheck");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに空値チェックを通しfalseとなるか
	 * IN(引数)	引数:12345	条件:空白文字""ではないか
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testNullCheck2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("NullCheck");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**<pre>
	 * 正常値の引数を渡したときに文字数チェックを通しtrueとなるか
	 * IN(引数)	引数:12345	条件:文字数が5文字上5文字以下か
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCountCheck1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("12345");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CountCheck",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,5,5);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときに文字数チェックを通しfalseとなるか
	 * IN(引数)	引数:12345	条件:文字数が0文字上0文字以下か
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCountCheck2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("12345");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CountCheck",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,0,0);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときにフォーマットチェックを通しfalseとなるか
	 * IN(引数)	引数:12345	条件:文字数が6文字上6文字以下か
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testCountCheck3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("12345");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CountCheck",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,6,6);
		assertEquals(expected, actual);
	}

	/**<pre>
	 * 正常値の引数を渡したときにフォーマットチェックを通しtrueとなるか
	 * IN(引数)	引数:20191224103050	条件:SimpleDateFormat("yyyyMMddHHmmss")に合致するか
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testFormatCheck1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("20191224103050");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("FormatCheck");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときにフォーマットチェックを通しfalseとなるか
	 * IN(引数)	引数:2019122410305000	条件:SimpleDateFormat("yyyyMMddHHmmss")に合致するか
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testFormatCheck2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("2019122410305000");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("FormatCheck");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**<pre>
	 * 正常値の引数を渡したときにフォーマットチェックを通しtrueとなるか
	 * IN(引数)	引数:123	条件:0以上200以下
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testFormatCheckIntInt1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("123");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("FormatCheck",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,0,200);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときにフォーマットチェックを通しfalseとなるか
	 * IN(引数)	引数:123	条件:200以上0以下
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testFormatCheckIntInt2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("123");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("FormatCheck",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,200,0);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときにフォーマットチェックを通しfalseとなるか
	 * IN(引数)	引数:123	条件:0以上10以下
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testFormatCheckIntInt3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("123");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("FormatCheck",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,0,10);
		assertEquals(expected, actual);
	}


	/**<pre>
	 * 正常値の引数を渡したときにフォーマットチェックを通しtrueとなるか
	 * IN(引数)	引数:123456789012345	条件:0以上999999999999999以下
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testFormatCheckLongLong1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("123456789012345");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("FormatCheck",long.class,long.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,0L, 999999999999999L);
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときにフォーマットチェックを通しfalseとなるか
	 * IN(引数)	引数:123456789012345	条件:999999999999999以上0以下
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testFormatCheckLongLong2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("123456789012345");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("FormatCheck",long.class,long.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,999999999999999L,0L);
		assertEquals(expected, actual);
	}	/**<pre>
	 * 異常値の引数を渡したときにフォーマットチェックを通しfalseとなるか
	 * IN(引数)	引数:123456789012345	条件:0以上10以下
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testFormatCheckLongLong3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("123456789012345");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("FormatCheck",long.class,long.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,0L,10L);
		assertEquals(expected, actual);
	}

	/**<pre>
	 * 正常値の引数を渡したときにフォーマットチェックを通しtrueとなるか
	 * IN(引数)	文字列:abcd	条件:2番目から3番目の文字がbc
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testFormatCheckIntIntString1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("abcd");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("FormatCheck",int.class,int.class,String.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,2,3,"bc");
		assertEquals(expected, actual);
	}
	/**<pre>
	 * 異常値の引数を渡したときにフォーマットチェックを通しfalseとなるか
	 * IN(引数)	文字列:abcd	条件:2番目から3番目の文字がad
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testFormatCheckIntIntString2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("abcd");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("FormatCheck",int.class,int.class,String.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,2,3,"ad");
		assertEquals(expected, actual);
	}

	/**<pre>*
	 * 正常値の引数を渡したときにフォーマットチェックを通しtrueとなるか
	 * IN(引数)	引数:10	条件:9以上11以下
	 * OUT(期待値)	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testFormatCheckIntIntIntInt1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("10");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("FormatCheck",int.class,int.class,int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,1,2,9,11);
		assertEquals(expected, actual);
	}
	/**<pre>*
	 * 異常値の引数を渡したときにフォーマットチェックを通しfalseとなるか
	 * IN(引数)	引数:10	条件:11以上9以下
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testFormatCheckIntIntIntInt2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("10");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("FormatCheck",int.class,int.class,int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,1,2,11,9);
		assertEquals(expected, actual);
	}
	/**<pre>*
	 * 異常値の引数を渡したときにフォーマットチェックを通しfalseとなるか
	 * IN(引数)	引数:10	条件:11以上11以下
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testFormatCheckIntIntIntInt3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("10");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("FormatCheck",int.class,int.class,int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,1,2,11,11);
		assertEquals(expected, actual);
	}
	/**<pre>*
	 * 異常値の引数を渡したときにフォーマットチェックを通しfalseとなるか
	 * IN(引数)	引数:10	条件:9以上9以下
	 * OUT(期待値)	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 </pre>*/
	@Test
	public void testFormatCheckIntIntIntInt4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("10");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("FormatCheck",int.class,int.class,int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,1,2,9,9);
		assertEquals(expected, actual);
	}

}
