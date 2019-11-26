package assignment.assignment191106;

import java.util.Scanner;

public class SchoolUI {

	SchoolManager schoolManager = new SchoolManager();
	Scanner scanner = new Scanner(System.in);

	public void printMainMenu() {
		System.out.println("=====================");
		System.out.println("|| 직원 관리 시스템 ||");
		System.out.println("=====================");
		System.out.println("1. 등록");
		System.out.println("2. 전체 출력");
		System.out.println("3. 종료");
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
	
	public void insertStudent() {
		System.out.println("==============");
		System.out.println("|| 학생 등록 ||");
		System.out.println("==============");
		System.out.print("이름 : ");
		String name = scanner.nextLine();
		System.out.print("나이 : ");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.print("주민번호 : ");
		String num = scanner.nextLine();
		System.out.print("학번 : ");
		String stNum = scanner.nextLine();
		Human human = new Student(num, name, age, stNum);
		if (schoolManager.insertHuman(human)) {
			System.out.println("정상 등록 완료");
		} else {
			System.out.println("등록 오류(이미 존재하는 주민번호 또는 학번)");
		}
	}
	
	public void insertStaff() {
		System.out.println("==============");
		System.out.println("|| 직원 등록 ||");
		System.out.println("==============");
		System.out.print("이름 : ");
		String name = scanner.nextLine();
		System.out.print("나이 : ");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.print("주민번호 : ");
		String num = scanner.nextLine();
		System.out.print("부서 : ");
		String field = scanner.nextLine();
		Human human = new Staff(num, name, age, field);
		if (schoolManager.insertHuman(human)) {
			System.out.println("정상 등록 완료");
		} else {
			System.out.println("등록 오류(이미 존재하는 주민번호)");
		}
	}
	
	public void insertProfessor() {
		System.out.println("==============");
		System.out.println("|| 교수 등록 ||");
		System.out.println("==============");
		System.out.print("이름 : ");
		String name = scanner.nextLine();
		System.out.print("나이 : ");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.print("주민번호 : ");
		String num = scanner.nextLine();
		System.out.print("전공 : ");
		String major = scanner.nextLine();
		Human human = new Professor(num, name, age, major);
		if (schoolManager.insertHuman(human)) {
			System.out.println("정상 등록 완료");
		} else {
			System.out.println("등록 오류(이미 존재하는 주민번호)");
		}
	}
	
	public void insertHuman() {
		while(true) {
			printInsertHumanMenu();
			int menu = scanner.nextInt();
			scanner.nextLine(); 
			switch (menu) {
			case 1:
				insertStudent();
				break;
			case 2:
				insertStaff();
				break;
			case 3:
				insertProfessor();
				break;
			case 4:
				return;
			default:
				System.out.println("잘못된 입력");
				break;
			}
		}
	}
	
	public void exec() {
		while (true) {
			printMainMenu();
			int menu = scanner.nextInt();
			scanner.nextLine();
			switch (menu) {
			case 1:
				insertHuman();
				break;
			case 2:
				printAll();
				break;
			case 3:
				return;
			default:
				System.out.println("잘못된 입력");
				break;
			}
		}
		
	}
}
