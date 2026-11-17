package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App01 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		
		List<Integer> data =Collections.unmodifiableList(list);
		
		//data.add(44);		
		
		System.out.println(data);

	}

}
