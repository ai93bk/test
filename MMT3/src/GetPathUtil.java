import java.io.File;

public class GetPathUtil {
	public static File in_dir = new File(Main.in_dir);
	public static File out_dir = new File(Main.out_dir);
	public static File[] in_list = in_dir.listFiles();
	public static File[] out_list = out_dir.listFiles();

	public int getLength() {
		int num=0;
		for(int i=0; i<in_list.length; i++) {
			if(!in_list[i].isDirectory()) {
				num++;
			}
		}
		return num;
	}

	public int getOutLength() {
		int num=0;
		for(int i=0; i<out_list.length; i++) {
			if(!out_list[i].isDirectory()) {
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

		for(int i=0; i<in_list.length; i++) {
			if(in_list[i].isDirectory()) {

			}else {
				file[j]=in_list[i];
				j++;
			}
		}
		return file;
	}

	public File[] getDatPathList() {
		int num=0;
		int j=0;
		num=getOutLength();
		File[] file = new File[num];

		for(int i=0; i<out_list.length; i++) {
			if(out_list[i].isDirectory()) {

			}else {
				file[j]=out_list[i];
				j++;
			}
		}
		return file;
	}
}
