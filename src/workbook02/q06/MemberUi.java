package workbook02.q06;

import java.util.Scanner;

public class MemberUi{
	private MemberManager memberManager = new MemberManager();
	private Scanner scanner = new Scanner(System.in);

	public void run() {
		while(true) {
			System.out.println("==============");
			System.out.println("1.���");
			System.out.println("2.��ü���");
			System.out.println("3.����");
			System.out.println("==============");
			System.out.print("���� : ");
			int menu = scanner.nextInt();
			scanner.nextLine();
			switch (menu) {
			case 1:
				insert();
				break;
			case 2:
				list();
				break;
			case 3:
				exit();
				break;
			default:
				System.out.println("�ùٸ� �޴��� �������ּ���");
				break;
			}
		}
	}
	
	private void insert() {
		System.out.print("�̸� �Է� : ");
		String name = scanner.nextLine();
		System.out.print("ȸ����ȣ �Է� : ");
		String num = scanner.nextLine();
		System.out.print("������ �Է� : ");
		int weight = scanner.nextInt();
		System.out.print("Ű �Է� : ");
		int height = scanner.nextInt();
		Member member = new Member(name, num, height, weight);
		if(memberManager.insertMember(member)==-1) System.out.println("��Ͻ��� - ���� ȸ����ȣ�� �ֽ��ϴ�.");
	}
	
	private void list() {
		Member[] members = memberManager.allMembers();
		for (Member member : members) {
			System.out.println(member.toString());
		}
	}
	
	private void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}

}
