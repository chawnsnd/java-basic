package assignment.assignment191119;

import java.io.Serializable;

public class Professor extends Human implements Serializable{

	private String major;

	public Professor(String num, String name, int age, String major) {
		super(num, name, age);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public void print() {
		super.print();
		System.out.print("전공 : " + major+"  ");
	}
}
