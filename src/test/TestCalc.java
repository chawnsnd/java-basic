package test;
public class TestCalc {
	public static void main(String[] args) {
		
		Calc c = new Calc();
		c.printSum(1, 2);
		c.printSum(3, 4);

		int sum = c.sum(5, 6);
		System.out.println(sum);
	}
}
