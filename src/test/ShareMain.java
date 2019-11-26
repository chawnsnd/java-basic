package test;

public class ShareMain {

	public static void main(String[] args) {
		Share share = new Share();
//		
//		Ex_share ex1 = new Ex_share(share, "ex1");
//		Ex_share ex2 = new Ex_share(share, "ex2");
//		
//		ex1.start();
//		ex2.start();
		
		Ex_wait wait = new Ex_wait(share);
		Ex_notify notify = new Ex_notify(share);
		
		wait.start();
		notify.start();
		
	}
}