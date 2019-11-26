package test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Test191111 {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();

		list1.add(111);
		list1.add(112);
		list1.add(113);

//		for (int i = 0; i < list1.size(); i++) {
//			System.out.println(list1.get(i));
//		}		
		for (int i : list1) System.out.println(i);
		System.out.println();
		
		list1.add(1, 222);
		for (int i : list1) System.out.println(i);
		System.out.println();
		
//		list1.remove(1);
		
//		IndexOutOfBoundsException
//		list1.add(9,999);
//		for (int i : list1) System.out.println(i);
//		System.out.println();

		list1.set(2, 333);
		for (int i : list1) System.out.println(i);
		System.out.println();
		
		Collections.sort(list1);;
		for (int i : list1) System.out.println(i);
		System.out.println();
		
		Collections.reverse(list1);
		for (int i : list1) System.out.println(i);
		System.out.println();

		Collections.shuffle(list1);
		for (int i : list1) System.out.println(i);
		System.out.println();
		
		
		// List -> HashSet -> 기존에 있던 중복값은 사라짐
		HashSet<Integer> set = new HashSet<Integer>(list1);
	}
}
