package test;

public class Ex_notify extends Thread {

	private Share share;

	public Ex_notify(Share share) {
		super();
		this.share = share;
	}

	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println("notify : " + share.getNum());
			share.setNum(share.getNum() + 1);
		}
		synchronized (share) {
			share.notify();
		}
	}
}
