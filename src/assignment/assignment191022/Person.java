package assignment.assignment191022;

public class Person {
	String name;
	String gender;
	int age;
	
	public Person(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public void speak() {
		System.out.println(name+"(��)�� ���Ѵ�.");
	}
	
	public void move() {
		System.out.println(name+"(��)�� �����δ�.");
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
}
