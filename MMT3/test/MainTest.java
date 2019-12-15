import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() throws NoSuchMethodException, SecurityException {
		boolean expected = true;
		Method method = Main.class.getDeclaredMethod("Main",String[].class);
		method.setAccessible(true);
	}
}
/*
	void test() {
	    System.setSecurityManager(new TestSecurityManager());
	    try {
	    	Class<Main> c = Main.class;
	    	Object obj = c.newInstance();

	    	Field f = c.getDeclaredField(strField);
            f.setAccessible(true);
            System.out.println(f.get(myObj));

	      Method m = Main.getMethod("main", String[].class);
	      m.invorke(null, new Object[] { arg.split(ARGS_DELIMITER) });
	    } catch (InvocationTargetException ite) {
	      assertThat(((ExitException)ite.getTargetException()).getStatus(), is(exitCode));
	    } catch (Exception e) {
	      throw RuntimeException(e);
	    }
	}
}*/
