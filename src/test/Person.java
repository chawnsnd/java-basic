package test;
public class Person {

	String name;
	String gender;
	int age;
	
	public Person() {};
	
	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public Person(String name, String gender, int age) {
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
}
