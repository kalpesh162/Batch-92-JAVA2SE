package p3;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class App01 {
	
	public static void treatPatientByDoc(Queue<Patient> q) {
		    
		while(!q.isEmpty()) {
			 System.out.println(q.poll()+"  Done ...");
		}
		
	}
	

	public static void main(String[] args) {

		Patient p1 = new Patient("Rahul", 1);
		Patient p2 = new Patient("Priya", 3);
		Patient p3 = new Patient("Amit", 2);
		Patient p4 = new Patient("Sneha", 5);
		Patient p5 = new Patient("Rohan", 4);
		Queue<Patient> q1 = new PriorityQueue<>();
		q1.add(p1);
		q1.add(p2);
		q1.add(p3);
		q1.add(p4);
		q1.add(p5);
		
		treatPatientByDoc(q1);

	}

}
