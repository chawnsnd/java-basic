package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex_file {

	public static void main(String[] args) {

		File file = new File("/home/junwoong/sesoc/IT/fio/test.mp4");

		if (file.exists()) {
			if (file.isFile()) {
				System.out.println("파일입니다.");
				System.out.println("파일명 : " + file.getName());
				System.out.println("파일크기 : " + file.length() + "byte");
			} else {
				System.out.println("폴더입니다.");
			}
		} else {
			System.out.println("존재하지 않습니다.");
		}
		
		try(FileInputStream fis = new FileInputStream(file)) {
			fis.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
