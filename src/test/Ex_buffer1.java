package test;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex_buffer1 {

	public static void main(String[] args) {

		String path = "/home/junwoong/sesoc/IT/fio/test.mp4";
		String cpPath = "/home/junwoong/sesoc/IT/fio/test_copy.mp4";

//		try (FileInputStream fis = new FileInputStream(path);
//				FileOutputStream fos = new FileOutputStream(cpPath);) {
//			byte[] b = new byte[512];
//			while (true) {
//				int len = fis.read(b);
//				if (len == -1)
//					break;
//				fos.write(b, 0, len);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		// 버퍼를 사용 -> 효율이 좋음
		try (FileInputStream fis = new FileInputStream(path);
				FileOutputStream fos = new FileOutputStream(cpPath);
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos);) {
			while(true) {
				int b = bis.read();
				if(b == -1)
					break;
				bos.write(b); // 1byte 씩이니깐 범위지정 할 필요 없음
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
