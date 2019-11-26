package workbook02.q05;

public class People {
	
	private String name;
	private int num;
	
	public People(String name, int num) {
		this.name = name;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "이름 : " + name + ", 주민번호 : " + num + "]";
	}
}
