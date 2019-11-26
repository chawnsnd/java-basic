package assignment.hospital;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import assignment.hospital.util.HospitalUtil;

public class HospitalUI {

	private HospitalManager hospitalManager = new HospitalManager();
	private Scanner scanner = new Scanner(System.in);

	public void exec() {
		while (true) {
			try {
				System.out.println("=======병원관리 프로그램=======");
				System.out.println("1. 환자입력");
				System.out.println("2. 전체출력");
				System.out.print("선택 -> ");
				int menu = scanner.nextInt();
				scanner.nextLine();
				switch (menu) {
				case 1:
					System.out.println(insertPatient() ? "등록 성공" : "등록 실패");
					break;
				case 2:
					printAllPatients();
					break;
				default:
					System.out.println("!메뉴를 제대로 입력해주세요.");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("!숫자를 입력해주세요.");
				scanner.nextLine();
			}finally {
				System.out.println();
			}
		}
	}

	private boolean insertPatient() {
		while (true) {
			try {
				System.out.println("==환자입력==");
				System.out.print("번호 : ");
				int no = scanner.nextInt();
				scanner.nextLine();
				System.out.print("진료코드 : ");
				String medicalCode = scanner.nextLine();
				System.out.print("입원일수 : ");
				int hospitalizationDays = scanner.nextInt();
				scanner.nextLine();
				System.out.print("나이 : ");
				int age = scanner.nextInt();
				scanner.nextLine();
				Patient patient = new Patient(no, medicalCode, hospitalizationDays, age);
				return hospitalManager.insertPatient(patient);
			} catch (InputMismatchException e) {
				System.out.println("!제대로 입력해주세요.");
				scanner.nextLine();
			}finally {
				System.out.println();
			}
		}
	}

	private void printAllPatients() {
		System.out.println("-------------------------------------------");
		System.out.println(" 번호 | 진찰부서 | 진찰비 | 입원비 | 진료비 ");
		System.out.println("-------------------------------------------");
		List<Patient> patientList = hospitalManager.patientList();
		DecimalFormat decimalFormat = new DecimalFormat("###,###");
		for (Patient patient : patientList) {
			System.out.print(patient.getNo() + "  "); // 번호
			System.out.print(HospitalUtil.medicalCodeToConsultingDepartment(patient.getMedicalCode()) + "    "); // 진찰부서
			System.out.print(decimalFormat.format(HospitalUtil.calcConsultationFee(patient.getAge())) + "    "); // 진찰비
			System.out.print(
					decimalFormat.format(HospitalUtil.calcHospitalizationFee(patient.getHospitalizationDays()))
							+ "    "); // 입원비
			System.out.print(decimalFormat
					.format(HospitalUtil.calcMedicalExpenses(patient.getAge(), patient.getHospitalizationDays()))
					+ "    "); // 진료비
			System.out.println();
		}
		System.out.println();
		return;
	}
}
