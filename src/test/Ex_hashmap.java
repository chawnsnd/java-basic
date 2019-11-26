package test;
import java.util.HashMap;
import java.util.Set;

public class Ex_hashmap {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("나이", 22);
		map.put("생년월일", 19980101);
		
		System.out.println(map.get("나이"));
		System.out.println(map.get("생년월일"));

		map.put("생년월일", 19981231);
		System.out.println(map.get("생년월일"));
		
		map.remove("생년월일");
		System.out.println(map.get("생년월일"));
		
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		
		Set<String> set = map.keySet();
		for (String s : set) System.out.println(s);
	}
}
