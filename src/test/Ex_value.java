package test;

public class Ex_value {
	public static void main(String[] args) {
		
		int a = 1;
		int b = a;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		// �⺻ �ڷ����� �� ��ü�� �����
		a = 2;
		System.out.println("b : " + b);
		System.out.println("==========================");
		
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = arr1;
		
		// for-each
		for (int i : arr1) System.out.print(i);
		System.out.println();
		for (int i : arr2) System.out.print(i);
		System.out.println();
		
		// ���� �ڷ����� �ּҰ��� �����
		arr1[2] = 333;
		for (int i : arr2) System.out.print(i);
		System.out.println();
	}
}
