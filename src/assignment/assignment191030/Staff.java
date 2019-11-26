package assignment.assignment191030;

public class Staff extends Human{

	private String field;

	public Staff(String name, int age, String field) {
		super(name, age);
		this.field = field;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
	
	@Override
	public void showInfo() {
		System.out.println("Staff [name=" + this.getName() + ", age=" + this.getAge() + ", field="+field+"]");
	}
}
