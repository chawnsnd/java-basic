package assignment.assignment191101;

public abstract class Radio extends HomeApp{
	
	private String changeFreq;

	public Radio() {
	}

	public Radio(String modeNumber, String productNum, String changeFreq) {
		super(modeNumber, productNum);
		this.changeFreq = changeFreq;
	}

	public String getChangeFreq() {
		return changeFreq;
	}

	public void setChangeFreq(String changeFreq) {
		this.changeFreq = changeFreq;
	}

	@Override
	public void powerOn() {
		System.out.println("�Ҹ��� �Ҵ�");
	}
	
	@Override
	public void powerOff() {
		System.out.println("�Ҹ��� ����");
	}

}
