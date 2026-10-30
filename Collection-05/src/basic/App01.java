package basic;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App01 {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);

		System.out.println(list);

		list.addFirst(99);
		System.out.println(list);
		list.addLast(100);
		System.out.println(list);

		list.add(2, 55);
		System.out.println(list);

		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + "  ");
		System.out.println();
		System.out.println("--------------------");

		for (Object i : list)
			System.out.print(i + "  ");
		
		System.out.println();
		System.out.println("--------------------");
		
		System.out.println();
		Iterator<Object> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "  ");

		}

	}

}
