package assignment.assignment191119;

import java.io.Serializable;

public class Student extends Human implements Serializable{

	private String ssn;

	public Student(String ssn, String name, int age, String stNum) {
		super(ssn, name, age);
		this.ssn = stNum;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public void print() {
		super.print();
		System.out.print("학번 : " + ssn+"  ");
	}
}
