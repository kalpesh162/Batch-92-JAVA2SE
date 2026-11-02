package p1;

import java.util.HashSet;
import java.util.Iterator;

public class Example01 {

	public static void main(String[] args) {

		HashSet<Integer> numbers = new HashSet<Integer>(); // 16 Capcity

		numbers.add(11);
		numbers.add(11);
		numbers.add(11);
		numbers.add(11);
		numbers.add(11);

		System.out.println(numbers);
		numbers.add(21);
		numbers.add(22);
		numbers.add(222);
		numbers.add(12);
		numbers.add(51);
		numbers.add(77);

		System.out.println(numbers);

		// for each
		for (Integer i1 : numbers)
			System.out.println(i1);

		System.out.println("------------------------");

		Iterator<Integer> itr = numbers.iterator();

		while (itr.hasNext())
			System.out.println(itr.next());

		System.out.println("-----------------------------");

	}

}
