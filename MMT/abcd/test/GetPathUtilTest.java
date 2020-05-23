import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

/**<pre>
 *GetPathUtilのテスト用クラス
 *GetPathUtil=inディレクトリ内のファイル数,ファイルの一覧を返却するクラス
 </pre>*/
public class GetPathUtilTest {

	GetPathUtil gpu = new GetPathUtil();

	/***<pre>
	 * inディレクトリ内のファイル数が期待値と合致しているか
	 * IN(引数)	3(inディレクトリ内ファイル数の実値)
	 * OUT(期待値)	3(期待値)
	 </pre>*/
	@Test
	public void test_getLength() {
		assertEquals(gpu.getLength(),3);
	}

	/***<pre>
	 * inディレクトリ内にあるファイルの一覧が期待値と合致しているか
	 * IN(引数)	a.txtと.\\in\\sensor_data0001.csvと.\\in\\sensor_data0002.csv(inディレクトリ内ファイル)
	 * OUT(期待値)	a.txtと.\\in\\sensor_data0001.csvと.\\in\\sensor_data0002.csv(期待値)
	 </pre>*/
	@Test
	public void test_getCSVPathList() {
		File file1 = new File(".\\in\\a.txt");
		File file2 = new File(".\\in\\sensor_data0001.csv");
		File file3 = new File(".\\in\\sensor_data0002.csv");
		File[] file = {file1,file2,file3};
		assertArrayEquals(gpu.getCSVPathList(),file);
	}

}
