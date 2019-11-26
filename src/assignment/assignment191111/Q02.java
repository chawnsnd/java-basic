package assignment.assignment191111;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q02 {
	
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		while(true) {
			System.out.print("1~10 사이의 숫자를 입력 :　");
			int num = scanner.nextInt();
			if(num == 0) break;
			if(list.contains(num)) continue;
			list.add(num);
		}
		Collections.shuffle(list);
		for (int i : list) System.out.println(i);
	}

}
