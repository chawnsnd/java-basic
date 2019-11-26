package test;

public class Dog implements Animal{

	@Override
	public void move() {
		System.out.println("왕왕 이동");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("왕왕 먹기");
		
	}
	
	public void bark() {
		System.out.println("왈왈 ");
	}

}
