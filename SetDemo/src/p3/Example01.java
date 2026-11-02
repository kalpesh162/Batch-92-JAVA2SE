package p3;

import java.util.Iterator;
import java.util.TreeSet;

public class Example01 {

	public static void main(String[] args) {

		TreeSet<Integer> numbers = new TreeSet<Integer>();

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
