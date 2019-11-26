package workbook02.q06;

public class Member {

	private String name;
	private String num;
	private double height;
	private double weight;
	
	public Member(String name, String num, double height, double weight) {
		this.name = name;
		this.num = num;
		this.height = height;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + ", 회원번호 : " + num + ", 키 : " + height + ", 몸무게 : " + weight;
	}
	
}
