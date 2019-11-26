package assignment.hospital.sol.vo;

public class Data {

	private int id;
	private String code;
	private int stay;
	private int age;
	
	public Data(int id, String code, int stay, int age) {
		super();
		this.id = id;
		this.code = code;
		this.stay = stay;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getStay() {
		return stay;
	}

	public void setStay(int stay) {
		this.stay = stay;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
