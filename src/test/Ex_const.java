package test;

public class Ex_const {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "user";
		p1.gender = "male";
		p1.age = 25;

		Person p2 = new Person("user2", "female", 23);
		System.out.println(p2.name);
		System.out.println(p2.gender);
		System.out.println(p2.age);
	}
}
