package test;
import test.com.sesoc.Human;

public class Colleger extends Human{

	int stNum;

	public Colleger() { }
	
	public Colleger(String name, int age, int stNum) {
//		this.name = name; // �̷���
//		this.age = age;   // ��������
		// �������� ù�κ��� �θ������ ȣ���� ������
		super(name, age); // �θ��� �ʵ�� �θ��ʿ��� �ʱ�ȭ�� ��������!
		this.stNum = stNum;
	}

	public void stuSpeak() {
		System.out.println("�й��� "+stNum);
	}
}
