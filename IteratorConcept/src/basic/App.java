package basic;

import java.util.ArrayList;
import java.util.Iterator;

public class App {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(11);
		numbers.add(22);
		numbers.add(33);
		numbers.add(44);
		numbers.add(55);

		// numbers.remove(33) index
		// numbers.remove(new Integer(33)); // object
		// fail fast iterator
		Iterator<Integer> itr = numbers.iterator();

		while (itr.hasNext()) {
			Integer val = itr.next();
			if (val == 33)
				numbers.remove(val); // java.util.ConcurrentModificationException
		}

		Iterator<Integer> itr1 = numbers.iterator();

		while (itr1.hasNext()) {
			Integer val = itr.next();
			if (val == 33)
				itr1.remove();
		}

	}

}
