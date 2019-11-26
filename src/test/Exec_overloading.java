package test;

public class Exec_overloading {
	public static void main(String[] args) {
		Ex_overloading ex = new Ex_overloading();
		ex.calcSum(1,2,2,3,4,5,6,7,8,9);
		int[] temp = {3,4,5,6};
		ex.calcSum(temp);	
	}
}
