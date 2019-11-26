package workbook02.q08;

import java.util.Scanner;

public class BreadUi{
	
	Scanner scanner = new Scanner(System.in);
	BreadManager breadManager = new BreadManager();
	
	public void run() {
		while(true) {
			System.out.println("==============");
			System.out.println("1.제품등록");
			System.out.println("2.제품전체출력");
			System.out.println("3.제품삭제");
			System.out.println("4.제품번호로 검색");
			System.out.println("5.프로그램종료");
			System.out.println("==============");
			System.out.print("선택 : ");
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
				System.out.println("올바른 메뉴를 선택해주세요");
				break;
			}
		}
	}

	private void insert() {
		System.out.print("빵이름 입력 : ");
		String name = scanner.nextLine();
		System.out.print("제품번호 입력 : ");
		String num = scanner.nextLine();
		System.out.print("제작자 입력 : ");
		String producer = scanner.nextLine();
		System.out.print("가격 입력 : ");
		int price = scanner.nextInt();
		Bread bread = new Bread(name, num, producer, price);
		int res = breadManager.insertBread(bread);
		if(res == 1) System.out.println("등록완료");
		else if(res == -1) System.out.println("등록실패 - 중복된 제품번호입니다");
	}

	private void list() {
		Bread[] breads = breadManager.allBreads();
		for (Bread bread : breads) {
			bread.print();
		}
	}
	
	private void delete() {
		System.out.print("제품번호 입력 : ");
		String num = scanner.nextLine();
		breadManager.deleteBread(num);
		
	}
	
	private void find() {
		System.out.print("제품번호 입력 : ");
		String num = scanner.nextLine();
		Bread bread = breadManager.findBread(num);
		if(bread==null) {
			System.out.println("찾을 수 없습니다.");
		}else {
			bread.print();
		}
	}
	
	private void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}

}
