package datmaker.plusdata;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DatInputStream {
	byte[] dat = new byte[]{};

	public byte[] readDat(String str) {
		Path p = Paths.get(str);
		try {
			dat = Files.readAllBytes(p);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dat;
	}
}
