package p3;

import java.util.LinkedList;

public class App03 {

	public static boolean isPalindrome(LinkedList<Character> list) {

		while (list.size() > 0) {
			if (list.getFirst().equals(list.getLast())) {
				if (list.size() > 1) {
					list.removeFirst();
					list.removeLast();
				} else
					list.remove();
			} else {
				return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {

		LinkedList<Character> list = new LinkedList<Character>();
		list.add('m');
		list.add('a');
		list.add('d');
		list.add('a');
		list.add('m');

		System.out.println(isPalindrome(list));
	}

}
