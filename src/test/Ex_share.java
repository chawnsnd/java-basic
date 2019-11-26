package test;

public class Ex_share extends Thread {

	private Share share;
	private String name;

	public Ex_share(Share share, String name) {
		super();
		this.share = share;
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			synchronized (share) {				
				System.out.printf("%s : %d\n", name, share.getNum());
				
				share.setNum(share.getNum() + 1);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
	
}
