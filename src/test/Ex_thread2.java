package test;

public class Ex_thread2 implements Runnable{

	@Override
	public void run() {
		for(int i =0; i<30; i++) {
			System.out.println("+");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
