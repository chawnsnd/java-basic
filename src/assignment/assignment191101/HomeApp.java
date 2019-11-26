package assignment.assignment191101;

public abstract class HomeApp {

	private String modeNumber;
	private String productNum;
	
	public HomeApp() {
	}

	public HomeApp(String modeNumber, String productNum) {
		this.modeNumber = modeNumber;
		this.productNum = productNum;
	}

	public String getModeNumber() {
		return modeNumber;
	}

	public void setModeNumber(String modeNumber) {
		this.modeNumber = modeNumber;
	}

	public String getProductNum() {
		return productNum;
	}

	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}
	
	public abstract void powerOn();
	
	public abstract void powerOff();
}
