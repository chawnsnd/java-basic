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
			System.out.println("1.�ֿϵ������");
			System.out.println("2.��ü���");
			System.out.println("3.���α׷�����");
			System.out.println("===========================");
			System.out.print("���� : ");
			oper = scanner.nextInt();
			scanner.nextLine();
			switch (oper) {
			case 1:
				System.out.print("�̸��� �Է� ���ּ���. : ");
				String name = scanner.nextLine();
				System.out.print("������ �Է� ���ּ���. : ");
				String type = scanner.nextLine();
				System.out.print("���̸� �Է� ���ּ���. : ");
				int age = scanner.nextInt();
				Pet pet = new Pet(name, type, age);
				pets[count++] = pet;
				break;
			case 2:
				for(int i=0; i<count; i++) System.out.println(pets[i].toString());
				break;
			case 3:
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
				break;
			default:
				System.out.println("�ùٸ� ������ �ϼ���.");
				break;
			}
		}
	}
}
