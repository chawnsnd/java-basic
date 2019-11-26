package test.com.sesoc;

public class Human {

	public String name;
	public int age;
	
	public Human() { }
	
	public Human(String name, int age) {
		super(); // �θ�Ŭ������ �⺻�����ڸ� ȣ�� // ���� ���� �ʾƵ� �����Ϸ��� �˾Ƽ� ȣ��
		this.name = name;
		this.age = age;
	}
	
	public void speak() {
		System.out.println("���� "+name);
	}
}
