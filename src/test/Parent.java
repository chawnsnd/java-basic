package test;
import java.io.Serializable;

public class Parent implements Serializable {

	private String name;

	public Parent(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Parent [name=" + name + "]";
	}

}
