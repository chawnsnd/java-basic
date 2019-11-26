package workbook02.q08;

import java.util.Scanner;

public class BreadUi{
	
	Scanner scanner = new Scanner(System.in);
	BreadManager breadManager = new BreadManager();
	
	public void run() {
		while(true) {
			System.out.println("==============");
			System.out.println("1.��ǰ���");
			System.out.println("2.��ǰ��ü���");
			System.out.println("3.��ǰ����");
			System.out.println("4.��ǰ��ȣ�� �˻�");
			System.out.println("5.���α׷�����");
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
				delete();
				break;
			case 4:
				find();
				break;
			case 5:
				exit();
				break;
			default:
				System.out.println("�ùٸ� �޴��� �������ּ���");
				break;
			}
		}
	}

	private void insert() {
		System.out.print("���̸� �Է� : ");
		String name = scanner.nextLine();
		System.out.print("��ǰ��ȣ �Է� : ");
		String num = scanner.nextLine();
		System.out.print("������ �Է� : ");
		String producer = scanner.nextLine();
		System.out.print("���� �Է� : ");
		int price = scanner.nextInt();
		Bread bread = new Bread(name, num, producer, price);
		int res = breadManager.insertBread(bread);
		if(res == 1) System.out.println("��ϿϷ�");
		else if(res == -1) System.out.println("��Ͻ��� - �ߺ��� ��ǰ��ȣ�Դϴ�");
	}

	private void list() {
		Bread[] breads = breadManager.allBreads();
		for (Bread bread : breads) {
			bread.print();
		}
	}
	
	private void delete() {
		System.out.print("��ǰ��ȣ �Է� : ");
		String num = scanner.nextLine();
		breadManager.deleteBread(num);
		
	}
	
	private void find() {
		System.out.print("��ǰ��ȣ �Է� : ");
		String num = scanner.nextLine();
		Bread bread = breadManager.findBread(num);
		if(bread==null) {
			System.out.println("ã�� �� �����ϴ�.");
		}else {
			bread.print();
		}
	}
	
	private void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}

}
