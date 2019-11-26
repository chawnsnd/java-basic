package test;

public class Test {
	public static void main(String[] args) {
	Animal a1 = new Dog();
		
		System.out.println(a1 instanceof Dog);
		System.out.println();
		if(a1 instanceof Dog) {
			Dog dog = (Dog)a1;
			dog.bark();
			System.out.println("아직");
		}
		
		HumanBuilder humanBuilder = new HumanBuilder();
		Human human = humanBuilder.name("차준웅")
				.age(27)
				.gender("남성")
				.build();
		
		System.out.println(human);
		
	}
}

