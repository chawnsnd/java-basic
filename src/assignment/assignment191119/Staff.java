package assignment.assignment191119;

import java.io.Serializable;

public class Staff extends Human implements Serializable{

	private String field;

	public Staff(String num, String name, int age, String field) {
		super(num, name, age);
		this.field = field;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	@Override
	public void print() {
		super.print();
		System.out.print("부서 : " + field+"  ");
	}
}
