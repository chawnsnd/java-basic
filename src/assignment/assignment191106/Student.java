package assignment.assignment191106;

public class Student extends Human {

	private String stNum;

	public Student(String num, String name, int age, String stNum) {
		super(num, name, age);
		this.stNum = stNum;
	}

	public String getStNum() {
		return stNum;
	}

	public void setStNum(String stNum) {
		this.stNum = stNum;
	}

	@Override
	public void print() {
		super.print();
		System.out.print("학번 : " + stNum+"  ");
	}
}
