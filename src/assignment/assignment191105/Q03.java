package assignment.assignment191105;

import java.util.Scanner;

public class Q03 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int[] numArr = new int[5];
		
		// 사용자로부터 입력 
		for(int i=0; i<numArr.length; i++) {
			System.out.print("-273 ~ 5526 범위의 수를 입력해주세요 : ");
			int num = scanner.nextInt();
			if(num<-273 || num>5526) {
				System.out.println("범위에 맞지 않는 수입니다.");
				i--;
			}else {
				numArr[i] = num;
			}
		}
		
		// 가까운 수 구하기
		int min = numArr[0];
		int close = Math.abs(numArr[0]);
		for(int i=1; i<numArr.length; i++) {
			if(min > numArr[i]) {
				min = numArr[i];
			}else if(Math.abs(numArr[i])==Math.abs(min)
					&&numArr[i]>min) {
				min = numArr[i];
			}
		}
		System.out.println(min);
	}
}
