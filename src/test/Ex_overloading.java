package test;

public class Ex_overloading {
	public int calcSum(int a, int b) {
		return a + b;
	}

	public double calcSum(double a, double b) {
		return a + b;
	}

	public void calcSum(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	public void calcSum(int... arr) {
		int sum = 0;
		for(int i : arr) sum += i;
		System.out.println(sum);
	}
}
