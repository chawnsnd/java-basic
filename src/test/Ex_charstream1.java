package test;
import java.io.FileWriter;
import java.io.IOException;

public class Ex_charstream1 {

	public static void main(String[] args) {
		String path = "/home/junwoong/sesoc/IT/fio/test.txt";
		
		// 유니코드는 사용못하는 문제(한글, 일본어 등), 아스키코드만 사용가능
//		try(FileOutputStream fos = new FileOutputStream(path)){
//			fos.write('가');
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		//유니코드도 사용 가능
		try(FileWriter fw = new FileWriter(path)){
			fw.write("가나다");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

