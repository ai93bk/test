import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputUtil {

	public FileOutputUtil() {

	}

	public void outFile(byte[] sbyte,String filename) {
		try {
	        BufferedOutputStream bf = new BufferedOutputStream(new FileOutputStream(filename));
	        bf.write(sbyte);
	        bf.flush();
	        bf.close();
		}catch (IOException e) {
            e.printStackTrace();
        }
	}

}
