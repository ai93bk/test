import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

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

	public String gZip(String filepath) {
		byte[]buffer = new byte[1024];

	     try{

	        GZIPOutputStream gzos = new GZIPOutputStream(new FileOutputStream(filepath+".gz"));
	        FileInputStream in = new FileInputStream(filepath);

	        int len;
	        while ((len = in.read(buffer)) > 0) {
	            gzos.write(buffer, 0, len);
	        }

	        in.close();
	        gzos.finish();
	        gzos.close();

	        return filepath+"gz";
	     }catch(IOException ex){
	         ex.printStackTrace();
	     }
	     return "";
	}
}
