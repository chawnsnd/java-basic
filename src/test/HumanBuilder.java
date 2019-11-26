package test;

public class HumanBuilder{
	private Human human;

	public HumanBuilder() {
		this.human = new Human();
	}
	
	public HumanBuilder name(String name) {
		human.setName(name);
		return this;
	}

	public HumanBuilder age(int age) {
		human.setAge(age);
		return this;
	}
	
	public HumanBuilder gender(String gender) {
		human.setGender(gender);
		return this;
	}
	
	public Human build() {
		return this.human;
	}
	
}
