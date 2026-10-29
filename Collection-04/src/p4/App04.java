package p4;

import java.util.LinkedList;

public class App04 {

	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(1);
		l1.add(5);
		l1.add(10);

		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l2.add(2);
		l2.add(3);
		l2.add(11);

		LinkedList<Integer> l3 = merge(l1, l2);
		System.out.println(l3);
	}

	private static LinkedList<Integer> merge(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		LinkedList<Integer> l3 = new LinkedList<Integer>();
		while (l1.size() > 0 && l2.size() > 0) {
			Integer i1 = l1.peek();
			Integer i2 = l2.peek();
			if (i1 > i2) {
				l3.add(i2);
				l2.poll();
			} else {
				l3.add(i1);
				l1.poll();
			}

		}

		if (l1.size() > 0) {
			while (l1.size() > 0) {
				l3.add(l1.poll());
			}
		}

		if (l2.size() > 0) {
			while (l2.size() > 0) {
				l3.add(l2.poll());
			}
		}

		return l3;
	}

}
