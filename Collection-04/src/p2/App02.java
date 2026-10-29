package p2;

import java.util.LinkedList;

public class App02 {

	public static void reverse(LinkedList<Integer> list) {
		int i = 0;
		int j = list.size() - 1;
		while (i < j) {
			list.set(i, list.get(i) + list.get(j));
			list.set(j, list.get(i) - list.get(j));
			list.set(i, list.get(i) - list.get(j));
			i++;
			j--;
		}
	}

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(11);
		list.add(22);
		list.add(33);
		System.out.println(list);

		reverse(list);
		System.out.println(list);

	}

}
