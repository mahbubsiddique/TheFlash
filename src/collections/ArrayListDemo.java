package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<>();

		myList.add(100);
		myList.add(200);
		myList.add(300);
		myList.add(400);
		myList.add(900);
		myList.add(200);
		myList.add(500);
		myList.add(400);

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < myList.size(); i++) {
			if (max < myList.get(i))
				max = myList.get(i);
		}

		System.out.println(max);

		// int
		// char

		LinkedList<Integer> myLink = new LinkedList<>();
		
		myLink.add(800);
		myLink.add(900);
		myLink.add(1000);
		myLink.add(2000);
		myLink.add(3000);
		
		System.out.println(myLink.get(4));

	}

}
