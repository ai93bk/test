import java.io.BufferedOutputStream;
import java.io.File;
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

	public String getSize(String filename) {
		File file = new File(filename);
		long size = new File(filename).length();
        file.delete();
        return String.valueOf(size);
	}
}
