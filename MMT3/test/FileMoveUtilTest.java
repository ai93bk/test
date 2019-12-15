import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

/***
 *<pre>
 *FileMoveUtilのテスト用クラス
 *FileMoveUtil=ファイルを別ディレクトリへ移動させるクラス
 *</pre>
 */
public class FileMoveUtilTest {
	FileMoveUtil fmu1 = new FileMoveUtil(".\\in\\a.txt",".\\out\\a.txt");
	FileMoveUtil fmu2 = new FileMoveUtil(".\\in\\b.txt",".\\out\\b.txt");
	FileMoveUtil fmu3 = new FileMoveUtil(".\\out\\a.txt",".\\in\\a.txt");
	/***
	 * <pre>
	 * inディレクトリ内ファイル(a.txt)が宛先となるoutディレクトリ内に移動できているか
	 * IN(引数)	2(inディレクトリ内ファイル数の実値)
	 * OUT(期待値)	2
	 * @throws IOException
	 * </pre>
	 */
	@Test
	public void test_moveFile() throws IOException{
		fmu1.moveFile();
		assertTrue(new File(".\\out\\a.txt").exists());
		fmu3.moveFile();
	}
}
