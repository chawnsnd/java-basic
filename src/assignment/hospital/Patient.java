package assignment.hospital;

public class Patient implements Comparable<Patient> {
	private int no;
	private String medicalCode;
	private int hospitalizationDays;
	private int age;

	public Patient(int no, String medicalCode, int hospitalizationDays, int age) {
		this.no = no;
		this.medicalCode = medicalCode;
		this.hospitalizationDays = hospitalizationDays;
		this.age = age;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getMedicalCode() {
		return medicalCode;
	}

	public void setMedicalCode(String medicalCode) {
		this.medicalCode = medicalCode;
	}

	public int getHospitalizationDays() {
		return hospitalizationDays;
	}

	public void setHospitalizationDays(int hospitalizationDays) {
		this.hospitalizationDays = hospitalizationDays;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Patient patient) {
        if (this.no < patient.getNo()) {
            return -1;
        } else if (this.no > patient.getNo()) {
            return 1;
        }
        return 0;
    }

}
