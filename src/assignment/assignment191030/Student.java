package assignment.assignment191030;

public class Student extends Human{

	private int stNum;

	public Student(String name, int age, int stNum) {
		super(name, age);
		this.stNum = stNum;
	}

	public int getStNum() {
		return stNum;
	}

	public void setStNum(int stNum) {
		this.stNum = stNum;
	}
	
	@Override
	public void showInfo() {
		System.out.println("Student [name=" + this.getName() + ", age=" + this.getAge() + ", stNum="+stNum+"]");
	}
	
}
