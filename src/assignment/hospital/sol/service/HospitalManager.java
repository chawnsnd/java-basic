package assignment.hospital.sol.service;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;

import assignment.hospital.sol.vo.Data;

public class HospitalManager {

	private ArrayList<Data> list = new ArrayList<>();

	public void sortData() {
//		for (int i = 0; i < list.size() - 1; i++) {
//			Data min = list.get(i);
//			for (int j = i + 1; j < list.size(); j++) {
//				Data max = list.get(j);
//				if (min.getId() > max.getId()) {
//					list.set(i, max);
//					list.set(j, min);
//					min = max;
//				}
//			}
//		}
		list.sort(new Comparator<Data>() {
			@Override
			public int compare(Data d1, Data d2) {
				if (d1.getId() > d2.getId()) {
					return 1;
				} else if (d1.getId() < d2.getId()) {
					return -1;
				} else
					return 0;
			}
		});
	}

	public boolean insertData(Data data) {
		for (Data d : list) {
			if (d.getId() == data.getId()) {
				return false;
			}
		}
		return list.add(data);
	}

	public String convCode(String code) {
		String result = "";
		switch (code) {
		case "MI":
			result = "외과";
			break;
		case "NI":
			result = "내과";
			break;
		case "SI":
			result = "피부과";
			break;
		case "TI":
			result = "소아과";
			break;
		case "VI":
			result = "산부인과";
			break;
		case "WI":
			result = "비뇨기과";
			break;
		}
		return result;
	}

	public int fee(int age) {
		int fee = 0;

		if (age < 10)
			fee = 7000;
		else if (age >= 10 && age < 20)
			fee = 5000;
		else if (age >= 20 && age < 30)
			fee = 8000;
		else if (age >= 30 && age < 40)
			fee = 7000;
		else if (age >= 40 && age < 50)
			fee = 4000;
		else
			fee = 2300;

		return fee;
	}

	public int hospitalBill(int stay) {
		int bill = 25000;

		if (stay <= 3)
			bill = 30000;

		double dc = 0.0;

		if (stay < 10)
			dc = 1.0;
		else if (stay >= 10 && stay < 15)
			dc = 0.85;
		else if (stay >= 15 && stay < 20)
			dc = 0.8;
		else if (stay >= 20 && stay < 30)
			dc = 0.77;
		else if (stay >= 30 && stay < 100)
			dc = 0.72;
		else
			dc = 0.68;

		return (int) (bill * stay * dc);
	}

	public ArrayList<String> printAll() {
		ArrayList<String> result = new ArrayList<>();
		DecimalFormat decimalFormat = new DecimalFormat("###,###");

		for (Data data : list) {
			int id = data.getId();
			String code = data.getCode();
			int stay = data.getStay();
			int age = data.getAge();

			// 입원비 7000 -> "7,000"
			String printHospitalBill = decimalFormat.format(hospitalBill(stay));

			// 진찰비
			String printFee = decimalFormat.format(fee(age));

			// 진료비
			String printTotal = decimalFormat.format(hospitalBill(stay) + fee(age));

			// 부서
			String printCode = convCode(code);

			String temp = String.format("%d\t%s\t%s\t%s\t%s", id, printCode, printFee, printHospitalBill, printTotal);
			result.add(temp);
		}
		return result;
	}
}
