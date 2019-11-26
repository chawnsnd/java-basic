package workbook02.q04;

public class Account {

	String name;
	String num;
	int balance;
	
	public Account(String name, String num, int balance) {
		this.name = name;
		this.num = num;
		this.balance = balance;
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

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "¼º¸í : " + name + ", °èÁÂ¹øÈ£ : " + num + ", ÀÜ°í : " + balance;
	}
	
	
}
