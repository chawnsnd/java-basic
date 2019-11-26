package assignment.assignment191024;

public class Student {

	String name;
	String phoneNumber;
	int regNum;

	public Student() {
	}

	public Student(String name, String phoneNumber, int regNum) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.regNum = regNum;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", phoneNumber=" + phoneNumber + ", regNum=" + regNum + "]";
	}

}
