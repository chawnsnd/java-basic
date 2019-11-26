package test;
import java.io.Serializable;

public class Child extends Parent implements Serializable {

	private int age;

	public Child(String name, int age) {
		super(name);
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		
		return super.toString() + "Child [age=" + age + "]";
	}

	
}
