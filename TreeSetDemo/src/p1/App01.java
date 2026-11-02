package p1;

import java.util.TreeSet;

// TreeSet
// 1 : Unique 
// 2  : natural Order

public class App01 {
	
	public static void main(String[] args) {
			TreeSet ts=new TreeSet();
			//java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.Double
			ts.add(11);
			ts.add(11.11);
			ts.add("11");
			ts.add('1');
			ts.add(true);
			ts.add(null);
			
			System.out.println(ts);
			
	}

}
