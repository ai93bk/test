import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

class InputCheckUtilTest {
/*
	@Test
	void testInputCheckUtil() {
		fail("まだ実装されていません");
	}

	@Test
	void testCheckSensorData1() {
		fail("まだ実装されていません");
	}

	@Test
	void testCheckSensorData2() {
		fail("まだ実装されていません");
	}

	@Test
	void testMeasureDate() {
		fail("まだ実装されていません");
	}

	@Test
	void testRegisterDate() {
		fail("まだ実装されていません");
	}*/

	@Test
	void testCommand() {
		fail("まだ実装されていません");
	}
	/**
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN	引数:9999
	 * 		条件:NullCheck,CountCheck(4,4),FormatCheck(0,9999)
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testTerminalCategory1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("9999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("TerminalCategory");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN	引数:9999
	 * 		条件:NullCheck,CountCheck(4,4),FormatCheck(0,9999)
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testTerminalCategory1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("9999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("TerminalCategory");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:""
	 * 		条件:NullCheck
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testTerminalCategory2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("TerminalCategory");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:12345
	 * 		条件:CountCheck(4,4)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testTerminalCategory3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("12345");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("TerminalCategory");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:-123
	 * 		条件:FormatCheck(0,9999)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testTerminalCategory4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("-123");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("TerminalCategory");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN	引数:255255255255
	 * 		条件:NullCheck,CountCheck(12,12),FormatCheck(1,3,0,255)&&FormatCheck(4,6,0,255)&&FormatCheck(7,9,0,255)&&FormatCheck(10,12,0,255)
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testIP1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("255255255255");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("IP");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:""
	 * 		条件:NullCheck
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testIP2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("IP");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:1234567890123
	 * 		条件:CountCheck(12,12)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testIP3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("1234567890123");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("IP");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:256255255255
	 * 		条件:FormatCheck(1,3,0,255)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testIP4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("256255255255");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("IP");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:255256255255
	 * 		条件:FormatCheck(4,6,0,255)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testIP5() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("255256255255");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("IP");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:255255256255
	 * 		条件:FormatCheck(7,9,0,255)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testIP6() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("255255256255");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("IP");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:255255255256
	 * 		条件:FormatCheck(10,12,0,255)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testIP7() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("255255255256");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("IP");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN	引数:999999999999999L
	 * 		条件:NullCheck,CountCheck(1,16),FormatCheck(0L,999999999999999L)
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testIMEI1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("999999999999999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("IMEI");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:""
	 * 		条件:NullCheck
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testIMEI2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("IMEI");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:12345678901234567
	 * 		条件:CountCheck(1,16)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testIMEI3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("12345678901234567");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("IMEI");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:-1L
	 * 		条件:FormatCheck(0L,999999999999999L)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testIMEI4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("-1");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("IMEI");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN	引数:01234567
	 * 		条件:NullCheck,CountCheck(8,8)
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testLat1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("01234567");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("Lat");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:""
	 * 		条件:NullCheck
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testLat2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Lat");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:012345678
	 * 		条件:CountCheck(8,8)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testLat3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("012345678");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Lat");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN	引数:012345678
	 * 		条件:NullCheck,CountCheck(9,9)
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testLon1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("012345678");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("Lon");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:""
	 * 		条件:NullCheck
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testLon2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Lon");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:0123456789
	 * 		条件:CountCheck(9,9)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testLon3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("0123456789");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Lon");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN	引数:9999
	 * 		条件:NullCheck,CountCheck(1,4),FormatCheck(0,9999)
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testSpeed1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("9999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("Speed");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:""
	 * 		条件:NullCheck
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testSpeed2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Speed");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:12345
	 * 		条件:CountCheck(1,4)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testSpeed3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("12345");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Speed");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:-1
	 * 		条件:FormatCheck(0,9999)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testSpeed4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("-1");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Speed");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN	引数:359
	 * 		条件:NullCheck,CountCheck(1,3),FormatCheck(0,359)
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testPosition1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("359");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("Position");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:""
	 * 		条件:NullCheck
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testPosition2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Position");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:1234
	 * 		条件:CountCheck(1,3)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testPosition3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("1234");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Position");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:400
	 * 		条件:FormatCheck(0,359)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testPosition4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("400");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Position");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN	引数:4
	 * 		条件:NullCheck,CountCheck(1,1),FormatCheck(1,4)
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testMeasureMode1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("4");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("MeasureMode");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:""
	 * 		条件:NullCheck
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testMeasureMode2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("MeasureMode");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:12
	 * 		条件:CountCheck(1,1)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testMeasureMode3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("12");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("MeasureMode");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:5
	 * 		条件:FormatCheck(1,4)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testMeasureMode4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("5");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("MeasureMode");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN	引数:-9999
	 * 		条件:NullCheck,CountCheck(1,5),FormatCheck(1,1,"-"),(FormatCheck(2,this.s.length(),0,9999)
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testPositionAccel1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("-9999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("PositionAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN	引数:9999
	 * 		条件:NullCheck,CountCheck(1,5),(FormatCheck(1,this.s.length(),29999)
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testPositionAccel2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("9999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("PositionAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:""
	 * 		条件:NullCheck
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testPositionAccel3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("PositionAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:123456
	 * 		条件:CountCheck(1,5)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testPositionAccel4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("123456");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("PositionAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:10000
	 * 		条件:(FormatCheck(1,this.s.length(),0,9999)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testPositionAccel5() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("10000");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("PositionAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN	引数:-30000
	 * 		条件:NullCheck,CountCheck(1,6),FormatCheck(1,1,"-"),(FormatCheck(2,this.s.length(),0,29999)
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testFrontBehindAccel1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("-29999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("FrontBehindAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN	引数:29999
	 * 		条件:NullCheck,CountCheck(1,6),(FormatCheck(1,this.s.length(),0,29999)
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testFrontBehindAccel2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("29999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("FrontBehindAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:""
	 * 		条件:NullCheck
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testFrontBehindAccel3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("FrontBehindAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:1234567
	 * 		条件:CountCheck(1,6)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testFrontBehindAccel4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("1234567");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("FrontBehindAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:-30000
	 * 		条件:(FormatCheck(1,1,"-")&&FormatCheck(1,this.s.length(),0,29999)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testFrontBehindAccel5() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("-30000");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("FrontBehindAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN	引数:-30000
	 * 		条件:NullCheck,CountCheck(1,6),FormatCheck(1,1,"-"),(FormatCheck(2,this.s.length(),0,29999)
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testLeftRightAccel1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("-29999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("LeftRightAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN	引数:29999
	 * 		条件:NullCheck,CountCheck(1,6),(FormatCheck(1,this.s.length(),0,29999)
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testLeftRightAccel2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("29999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("LeftRightAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:""
	 * 		条件:NullCheck
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testLeftRightAccel3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("LeftRightAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:1234567
	 * 		条件:CountCheck(1,6)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testLeftRightAccel4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("1234567");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("LeftRightAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:-30000
	 * 		条件:(FormatCheck(1,1,"-")&&FormatCheck(1,this.s.length(),0,29999)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testLeftRightAccel5() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("-30000");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("LeftRightAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN	引数:-30000
	 * 		条件:NullCheck,CountCheck(1,6),FormatCheck(1,1,"-"),(FormatCheck(2,this.s.length(),0,29999)
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testUpDownAccel1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("-29999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("UpDownAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN	引数:29999
	 * 		条件:NullCheck,CountCheck(1,6),(FormatCheck(1,this.s.length(),0,29999)
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testUpDownAccel2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("29999");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("UpDownAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:""
	 * 		条件:NullCheck
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testUpDownAccel3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("UpDownAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:1234567
	 * 		条件:CountCheck(1,6)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testUpDownAccel4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("1234567");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("UpDownAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:-30000
	 * 		条件:(FormatCheck(1,1,"-")&&FormatCheck(1,this.s.length(),0,29999)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testUpDownAccel5() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("-30000");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("UpDownAccel");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN	引数:2
	 * 		条件:NullCheck,CountCheck(1,1),FormatCheck(0,2)
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testAccelCorrection1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("2");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("AccelCorrection");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:""
	 * 		条件:NullCheck
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testAccelCorrection2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("AccelCorrection");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:12
	 * 		条件:CountCheck(1,1)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testAccelCorrection3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("12");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("AccelCorrection");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:3
	 * 		条件:FormatCheck(0,2)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testAccelCorrection4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("3");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("AccelCorrection");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN	引数:2
	 * 		条件:NullCheck,CountCheck(1,1),FormatCheck(0,2)
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testQuality1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("2");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("Quality");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:""
	 * 		条件:NullCheck
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testQuality2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Quality");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:12
	 * 		条件:CountCheck(1,1)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testQuality3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("12");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Quality");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:3
	 * 		条件:FormatCheck(0,2)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testQuality4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("3");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Quality");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN	引数:500
	 * 		条件:NullCheck,CountCheck(1,2),FormatCheck(0,12)
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testSatelliteNum1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("12");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("SatelliteNum");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:""
	 * 		条件:NullCheck
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testSatelliteNum2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("SatelliteNum");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:123
	 * 		条件:CountCheck(1,2)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testSatelliteNum3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("123");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("SatelliteNum");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:13
	 * 		条件:FormatCheck(0,12)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testSatelliteNum4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("13");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("SatelliteNum");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN	引数:500
	 * 		条件:NullCheck,CountCheck(1,3),FormatCheck(0,500)
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testPDOP1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("500");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("PDOP");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:""
	 * 		条件:NullCheck
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testPDOP2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("PDOP");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:1234
	 * 		条件:CountCheck(1,3)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testPDOP3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("1234");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("PDOP");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:501
	 * 		条件:FormatCheck(0,500)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testPDOP4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("501");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("PDOP");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN	引数:-30000
	 * 		条件:NullCheck,CountCheck(1,6),(FormatCheck(0,2"),FormatCheck(1,1,"-"),(FormatCheck(2,this.s.length(),0,30000)
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testHeight1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("-30000");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("Height");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN	引数:30000
	 * 		条件:NullCheck,CountCheck(1,6),(FormatCheck(0,2"),(FormatCheck(1,this.s.length(),0,30000)
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testHeight2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("30000");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("Height");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:""
	 * 		条件:NullCheck
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testHeight3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Height");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:1234567
	 * 		条件:CountCheck(1,6)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testHeight4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("1234567");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Height");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たしfalseとなるか
	 * IN	引数:-30001
	 * 		条件:(FormatCheck(1,1,"-")&&(FormatCheck(2,this.s.length(),0,30000)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testHeight5() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("-30001");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("Height");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN	引数:1
	 * 		条件:NullCheck,CountCheck(1,1),(FormatCheck(0,2")
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testPositionCorrection1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("1");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("PositionCorrection");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たさずfalseとなるか
	 * IN	引数:3
	 * 		条件:(FormatCheck(0,2")
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testPositionCorrection2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("3");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("PositionCorrection");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たさずfalseとなるか
	 * IN	引数:""
	 * 		条件:NullCheck
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testPositionCorrection3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("PositionCorrection");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たさずfalseとなるか
	 * IN	引数:10
	 * 		条件:CountCheck(1,1)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testPositionCorrection4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("10");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("PositionCorrection");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN	引数:N
	 * 		条件:NullCheck,CountCheck(1,1),(FormatCheck(1,1,"N")
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testLatSector1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("N");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("LatSector");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN	引数:S
	 * 		条件:NullCheck,CountCheck(1,1),(FormatCheck(1,1,"S")
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testLatSector2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("S");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("LatSector");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN	引数:0
	 * 		条件:NullCheck,CountCheck(1,1),(FormatCheck(1,1,"0")
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testLatSector3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("0");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("LatSector");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たさずfalseとなるか
	 * IN	引数:A
	 * 		条件:(FormatCheck(1,1,"N"),(FormatCheck(1,1,"S"),(FormatCheck(1,1,"0")
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testLatSector4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("A");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("LatSector");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たさずfalseとなるか
	 * IN	引数:10
	 * 		条件:CountCheck(1,1)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testLatSector5() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("10");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("LatSector");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たさずfalseとなるか
	 * IN	引数:""空文字
	 * 		条件:NullCheck
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testLatSector6() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("LatSector");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN	引数:E
	 * 		条件:NullCheck,CountCheck(1,1),(FormatCheck(1,1,"E")
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testLonSector1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("E");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("LonSector");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN	引数:W
	 * 		条件:NullCheck,CountCheck(1,1),(FormatCheck(1,1,"W")
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testLonSector2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("W");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("LonSector");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 正常値の引数を渡したときに下記条件を満たしtrueとなるか
	 * IN	引数:0
	 * 		条件:NullCheck,CountCheck(1,1),(FormatCheck(1,1,"0")
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testLonSector3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("0");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("LonSector");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たさずfalseとなるか
	 * IN	引数:A
	 * 		条件:(FormatCheck(1,1,"E"),(FormatCheck(1,1,"W"),(FormatCheck(1,1,"0")
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testLonSector4() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("A");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("LonSector");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たさずfalseとなるか
	 * IN	引数:10
	 * 		条件:CountCheck(1,1)
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testLonSector5() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("10");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("LonSector");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに下記条件を満たさずfalseとなるか
	 * IN	引数:""空文字
	 * 		条件:NullCheck
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testLonSector6() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("LonSector");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**
	 * 正常値の引数を渡したときに空値チェックを通しtrueとなるか
	 * IN	引数:12345	条件:空白文字""ではないか
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testNullCheck1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("12345");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("NullCheck");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに空値チェックを通しfalseとなるか
	 * IN	引数:12345	条件:空白文字""ではないか
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testNullCheck2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("NullCheck");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**
	 * 正常値の引数を渡したときに文字数チェックを通しtrueとなるか
	 * IN	引数:12345	条件:文字数が5文字上5文字以下か
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testCountCheck1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("12345");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("CountCheck",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,5,5);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときに文字数チェックを通しfalseとなるか
	 * IN	引数:12345	条件:文字数が0文字上0文字以下か
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testCountCheck2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("12345");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CountCheck",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,0,0);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときにフォーマットチェックを通しfalseとなるか
	 * IN	引数:12345	条件:文字数が6文字上6文字以下か
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testCountCheck3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("12345");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("CountCheck",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,6,6);
		assertEquals(expected, actual);
	}

	/**
	 * 正常値の引数を渡したときにフォーマットチェックを通しtrueとなるか
	 * IN	引数:20191224103050	条件:SimpleDateFormat("yyyyMMddHHmmss")に合致するか
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testFormatCheck1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("20191224103050");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("FormatCheck");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときにフォーマットチェックを通しfalseとなるか
	 * IN	引数:2019122410305000	条件:SimpleDateFormat("yyyyMMddHHmmss")に合致するか
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testFormatCheck2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("2019122410305000");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("FormatCheck");
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu);
		assertEquals(expected, actual);
	}

	/**
	 * 正常値の引数を渡したときにフォーマットチェックを通しtrueとなるか
	 * IN	引数:123	条件:0以上200以下
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testFormatCheckIntInt1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("123");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("FormatCheck",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,0,200);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときにフォーマットチェックを通しfalseとなるか
	 * IN	引数:123	条件:200以上0以下
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testFormatCheckIntInt2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("123");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("FormatCheck",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,200,0);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときにフォーマットチェックを通しfalseとなるか
	 * IN	引数:123	条件:0以上10以下
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testFormatCheckIntInt3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("123");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("FormatCheck",int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,0,10);
		assertEquals(expected, actual);
	}


	/**
	 * 正常値の引数を渡したときにフォーマットチェックを通しtrueとなるか
	 * IN	引数:123456789012345	条件:0以上999999999999999以下
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testFormatCheckLongLong1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("123456789012345");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("FormatCheck",long.class,long.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,0L, 999999999999999L);
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときにフォーマットチェックを通しfalseとなるか
	 * IN	引数:123456789012345	条件:999999999999999以上0以下
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testFormatCheckLongLong2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("123456789012345");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("FormatCheck",long.class,long.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,999999999999999L,0L);
		assertEquals(expected, actual);
	}	/**
	 * 異常値の引数を渡したときにフォーマットチェックを通しfalseとなるか
	 * IN	引数:123456789012345	条件:0以上10以下
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testFormatCheckLongLong3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("123456789012345");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("FormatCheck",long.class,long.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,0L,10L);
		assertEquals(expected, actual);
	}

	/**
	 * 正常値の引数を渡したときにフォーマットチェックを通しtrueとなるか
	 * IN	文字列:abcd	条件:2番目から3番目の文字がbc
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testFormatCheckIntIntString1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("abcd");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("FormatCheck",int.class,int.class,String.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,2,3,"bc");
		assertEquals(expected, actual);
	}
	/**
	 * 異常値の引数を渡したときにフォーマットチェックを通しfalseとなるか
	 * IN	文字列:abcd	条件:2番目から3番目の文字がad
	 * OUT	false
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	void testFormatCheckIntIntString2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("abcd");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("FormatCheck",int.class,int.class,String.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,2,3,"ad");
		assertEquals(expected, actual);
	}

	/***
	 * 正常値の引数を渡したときにフォーマットチェックを通しtrueとなるか
	 * IN	引数:10	条件:9以上11以下
	 * OUT	true
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	public void testFormatCheckIntIntIntInt1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("10");
		boolean expected = true;
		Method method = InputCheckUtil.class.getDeclaredMethod("FormatCheck",int.class,int.class,int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,1,2,9,11);
		assertEquals(expected, actual);
	}
	/***
	 * 異常値の引数を渡したときにフォーマットチェックを通しfalseとなるか
	 * IN	引数:10	条件:11以上9以下
	 * OUT	false(期待値)
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	public void testFormatCheckIntIntIntInt2() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("10");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("FormatCheck",int.class,int.class,int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,1,2,11,9);
		assertEquals(expected, actual);
	}
	/***
	 * 異常値の引数を渡したときにフォーマットチェックを通しfalseとなるか
	 * IN	引数:10	条件:11以上11以下
	 * OUT	false(期待値)
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	public void testFormatCheckIntIntIntInt3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InputCheckUtil icu = new InputCheckUtil("10");
		boolean expected = false;
		Method method = InputCheckUtil.class.getDeclaredMethod("FormatCheck",int.class,int.class,int.class,int.class);
		method.setAccessible(true);
		boolean actual = (boolean)method.invoke(icu,1,2,11,11);
		assertEquals(expected, actual);
	}
	/***
	 * 異常値の引数を渡したときにフォーマットチェックを通しfalseとなるか
	 * IN	引数:10	条件:9以上9以下
	 * OUT	false(期待値)
	 *
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
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
