package assignment.assignment191108;

public class Staff extends Human {

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
