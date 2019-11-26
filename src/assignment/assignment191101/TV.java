package assignment.assignment191101;

public abstract class TV extends HomeApp{
	
	private int channel;

	public TV() {
	}

	public TV(String modeNumber, String productNum, int channel) {
		super(modeNumber, productNum);
		this.channel = channel;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	@Override
	public void powerOn() {
		System.out.println("ȭ���� �Ҵ�");
	}
	
	@Override
	public void powerOff() {
		System.out.println("ȭ���� ����");
	}

}
