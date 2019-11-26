package assignment.assignment191024;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		StudentManager sm = new StudentManager();
		sm.insertStudent("���ؿ�", "010-2542-4536", 1);
		sm.insertStudent("ȫ�浿", "010-1111-1111", 2);
		sm.insertStudent("��ƹ���", "010-2222-2222", 3);
		
		Student student;
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("������ �Է��ϼ��� (1. ��Ϲ�ȣ), (2. �̸�, ��ȭ��ȣ) : ");
			int oper = sc.nextInt();
			switch (oper) {
			case 1:
				Scanner sc1 = new Scanner(System.in);
				System.out.print("��Ϲ�ȣ : ");
				int regNum = sc1.nextInt();
				student = sm.findStudent(regNum);
				if(student == null) {
					System.out.println("���ǿ� �´� �л��� ã�� �� �����ϴ�.");
				}else {
					System.out.println(student);
				}
				break;

			case 2:
				Scanner sc2 = new Scanner(System.in);
				System.out.print("�̸� : ");
				String name = sc2.nextLine();
				System.out.print("��ȭ��ȣ : ");
				String phoneNumber = sc2.nextLine();
				student = sm.findStudent(name, phoneNumber);
				if(student == null) {
					System.out.println("���ǿ� �´� �л��� ã�� �� �����ϴ�.");
				}else {
					System.out.println(student);
				}
				break;
			default:
				System.out.println("�ùٸ� ������ �Է��ϼ���");
				break;
			}
		}
	}
}
