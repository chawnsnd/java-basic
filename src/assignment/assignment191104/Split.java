package assignment.assignment191104;

import java.util.Scanner;

public class Split {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = sc.nextLine();
		String[] strs = str.split(" ");
		System.out.print("출력 : ");
		for(int i=0; i<strs.length; i++) {
			System.out.print(strs[i].charAt(0));
			if(i<strs.length-1) System.out.print(", ");
		}
		
	}
}
