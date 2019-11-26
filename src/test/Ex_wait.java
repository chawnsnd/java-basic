package test;

public class Ex_wait extends Thread {

	private Share share;

	public Ex_wait(Share share) {
		super();
		this.share = share;
	}

	@Override
	public void run() {
		synchronized (share) {
			try {
				share.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < 30; i++) {
			System.out.println("wait : " + share.getNum());
			share.setNum(share.getNum() + 1);
		}
	}
}
