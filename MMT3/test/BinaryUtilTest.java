import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.nio.charset.StandardCharsets;

import org.junit.Test;


public class BinaryUtilTest {

	@Test
	public void test() {
		byte[] b = "10".getBytes(StandardCharsets.UTF_8);

		assertThat(String.valueOf(BinaryUtil.getCheckCode(b)),is("35"));
	}

}
