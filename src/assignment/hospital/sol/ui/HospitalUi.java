package assignment.hospital.sol.ui;

import java.util.ArrayList;
import java.util.Scanner;

import assignment.hospital.sol.service.HospitalManager;
import assignment.hospital.sol.vo.Data;

public class HospitalUi {

	Scanner sc = new Scanner(System.in);
	HospitalManager hm = new HospitalManager();
	
	public void printMainMenu() {
		System.out.println("=======병원관리 프로그램=======");
		System.out.println("1. 환자입력");
		System.out.println("2. 전체출력");
		System.out.print("선택 -> ");
	}
	
	public void printAll() {
		System.out.println("================================");
		System.out.println("번호\t진찰부서\t진찰비\t입원비\t진료비");
		System.out.println("================================");
		ArrayList<String> result = hm.printAll();
		for (String string : result) {
			System.out.println(string);
		}
	}
	
	public boolean insertData() {
		System.out.print("번호 : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("진료코드 : ");
		String code = sc.nextLine();
		System.out.print("입원일수 : ");
		int stay = sc.nextInt();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		Data data = new Data(id, code, stay, age);
		return hm.insertData(data);
	}
	
	public void exec() {
		while(true){
			printMainMenu();
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				boolean result = insertData();
				if(result) System.out.println("등록 성공");
				else System.out.println("등록 실패");
				break;
			case 2:
				hm.sortData();
				printAll();
				break;
			case 0:
				return;
			}
		}
	}
	
}
