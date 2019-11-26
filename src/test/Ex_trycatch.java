package test;
import java.util.Scanner;

public class Ex_trycatch {

	private static Scanner sc;

	public static void main(String[] args) {
		
		try {
			sc = new Scanner(System.in);
			System.out.print("숫자 입력 :　");
			String str = sc.nextLine();
			int num = Integer.parseInt(str);
			System.out.println(num);
			System.out.println(4 / num);
//		}catch (NumberFormatException e) {
//			System.out.println("숫자를 입력해주세요");
//		}catch (ArithmeticException ae) {
//			System.out.println("0 이외의 숫자를 입력해주세요");
//		}
		}catch (NumberFormatException | ArithmeticException e) {
			System.out.println("0 이외의 숫자를 입력해주세요");			
		}finally {
			System.out.println("무조건 실행");
		}

		System.out.println("프로그램 종료");
	}
}
