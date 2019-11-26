package assignment.hospital.util;

public class HospitalUtil {
	
	// 총입원비 계산
	public static int calcTotalAdmissionFee(int hospitalizationDays) {
		int oneDay = hospitalizationDays <= 3 ? 30000 : 25000;
		return oneDay * hospitalizationDays;
	}

	// 입원비 계산
	public static int calcHospitalizationFee(int hospitalizationDays) {
		double discountRate;
		if (hospitalizationDays < 10) {
			discountRate = 1;
		} else if (hospitalizationDays >= 10 && hospitalizationDays < 15) {
			discountRate = 0.85;
		} else if (hospitalizationDays >= 15 && hospitalizationDays < 20) {
			discountRate = 0.8;
		} else if (hospitalizationDays >= 20 && hospitalizationDays < 30) {
			discountRate = 0.77;
		} else if (hospitalizationDays >= 30 && hospitalizationDays < 100) {
			discountRate = 0.72;
		} else {
			discountRate = 0.68;
		}
		return (int) (calcTotalAdmissionFee(hospitalizationDays) * discountRate);
	}

	// 진찰비 계산
	public static int calcConsultationFee(int age) {
		int consultationFee;
		if (age < 10) {
			consultationFee = 7000;
		} else if (age >= 10 && age < 20) {
			consultationFee = 5000;
		} else if (age >= 20 && age < 30) {
			consultationFee = 8000;
		} else if (age >= 30 && age < 40) {
			consultationFee = 7000;
		} else if (age >= 40 && age < 50) {
			consultationFee = 4500;
		} else {
			consultationFee = 2300;
		}
		return consultationFee;
	}

	// 진료비 계산
	public static int calcMedicalExpenses(int age, int hospitalizationDays) {
		return calcConsultationFee(age) + calcHospitalizationFee(hospitalizationDays);
	}

	// 진찰부서변환
	public static String medicalCodeToConsultingDepartment(String medicalCode) {
		switch (medicalCode) {
		case "MI":
			return "외과";
		case "NI":
			return "내과";
		case "SI":
			return "피부과";
		case "TI":
			return "소아과";
		case "VI":
			return "산부인과";
		case "WI":
			return "비뇨기과";
		default:
			return "찾을 수 없음";
		}
	}
}
