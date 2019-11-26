package workbook02.q06;

import java.util.Scanner;

public class MemberUi{
	private MemberManager memberManager = new MemberManager();
	private Scanner scanner = new Scanner(System.in);

	public void run() {
		while(true) {
			System.out.println("==============");
			System.out.println("1.등록");
			System.out.println("2.전체출력");
			System.out.println("3.종료");
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
				exit();
				break;
			default:
				System.out.println("올바른 메뉴를 선택해주세요");
				break;
			}
		}
	}
	
	private void insert() {
		System.out.print("이름 입력 : ");
		String name = scanner.nextLine();
		System.out.print("회원번호 입력 : ");
		String num = scanner.nextLine();
		System.out.print("몸무게 입력 : ");
		int weight = scanner.nextInt();
		System.out.print("키 입력 : ");
		int height = scanner.nextInt();
		Member member = new Member(name, num, height, weight);
		if(memberManager.insertMember(member)==-1) System.out.println("등록실패 - 같은 회원번호가 있습니다.");
	}
	
	private void list() {
		Member[] members = memberManager.allMembers();
		for (Member member : members) {
			System.out.println(member.toString());
		}
	}
	
	private void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}

}
