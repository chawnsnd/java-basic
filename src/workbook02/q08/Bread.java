package workbook02.q08;

public class Bread {

	private String name;
	private String num;
	private String producer;
	private int price;

	public Bread(String name, String num, String producer, int price) {
		this.name = name;
		this.num = num;
		this.producer = producer;
		this.price = price;
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

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void print() {
		System.out.println(
				"상품이름=" + name + ", 제품번호=" + num + ", 제작자=" + producer + ", 가격=" + price
				);
	}
	
	
}
