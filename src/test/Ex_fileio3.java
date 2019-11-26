package test;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex_fileio3 {
	public static void main(String[] args) {
		String path = "/home/junwoong/sesoc/IT/fio/test.mp4";
		String cpPath = "/home/junwoong/sesoc/IT/fio/test_copy.mp4";

		try (FileInputStream fis = new FileInputStream(path); FileOutputStream fos = new FileOutputStream(cpPath);) {

			byte[] b = new byte[512];

			while (true) {
				int len = fis.read(b);
				if (len == -1)
					break;
				fos.write(b, 0, len);
			}

//			while (true) {
//				int num = fis.read();
//				if (num == -1)
//					break;
//				fos.write(num);
//			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
