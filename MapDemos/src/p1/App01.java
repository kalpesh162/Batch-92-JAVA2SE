package p1;

import java.util.HashMap;
import java.util.Map;

public class App01 {
	
	public static void main(String[] args) {
		// Key Uniquness  
		Map map=new HashMap();
		System.out.println(map.put(1, "Kareena"));
		System.out.println(map.put(1, "Katrina"));
		map.put(11.11, 'A');
		map.put('A', 65);
		map.put(null, "AA");
		map.put(true, null);
		map.put('B', 65);
		
		System.out.println(map);
		
	}

}
