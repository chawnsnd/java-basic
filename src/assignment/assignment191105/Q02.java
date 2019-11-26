package assignment.assignment191105;

import java.util.Scanner;

public class Q02 {
	private static Scanner scanner;

	public static void main(String[] args) {
		
		//(1) 비어있는 문자열 변수를 준비 
		//(2) 가가가bbb가bcc#에서 한 글자씩 봅아온다 
		//(3) (2)에서 뽑아온 글자가 (1)에 존재하지 않을 경우 
		//    (1)의 문자열에 뽑아온 글자를 추가함 
		//(4) (1)의 문자열에 존재하는 글자와 동일한
		//    글자를 (2)에서 검색하여 카운팅
		//(5) (4)에서 카운팅한 결과를 1의 문자열에 추가
		
		String str = "가가가bbb가bcc#";
		String[] arr = str.split("");
//		StringBuffer sb = new StringBuffer();
		
//		for (int i = 0; i < arr.length; i++) {
//			int count = 0;
//			if(sb.indexOf(arr[i]) == -1) {
//				sb.append(arr[i]);
//				for(int j=i; j<arr.length; j++) {
//					if(arr[i].equals(arr[j])) count++;
//				}
//				sb.append(count);
//			}
//		}
//		
//		System.out.println(sb.toString());
		
		
//		scanner = new Scanner(System.in);
//		System.out.print("입력 : ");
//		String str = scanner.nextLine();
		StringBuffer sb = new StringBuffer();
		
		while(true) {
			if(str.equals("")) break;
			sb.append(str.charAt(0));
			int count=0;
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(0)==str.charAt(i)) count++;
			}
			sb.append(count);
			str = str.replace(String.valueOf(str.charAt(0)), "");
		}
		System.out.println(sb.toString());
	}
}









//		for(int i=0; i<strArr.length; i++) {
//			if(strArr[i].equals("")) continue;
//			String keyword = strArr[i];
//			sb.append(keyword);
//			int count = 0;
//			for(int j=0; j<strArr.length; j++) {
//				if(strArr[j].equals(keyword)) {
//					count++;
//					strArr[j]="";
//				}
//			}
//			sb.append(count);
//		}
//		
//		System.out.println(sb.toString());

//		Map<String, Integer> strMap = new HashMap<String, Integer>();
//		for(int i=0; i<str.length(); i++) {
//			if(strMap.containsKey(String.valueOf(str.charAt(i)))) continue;
//			int count = 0;
//			for(int j=0; j<str.length(); j++) {
//				if(str.charAt(i)==str.charAt(j)) {
//					count++;
//				}
//			}
//			strMap.put(String.valueOf(str.charAt(i)), count);
//			strMap.
//		}
//		System.out.println(strMap.toString());




//		for(int i=0; i<str.length(); i++) {
//			int count = 0;
//			sb.append(str.charAt(i));
//			for(int j=i; j<str.length(); j++) {
//				if(str.charAt(i)==str.charAt(j)) {
//					count++;
//				}else {
//					i = j-1;
//					break;
//				}
//			}
//			sb.append(count);
//		}