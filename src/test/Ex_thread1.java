package test;

public class Ex_thread1 extends Thread {

	String name;
	String age;
	String genger;
	
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println("O");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
