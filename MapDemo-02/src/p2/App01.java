package p2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class App01 {

	public static void main(String[] args) {

		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		hs.put(31, "Janhvi");
		hs.put(23, "Akanksha");
		hs.put(34, "Gaurii");
		hs.put(45, "Pratiksha");

		// print etries == K V

		Set entries = hs.entrySet();

		System.out.println("------------------------");
		Iterator itr = entries.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next()); // itr.next == Entry Object [11=Kalpesh]
		}
		System.out.println("------------------------");

		Set<Map.Entry<Integer, String>> entries1 = hs.entrySet();
		Iterator<Map.Entry<Integer, String>> entry = entries1.iterator();

		while (entry.hasNext()) {
			// System.out.println(entry.next());entry.next() 11=Kalpesh
			Map.Entry<Integer, String> entryObj = entry.next();
			System.out.println(entryObj.getKey() + "  " + entryObj.getValue());
		}

		System.out.println("==========ONLY KEYS===========");

		Set<Integer> keys = hs.keySet();
		for (Integer ele : keys)
			System.out.println(ele);

		System.out.println("==========ONLY Values===========");

		Collection<String> names = hs.values();
		for (String n : names)
			System.out.println(n);

	}

}
