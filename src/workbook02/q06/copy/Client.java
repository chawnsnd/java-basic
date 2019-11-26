package workbook02.q06.copy;

public class Client{
	private String name;
	private String csn;
	private double weight;
	private double height;
	
	public Client(String name, String csn, double weight, double height) {
		this.name = name;
		this.csn = csn;
		this.weight = weight;
		this.height = height;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCsn() {
		return csn;
	}
	public void setCsn(String csn) {
		this.csn = csn;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight; 
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void print() {
		System.out.println("name : "+name+", csn : "+csn+", weight : "+weight+", height : "+height);
	}
}
