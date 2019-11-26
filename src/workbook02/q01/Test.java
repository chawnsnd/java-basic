package workbook02.q01;

import java.util.Scanner;

public class Test {

	private static Scanner scanner = new Scanner(System.in);
	private static int oper;

	public static void main(String[] args) {
		User[] users = new User[100];
		int count = 0;
		while (true) {
			System.out.println("===========================");
			System.out.println("1.등록");
			System.out.println("2.출력");
			System.out.println("===========================");
			System.out.print("선택 : ");
			oper = scanner.nextInt();
			scanner.nextLine();
			switch (oper) {
			case 1:
				System.out.print("ID 입력 : ");
				String id = scanner.nextLine();
				System.out.print("PW 입력 : ");
				String password = scanner.nextLine();
				System.out.print("이름 입력 : ");
				String name = scanner.nextLine();
				User user = new User();
				user.id = id;
				user.password = password;
				user.name = name;
				users[count++] = user;
				break;
			case 2:
				for(int i=0; i<count; i++) {					
					System.out.println("ID : " + users[i].id);
					System.out.println("PW : " + users[i].password);
					System.out.println("이름 : " + users[i].name);
					if(i!=count-1) System.out.println("-----------------------");
				}
				break;
			default:
				System.out.println("올바른 선택을 하세요.");
				break;
			}
		}
	}
}
