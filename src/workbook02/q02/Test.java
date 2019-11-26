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
			System.out.println("1.예약");
			System.out.println("2.조회");
			System.out.println("3.전체출력");
			System.out.println("4.프로그램종료");
			System.out.println("===========================");
			System.out.print("선택 : ");
			oper = scanner.nextInt();
			scanner.nextLine();
			switch (oper) {
			case 1:
				System.out.print("이름을 입력 : ");
				String name = scanner.nextLine();
				System.out.print("차번호를 입력 : ");
				String carNum = scanner.nextLine();
				System.out.print("전화번호를 입력 : ");
				String phoneNum = scanner.nextLine();
				System.out.print("위치를 입력 : ");
				String location = scanner.nextLine();
				Booking booking = new Booking();
				booking.setCarNum(carNum);
				booking.setLocation(location);
				booking.setName(name);
				booking.setPhoneNum(phoneNum);
				bookings[count++] = booking;
				break;
			case 2:
				System.out.print("전화번호 입력 : ");
				String pn = scanner.nextLine();
				Booking bk = null;
				for(int i=0; i<count; i++) {
					if(pn.equals(bookings[i].getPhoneNum())) bk = bookings[i];
				}
				if(bk == null) {
					System.out.println("검색결과가 없습니다.");
				}else {
					System.out.println("이름 : " + bk.getName());
					System.out.println("차번호 : " + bk.getCarNum());
					System.out.println("전화번호 : " + bk.getPhoneNum());
					System.out.println("위치 : " + bk.getLocation());
				}
				break;
			case 3:
				for(int i=0; i<count; i++) {
					System.out.println("이름 : " + bookings[i].getName());
					System.out.println("차번호 : " + bookings[i].getCarNum());
					System.out.println("전화번호 : " + bookings[i].getPhoneNum());
					System.out.println("위치 : " + bookings[i].getLocation());
					if(i!=count-1) System.out.println("-----------------------");
				}
				break;
			case 4:
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
