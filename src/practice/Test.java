package practice;

public class Test {
	public static void main(String[] args) {
		AnimalUse animalUse = new AnimalUse();
		animalUse.howToEat(() -> {
			System.out.println("�˾Ƽ� �Դ´�.");
		});
	}
}
