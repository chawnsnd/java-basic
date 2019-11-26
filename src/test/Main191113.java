package test;

public class Main191113 {

	public static void main(String[] args) {
		Ex_userException ex = new Ex_userException();

		try {
			ex.calcSum(-5);
		} catch (NegativeException e) {
			e.printStackTrace();
		}
	}
}
