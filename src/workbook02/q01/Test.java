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
			System.out.println("1.���");
			System.out.println("2.���");
			System.out.println("===========================");
			System.out.print("���� : ");
			oper = scanner.nextInt();
			scanner.nextLine();
			switch (oper) {
			case 1:
				System.out.print("ID �Է� : ");
				String id = scanner.nextLine();
				System.out.print("PW �Է� : ");
				String password = scanner.nextLine();
				System.out.print("�̸� �Է� : ");
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
					System.out.println("�̸� : " + users[i].name);
					if(i!=count-1) System.out.println("-----------------------");
				}
				break;
			default:
				System.out.println("�ùٸ� ������ �ϼ���.");
				break;
			}
		}
	}
}
