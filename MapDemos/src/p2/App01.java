package p2;

import java.util.HashMap;

public class App01 {

	public static void main(String[] args) {

		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		hs.put(31, "Janhvi");
		hs.put(23, "Akanksha");
		hs.put(34, "Gaurii");
		hs.put(45, "Pratiksha");

		System.out.println(hs);

		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		System.out.println(hs.containsKey(3));
		System.out.println(hs.containsValue("Gaurii"));
		System.out.println(hs.remove(4));    // V remove()

		System.out.println(hs);

	}

}
