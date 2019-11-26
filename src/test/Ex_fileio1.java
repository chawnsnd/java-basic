package test;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex_fileio1 {

	public static void main(String[] args) {
		String path = "/home/junwoong/sesoc/IT/fio/test.txt";
		try (FileOutputStream fos = new FileOutputStream(path);) {
//			fos.write(97);
//			fos.write(98);
//			fos.write(99);
			
			byte[] arr = {97, 98, 99, 100};
			fos.write(arr, 0, arr.length);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

//		finally {
//			try {
//				fos.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}
