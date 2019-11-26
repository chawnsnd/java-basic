//package workbook02.q05;
//
//import java.util.Scanner;
//
//public class PeopleUi{
//	private PeopleManager peopleManager = new PeopleManager();
//	private Scanner scanner = new Scanner(System.in);
//
//	public void run() {
//		while(true) {
//			System.out.println("==============");
//			System.out.println("1.���");
//			System.out.println("2.��ü���");
//			System.out.println("3.����");
//			System.out.println("==============");
//			System.out.print("���� : ");
//			int menu = scanner.nextInt();
//			scanner.nextLine();
//			switch (menu) {
//			case 1:
//				insert();
//				break;
//			case 2:
//				list();
//				break;
//			case 3:
//				exit();
//				break;
//			default:
//				System.out.println("�ùٸ� �޴��� �������ּ���");
//				break;
//			}
//		}
//	}
//	
//	private void insert() {
//		System.out.print("�̸� �Է� : ");
//		String name = scanner.nextLine();
//		System.out.print("�ֹι�ȣ �Է� : ");
//		String num = scanner.nextLine();
//		People people = new People(name, num);
//		peopleManager.insertPeople(people);
//	}
//	
//	private void list() {
//		People[] peoples = peopleManager.allPeople();
//		for (People people : peoples) {
//			System.out.println(people.toString());
//		}
//	}
//	
//	private void exit() {
//		System.out.println("���α׷��� �����մϴ�.");
//		System.exit(0);
//	}
//
//}
