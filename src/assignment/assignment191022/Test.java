package assignment.assignment191022;

public class Test {
	public static void main(String[] args) {
		CalcTest ct = new CalcTest();
		int[] temp = {1, 2, 3, 4, 5};
		ct.printLoopSum(temp);
		
		PersonFactory personFactory = new PersonFactory();
		Person p1 = personFactory.createPerson("���ؿ�", "��", 27);
//		System.out.println("�̸� : "+p1.name+", ���� : "+p1.gender+", ���� : "+p1.age);
		System.out.println(p1.toString());
	}
}
