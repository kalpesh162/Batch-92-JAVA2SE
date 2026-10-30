package p1;

import java.util.Enumeration;
import java.util.Vector;

public class App01 {
	
	public static void main(String[] args) {
		
		// 
		//Collections.synchronizedList(list);
		
		Vector<Integer> numbers=new Vector<Integer>();
		
		for(int i=1;i<=10;i++)
			numbers.add(i*10);
		
		System.out.println(numbers);
		
		
		System.out.println(numbers.elementAt(0));
		
		System.out.println(numbers.firstElement());
		
		System.out.println(numbers.lastElement());
		
		//insertElementAt(E obj, int index) 
		numbers.insertElementAt(150, 4);
		
		System.out.println(numbers);
		
		Object arr[]=new Object[numbers.size()];
		
		numbers.copyInto(arr);
		System.out.println("------------------------");
		for(Object ob:arr)
			System.out.println(ob);
		
		
		System.out.println("---->   "+numbers.capacity());
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		
		
		Enumeration<Integer> itr=numbers.elements();
		
		while(itr.hasMoreElements()) {
			System.out.println(itr.nextElement());
		}
		
			
		
	}

}
