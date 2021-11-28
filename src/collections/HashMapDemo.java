package collections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1,  "Ahmed");
		map.put(2,  "Ussas");
		map.put(3,  "Anu");
		map.put(4,  "Ahmed");
		
		System.out.println(map.get(4));

	}

}
