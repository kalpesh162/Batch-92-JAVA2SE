package p1;

import java.util.HashSet;

public class Example02 {
	
	public static void main(String[] args) {
		
		
		HashSet<Integer>hs=new HashSet<Integer>();
		//HashSet<Integer>hs=new HashSet<Integer>(100);
		hs.add(1);
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.add(5);
		
		
		System.out.println(hs);
		
		
	}

}
