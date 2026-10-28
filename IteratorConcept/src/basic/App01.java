package basic;

import java.util.ArrayList;
import java.util.List;

public class App01 {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(11);
		l1.add(22);
		l1.add(33);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(44);
		l2.add(55);
		l2.add(66);
		List<Integer> l3 = new ArrayList<Integer>();
		l3.add(77);
		l3.add(88);
		l3.add(99);

		// List inside List

		List<List<Integer>> numbers = new ArrayList<List<Integer>>();

		numbers.add(l1);
		numbers.add(l2);
		numbers.add(l3);

		for (List<Integer> list : numbers) {
			for (Integer val : list)
				System.out.print(val+"  ");
			System.out.println();
		}

	}

}
