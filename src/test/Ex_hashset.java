package test;
import java.util.ArrayList;
import java.util.HashSet;

public class Ex_hashset {
	
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("A");
		
		for (String s : set) System.out.println(s);
		
		// HashSet -> ArrayList
		ArrayList<String> list = new ArrayList<>(set);
		
	}
}
