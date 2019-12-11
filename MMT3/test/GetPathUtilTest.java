import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class GetPathUtilTest {

	@Test
	public void testGetLength() {
		int sum = 2;

		GetPathUtil gpu = new GetPathUtil();

		assertEquals(gpu.getLength(),sum);
	}

	@Test
	public void testGetCSVPathList() {
		File file1 = new File(".\\in\\sensor_data0001.csv");
		File file2 = new File(".\\in\\sensor_data0002.csv");
		File[] file = {file1,file2};

		GetPathUtil gpu = new GetPathUtil();

		assertArrayEquals(gpu.getCSVPathList(),file);
	}

}
