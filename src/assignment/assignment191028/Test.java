package assignment.assignment191028;

import java.util.Scanner;

public class Test {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("�Է�1 : ");
		String str1 = sc .nextLine();
		System.out.print("�Է�2 : ");
		String str2 = sc .nextLine();
		int num1 = Hangle.toNum(str1);
		int num2 = Hangle.toNum(str2);
		System.out.println(num1+" + "+num2+" = "+(num1+num2));
	}
}
