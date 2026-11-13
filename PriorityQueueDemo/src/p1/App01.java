package p1;

import java.util.LinkedList;
import java.util.Queue;

public class App01 {
	
	public static void useQueue(Queue<Integer>Q) {
		
		while(!Q.isEmpty()) {
			System.out.println("peek  "+Q.peek());
			Q.poll();  
		}
		
		
	}

	public static void main(String[] args) {
		
		Queue<Integer>q1=new LinkedList<Integer>();
		q1.add(11);
		q1.add(22);
		q1.add(33);
		q1.add(44);
		q1.add(55);
		q1.add(66);
		
		System.out.println(q1);
		
		useQueue(q1);
		
		System.out.println("Queue "+q1);
	}
}
