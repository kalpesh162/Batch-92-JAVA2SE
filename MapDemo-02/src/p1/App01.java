package p1;

import java.util.HashMap;

public class App01 {
	
	public static void main(String[] args) {
		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		hs.put(31, "Janhvi");
		hs.put(23, "Akanksha");
		hs.put(34, "Gaurii");
		hs.put(45, "Pratiksha");
		
		System.out.println(hs.get(23));
		System.out.println(hs.getOrDefault(2, "AAA"));
		System.out.println(hs.get(2));
		
		//default V	putIfAbsent(K key, V value)
		//hs.put(45, "Madhuri");
		hs.putIfAbsent(11, "Madhuri");
		System.out.println(hs);
		
		hs.putIfAbsent(34, "Raksha");
		
		System.out.println(hs);
		
		//V	remove(Object key) 
		//default boolean	remove(Object key, Object value)
		
		//default V	replace(K key, V value)
		System.out.println("replace   "+hs.replace(31, "Jagruti"));
		
		//default boolean	replace(K key, V oldValue, V newValue)
		hs.replace(23, "Akanksha", "Aarti");
		System.out.println(hs);
	}

}
