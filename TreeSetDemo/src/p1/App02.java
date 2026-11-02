package p1;

import java.util.TreeSet;

public class App02 {
	
	public static void main(String[] args) {
		
		TreeSet<Integer>ts=new TreeSet<Integer>();
		ts.add(11);
		ts.add(211);
		ts.add(1);
		ts.add(21);
		ts.add(115);
		ts.add(11);
		ts.add(211);
		ts.add(1);
		ts.add(21);
		ts.add(115);
		ts.add(null);  //java.lang.NullPointerException
		//not able to add null value in TreeSet
		
		System.out.println(ts);
		
	}

}
