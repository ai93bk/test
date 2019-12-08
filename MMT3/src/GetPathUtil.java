import java.io.File;

public class GetPathUtil {
	public static File dir = new File(Main.in_dir);
	public static File[] list = dir.listFiles();

	public int getLength() {
		int num=0;
		for(int i=0; i<list.length; i++) {
			if(!list[i].isDirectory()) {
				num++;
			}
		}
		return num;
	}

	public File[] getCSVPathList() {
		int num=0;
		int j=0;
		num=getLength();
		File[] file = new File[num];

		for(int i=0; i<list.length; i++) {
			if(list[i].isDirectory()) {

			}else {
				file[j]=list[i];
				j++;
			}
		}
		return file;
	}
}
