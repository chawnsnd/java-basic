package test.kr.co.scm.util;

public class Ex_private {

	private int num;
	private int hour;
	
	public void test() {
		int i =0;
		for(; i<=10; i++) {
			System.out.println("dd");
		}
		System.out.println(i);
		System.out.println("test");
	}

	// setter
	public void setNum(int num) {
		this.num = num;
	}
	
	// getter
	public int getNum() {
		return this.num;
	}
	
	public void setHour(int hour) {
		if(hour > 12 || hour < 1) System.out.println("�ð��� 1~12������ �����մϴ�.");
		else this.hour = hour;
	}
	
	public int getHour() {
		return this.hour;
	}
}
