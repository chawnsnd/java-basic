package test;
import java.util.Random;

public class Ex_math {
	public static void main(String[] args) {
//		System.out.println(Math.abs(-12.5));
//		System.out.println(Math.min(12.3, 24.2));
//		System.out.println(Math.max(12.3, 24.2));
//		System.out.println(Math.pow(12.3, 24.2));
//		System.out.println((int)(Math.random()*10)+1);
//		
//		Random random  = new Random(System.currentTimeMillis());
//		int num = random.nextInt(45)+1;
//		System.out.println(num);
		
		Random random = new Random(11);
		for(int i=0; i<5; i++) {
			System.out.print(random.nextInt(20)+" ");
		}
	}
}
