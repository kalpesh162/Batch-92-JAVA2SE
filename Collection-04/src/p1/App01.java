package p1;

import java.util.Iterator;
import java.util.LinkedList;

public class App01 {

	public static void main(String[] args) {

		LinkedList<String> movies = new LinkedList<String>();
		movies.add("Sholey");
		movies.offer("Ghatak");
		movies.push("Dhurandar"); // void push(E e) // addFirst add(0, E e)

		// addFirst offerFirst add(0,E) push(E e)

		System.out.println(movies);

		// LinkedList
		movies.addFirst("Bahubali");
		movies.addLast("Krish");

		// Queue
		movies.offerFirst("Ramayan");
		movies.offerLast("KGF");

		// STACK
		movies.push("Paradize");

		System.out.println(movies);

		System.out.println("--------------------------");
		movies.removeFirst();
		movies.removeLast();

		movies.pollFirst();
		movies.pollLast();
		System.out.println(movies);
		movies.pop();  // removeFirst()
        System.out.println("--------------------------");
		System.out.println(movies);
		
		System.out.println(movies.getFirst());
		System.out.println(movies.get(0));
		System.out.println(movies.element());
		
		
		System.out.println(movies.peekFirst());
		System.out.println(movies.peek());
		System.out.println("-------------------------------");
		//Iterator<E>	descendingIterator()
		Iterator<String>itr=movies.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("-------------------------------");
		
		
		

	}

}
