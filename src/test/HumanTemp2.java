package test;
public class HumanTemp2 {

	String name;
	String gender;
	int age;
	
	public HumanTemp2() {};
	
	public HumanTemp2(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public HumanTemp2(String name, String gender, int age) {
		this(name, gender);
//		this.name = name;
//		this.gender = gender;
		this.age = age;
	}
	
	public void speak() {
		System.out.println(name+"(��)�� ���Ѵ�.");
		System.out.println(age+"�� �Դϴ�.");
	}
	
	public void move() {
		System.out.println(name+"(��)�� �����δ�.");
	}
	
	public void intro() {
		System.out.println(name);
		System.out.println(age);
	}
}
