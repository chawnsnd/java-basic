package test;

public class Ex_stringbuffer2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		System.out.println(sb);
		System.out.println(sb.toString());
		sb.append("def");
		System.out.println(sb.toString());
		sb.insert(3, 123);
		System.out.println(sb.toString());
		sb.delete(3, 6);
		System.out.println(sb.toString());
		sb.replace(0, 3, "ABC");
		System.out.println(sb.toString());
	}
}
