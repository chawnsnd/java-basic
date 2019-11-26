package assignment.assignment191105;

public class Q01 {
	public static void main(String[] args) {
		String[] arr = {"<홍길동>이다", 
				"나는 <임꺽정>이다", 
				"난 <죠커>", 
				"너도<배트맨>?", 
				"네가 <사라 코너>",
				"님이 <존 코너>임?", 
				"내가 바로 <원더우먼>일세"};
		
		for(int i=0; i<arr.length; i++) {
			StringBuilder sb = new StringBuilder(arr[i]);
			sb.delete(0, sb.indexOf("<")+1).delete(sb.indexOf(">"), sb.length());
			System.out.println(sb.toString());
		}

	}
}
