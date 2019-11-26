package assignment.assignment191106;

public class Human {

	private String num;
	private String name;
	private int age;
		
	public Human(String num, String name, int age) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
	}
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void print() {
		System.out.print("주민번호 : " + num+"  ");
		System.out.print("이름 : " + name+"  ");
		System.out.print("나이 : " + age+"  ");
	}
}
