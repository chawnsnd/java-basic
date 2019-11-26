package assignment.assignment191118;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
//		sc = new Scanner(System.in);
//
//		String path = "/home/junwoong/sesoc/IT/fio/assignment.txt";
//		List<String> list = new ArrayList<>();
//		while (true) {
//			System.out.print("입력 : ");
//			String str = sc.nextLine();
//			if (str.equals("exit"))
//				break;
//			list.add(str);
//		}
//		try (FileWriter fw = new FileWriter(path)) {
//			for (int i = 0;; i++) {
//				fw.write(list.get(i));
//				if (i == list.size() - 1)
//					break;
//				fw.write("\n");
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		try(Scanner scanner = new Scanner(System.in);
				FileWriter fw = new FileWriter("/home/junwoong/sesoc/IT/fio/assignment.txt");
				FileReader fr = new FileReader("/home/junwoong/sesoc/IT/fio/assignment.txt")){
			while(true) {
				System.out.print("입력 : ");
				String str = scanner.nextLine();
				if(str.equals("exit")) break;
				fw.write(str + "\r\n");
			}
			fw.flush();
			while(true) {
				int len = fr.read();
				if(len == -1) break;
				System.out.print((char)len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
