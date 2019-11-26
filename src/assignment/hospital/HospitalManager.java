package assignment.hospital;

import java.util.ArrayList;
import java.util.List;

public class HospitalManager {

	private List<Patient> patientList = new ArrayList<Patient>();

	
	// 넣을때부터 정렬해서 넣기
	public boolean insertPatient(Patient patient) {
		if (patientList.size() == 0)
			return patientList.add(patient);
		else {
			for (int i = 0; i < patientList.size();) {
				if (patientList.get(i).getNo() == patient.getNo())
					return false;
				else if (patientList.get(i).getNo() > patient.getNo()) {
					patientList.add(i, patient);
					return true;
				}else {
					return patientList.add(patient);
				}
			}
		}
		return false;
	}

	public List<Patient> patientList() {

//		Collections.sort(patientList);

		return patientList;
	}
}

// 정렬 알고리즘 직접 구현(선택 정렬)
//for (int i = 0; i < patientList.size(); i++) {
//	int idx = i;
//	for (int j = i + 1; j < patientList.size(); j++) {
//		if (patientList.get(idx).getNo() >= patientList.get(j).getNo()) {
//			idx = j;
//		}
//	}
//	Patient temp = patientList.get(idx);
//	patientList.set(idx, patientList.get(i));
//	patientList.set(i, temp);
//}

// Collections.sort 사용
//		Collections.sort(patientList);