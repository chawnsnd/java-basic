package test;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex_fileio2 {
	public static void main(String[] args) {

		String path = "/home/junwoong/sesoc/IT/fio/test.txt";
		try (FileInputStream fis = new FileInputStream(path);) {
//			while (true) {
//				int num = fis.read();
//				if (num == -1)
//					break;
//				System.out.println((char) num);
//			}

			byte[] b = new byte[3];
			while (true) {
				int num = fis.read(b);
				if (num == -1)
					break;
				for (int i = 0; i < num; i++) {
					System.out.println(b[i]);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println(fis.read());