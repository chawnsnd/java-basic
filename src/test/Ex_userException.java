package test;

public class Ex_userException {

	public void calcSum(int num) throws NegativeException{
		if(num < 0) {
			throw new NegativeException();
		}
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
