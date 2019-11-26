package assignment.assignment191119;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SchoolUI {

	private SchoolManager schoolManager = new SchoolManager();
	private Scanner scanner = new Scanner(System.in);

	public void printMainMenu() {
		System.out.println("=====================");
		System.out.println("|| 직원 관리 시스템 ||");
		System.out.println("=====================");
		System.out.println("1. 등록");
		System.out.println("2. 찾기");
		System.out.println("3. 삭제");
		System.out.println("4. 전체 출력");
		System.out.println("5. 종료");
		System.out.println("==============");
		System.out.print("메뉴 선택 => ");
	}

	public void printInsertHumanMenu() {
		System.out.println("==============");
		System.out.println("|| 등록 메뉴 ||");
		System.out.println("==============");
		System.out.println("1. 학생");
		System.out.println("2. 직원");
		System.out.println("3. 교수");
		System.out.println("4. 상위 메뉴");
		System.out.println("==============");
		System.out.print("메뉴 선택 => ");
	}

	public void printAll() {
		schoolManager.printAll();
	}

	public boolean insertStudent() {
		int age;
		String name, sn, ssn;
		System.out.println("==============");
		System.out.println("|| 학생 등록 ||");
		System.out.println("==============");
		try {
			System.out.print("이름 : ");
			name = scanner.nextLine();
			System.out.print("나이 : ");
			age = scanner.nextInt();
			scanner.nextLine();
			System.out.print("주민번호 : ");
			sn = scanner.nextLine();
			System.out.print("학번 : ");
			ssn = scanner.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("잘못된 입력");
			scanner.nextLine();
			return false;
		}
		Human human = new Student(sn, name, age, ssn);
		return schoolManager.insertHuman(human);
	}

	public boolean insertStaff() {
		int age;
		String name, sn, field;
		System.out.println("==============");
		System.out.println("|| 직원 등록 ||");
		System.out.println("==============");
		try {
			System.out.print("이름 : ");
			name = scanner.nextLine();
			System.out.print("나이 : ");
			age = scanner.nextInt();
			scanner.nextLine();
			System.out.print("주민번호 : ");
			sn = scanner.nextLine();
			System.out.print("부서 : ");
			field = scanner.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("잘못된 입력");
			scanner.nextLine();
			return false;
		}
		Human human = new Staff(sn, name, age, field);
		return schoolManager.insertHuman(human);
	}

	public boolean insertProfessor() {
		int age;
		String name, sn, major;
		System.out.println("==============");
		System.out.println("|| 교수 등록 ||");
		System.out.println("==============");
		try {
			System.out.print("이름 : ");
			name = scanner.nextLine();
			System.out.print("나이 : ");
			age = scanner.nextInt();
			scanner.nextLine();
			System.out.print("주민번호 : ");
			sn = scanner.nextLine();
			System.out.print("전공 : ");
			major = scanner.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("잘못된 입력");
			scanner.nextLine();
			return false;
		}
		Human human = new Professor(sn, name, age, major);
		return schoolManager.insertHuman(human);
	}

	public void insertHuman() {
		while (true) {
			printInsertHumanMenu();
			try {
				int menu = scanner.nextInt();
				scanner.nextLine();
				System.out.println();
				switch (menu) {
				case 1:
					System.out.println(insertStudent() ? "정상 등록 완료" : "등록 오류");
					break;
				case 2:
					System.out.println(insertStaff() ? "정상 등록 완료" : "등록 오류");
					break;
				case 3:
					System.out.println(insertProfessor() ? "정상 등록 완료" : "등록 오류");
					break;
				case 4:
					return;
				default:
					System.out.println("잘못된 입력");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력해주세요");
				scanner.nextLine();
			}
		}
	}

	public boolean deleteHuman() {
		System.out.println("==========");
		System.out.println("|| 삭제 ||");
		System.out.println("==========");
		System.out.print("주민번호 : ");
		String num = scanner.nextLine();
		Human human = schoolManager.findHuman(num);
		if (human == null)
			return false;
		return schoolManager.deleteHuman(human);
	}

	public Human findHuman() {
		System.out.println("==========");
		System.out.println("|| 찾기 ||");
		System.out.println("==========");
		System.out.print("주민번호 : ");
		String num = scanner.nextLine();
		return schoolManager.findHuman(num);
	}

	public void saveBackup() {
		schoolManager.saveBackup();
	}
	
	public void exec() {
		while (true) {
			printMainMenu();
			try {
				int menu = scanner.nextInt();
				scanner.nextLine();
				System.out.println();
				switch (menu) {
				case 1:
					insertHuman();
					break;
				case 2:
					Human human = findHuman();
					if (human != null) {
						human.print();
						System.out.println();
					} else {
						System.out.println("일치하는 정보 없음");
					}
					break;
				case 3:
					System.out.println(deleteHuman() ? "삭제 성공" : "삭제 실패");
					break;
				case 4:
					printAll();
					break;
				case 5:
					saveBackup();
					return;
				default:
					System.out.println("잘못된 입력");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력해주세요");
				scanner.nextLine();
			}
		}
	}
}
