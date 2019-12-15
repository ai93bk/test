import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class GetPathUtilTest {

	GetPathUtil gpu = new GetPathUtil();

	/***
	 * inディレクトリ内のファイル数が期待値と合致しているか
	 * IN	3(inディレクトリ内ファイル数の実値)
	 * OUT	3(期待値)
	 */
	@Test
	public void test_getLength() {
		assertEquals(gpu.getLength(),3);
	}

	/***
	 * inディレクトリ内にあるファイルの一覧が期待値と合致しているか
	 * IN	a.txtと.\\in\\sensor_data0001.csvと.\\in\\sensor_data0002.csv(inディレクトリ内ファイル)
	 * OUT	a.txtと.\\in\\sensor_data0001.csvと.\\in\\sensor_data0002.csv(期待値)
	 */
	@Test
	public void test_getCSVPathList() {
		File file1 = new File(".\\in\\a.txt");
		File file2 = new File(".\\in\\sensor_data0001.csv");
		File file3 = new File(".\\in\\sensor_data0002.csv");
		File[] file = {file1,file2,file3};
		assertArrayEquals(gpu.getCSVPathList(),file);
	}

}
