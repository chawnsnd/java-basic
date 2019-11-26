package workbook02.q02;

import java.util.Scanner;

public class Test {

	private static Scanner scanner = new Scanner(System.in);
	private static int oper;

	public static void main(String[] args) {
		Booking[] bookings = new Booking[100];
		int count = 0;
		while (true) {
			System.out.println("===========================");
			System.out.println("1.����");
			System.out.println("2.��ȸ");
			System.out.println("3.��ü���");
			System.out.println("4.���α׷�����");
			System.out.println("===========================");
			System.out.print("���� : ");
			oper = scanner.nextInt();
			scanner.nextLine();
			switch (oper) {
			case 1:
				System.out.print("�̸��� �Է� : ");
				String name = scanner.nextLine();
				System.out.print("����ȣ�� �Է� : ");
				String carNum = scanner.nextLine();
				System.out.print("��ȭ��ȣ�� �Է� : ");
				String phoneNum = scanner.nextLine();
				System.out.print("��ġ�� �Է� : ");
				String location = scanner.nextLine();
				Booking booking = new Booking();
				booking.setCarNum(carNum);
				booking.setLocation(location);
				booking.setName(name);
				booking.setPhoneNum(phoneNum);
				bookings[count++] = booking;
				break;
			case 2:
				System.out.print("��ȭ��ȣ �Է� : ");
				String pn = scanner.nextLine();
				Booking bk = null;
				for(int i=0; i<count; i++) {
					if(pn.equals(bookings[i].getPhoneNum())) bk = bookings[i];
				}
				if(bk == null) {
					System.out.println("�˻������ �����ϴ�.");
				}else {
					System.out.println("�̸� : " + bk.getName());
					System.out.println("����ȣ : " + bk.getCarNum());
					System.out.println("��ȭ��ȣ : " + bk.getPhoneNum());
					System.out.println("��ġ : " + bk.getLocation());
				}
				break;
			case 3:
				for(int i=0; i<count; i++) {
					System.out.println("�̸� : " + bookings[i].getName());
					System.out.println("����ȣ : " + bookings[i].getCarNum());
					System.out.println("��ȭ��ȣ : " + bookings[i].getPhoneNum());
					System.out.println("��ġ : " + bookings[i].getLocation());
					if(i!=count-1) System.out.println("-----------------------");
				}
				break;
			case 4:
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
