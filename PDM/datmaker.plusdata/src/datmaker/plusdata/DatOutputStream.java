package datmaker.plusdata;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DatOutputStream {
	public void writeDat(PlusData pd) {
		BufferedOutputStream bf;
		try {
			bf = new BufferedOutputStream(new FileOutputStream(	new File("").getAbsolutePath().replace("bin","")+"out\\addtional.dat"));
			bf.write(pd.getData());
			bf.flush();
			bf.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
