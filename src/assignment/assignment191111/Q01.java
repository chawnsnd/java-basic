package assignment.assignment191111;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q01 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		while(true) {
			System.out.print("영문자 입력 :　");
			String str = scanner.nextLine();
			if(str.equals("0")) break;
			list.add(str);
		}
		Collections.sort(list);
		System.out.println("정렬 결과");
		System.out.println("==============");
		for (String str : list) System.out.println(str);
		System.out.println("==============");
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
		
	}
}
