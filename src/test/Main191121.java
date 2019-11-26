package test;

public class Main191121 {

	public static void main(String[] args) {
		Ex_thread1 ex = new Ex_thread1();
		ex.start();
		
		Ex_thread2 ex2 = new Ex_thread2();
		Thread thread = new Thread(ex2);
		thread.start();

		for (int i = 0; i < 30; i++) {
			System.out.println("X");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
