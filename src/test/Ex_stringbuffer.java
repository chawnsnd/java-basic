package test;

public class Ex_stringbuffer {
	public static void main(String[] args) {
		String temp = "a";
		
		// 1970년 1월 1일부터 현재 시간까지를 1/1000초로 표현 
		Long start= System.currentTimeMillis();
		for(int i=0; i<60000; i++) {
			temp += "a";
		}
		Long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		Long start2 = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("a");
		for(int i=0; i<60000; i++) {
			sb.append("a");
		}
		sb.toString();
		Long end2 = System.currentTimeMillis();
		System.out.println(end2-start2);
	}	
}
