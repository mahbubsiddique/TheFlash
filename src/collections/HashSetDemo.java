package collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		String [] names = {"Mahbub", "Ehsan","Bornona", "Rashed", "Mahbub", "Ehsan" };
		
		HashSet<String> mySet = new HashSet<>();
		
		for(int i=0; i<names.length; i++) {
			
			mySet.add(names[i]);
		}
		
		System.out.println(mySet);

	}

}
