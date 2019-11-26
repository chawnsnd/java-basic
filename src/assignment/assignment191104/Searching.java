package assignment.assignment191104;

import java.util.Scanner;

public class Searching {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("문자열 개수 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		String[] strings = new String[num];
		System.out.print("검색할 키워드 : ");
		String keyword = sc.nextLine();
		System.out.println("문자열들 입력 ");
		for(int i=0; i<strings.length; i++) {
			strings[i] = sc.nextLine();
		}
		System.out.println("출력 ");
		boolean flag = false;
		for(int i=0; i<strings.length; i++) {
			if(strings[i].indexOf(keyword)!=-1) {
				System.out.println(strings[i]);
				flag = true;
			}
		}
		if(!flag) System.out.println("None");
	}
}
