package assignment.assignment191108;

public class Human {

	private String sn;
	private String name;
	private int age;
		
	public Human(String sn, String name, int age) {
		super();
		this.sn = sn;
		this.name = name;
		this.age = age;
	}
	
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
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
		System.out.print("이름 : " + name+"  ");
		System.out.print("나이 : " + age+"  ");
		System.out.print("주민번호 : " + sn+"  ");
	}
}
