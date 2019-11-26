package test;
public class Ex_String {
	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = str1;
		System.out.println(str1 == str2);
		System.out.println("=======================");

		str2 = "bcd"; // �� ������ �޸𸮿� ���Ӱ� �Ҵ�
		System.out.println(str1);
		System.out.println(str1==str2);
		System.out.println("=======================");
		
		str2 = "abc"; // ��Ȱ���� �� �ִ� ��� �ּҸ� ��Ȱ��
		System.out.println(str1==str2);
		System.out.println("=======================");

		str2 = new String("abc"); // ���� ���� �����ϰ� ���� ���
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2)); //equals() : �� ��ü�� ���ϰ� ���� ��
		
		// ���� �޸𸮿� �ִ� ���ڿ��� �����ϰ� ���� ����
		// StringBuffer ����ϱ�
		
	}
}
