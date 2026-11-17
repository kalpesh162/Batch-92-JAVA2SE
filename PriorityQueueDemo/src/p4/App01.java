package p4;

import java.util.PriorityQueue;

// Find Kth Largest Element By PQ

public class App01 {
	
	public static void main(String[] args) {
		
		int arr[]={10,50,30,20,40};  // 10 20 30 40 50
		int k=2;
		PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
		
		for(int num:arr) {
			pq.add(num);  // 10  50  30  --> 10 30 50  -->  30 50
			// 20  30  50   --> 30  50
			// 30  40  50  --> 30   -- [40  50]
			
			if(pq.size()>k) {
				pq.poll();   // 10  20  30 
			}
			
		}
		
		System.out.println(pq);  // 40 50
		System.out.println(pq.peek());
		
		
	}

}
