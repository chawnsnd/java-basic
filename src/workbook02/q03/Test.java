package workbook02.q03;

import java.util.Scanner;

public class Test {

	private static Scanner scanner = new Scanner(System.in);
	private static int oper;

	public static void main(String[] args) {
		Pet[] pets = new Pet[100];
		int count = 0;
		while (true) {
			System.out.println("==========PetShop==========");
			System.out.println("1.애완동물등록");
			System.out.println("2.전체출력");
			System.out.println("3.프로그램종료");
			System.out.println("===========================");
			System.out.print("선택 : ");
			oper = scanner.nextInt();
			scanner.nextLine();
			switch (oper) {
			case 1:
				System.out.print("이름을 입력 해주세요. : ");
				String name = scanner.nextLine();
				System.out.print("종류를 입력 해주세요. : ");
				String type = scanner.nextLine();
				System.out.print("나이를 입력 해주세요. : ");
				int age = scanner.nextInt();
				Pet pet = new Pet(name, type, age);
				pets[count++] = pet;
				break;
			case 2:
				for(int i=0; i<count; i++) System.out.println(pets[i].toString());
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("올바른 선택을 하세요.");
				break;
			}
		}
	}
}
