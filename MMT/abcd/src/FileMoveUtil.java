import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileMoveUtil {
	Path src;
	Path dst;

	public FileMoveUtil(String src, String dst) {
		this.src = Paths.get(src);
		this.dst = Paths.get(dst);
	}

	public void moveFile()throws IOException{
		Files.move(this.src, this.dst, StandardCopyOption.REPLACE_EXISTING);
	}
}
