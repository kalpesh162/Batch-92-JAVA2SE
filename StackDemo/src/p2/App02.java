package p2;

import java.util.Stack;

/*
 *  Reverse a String    Given a string, reverse it using Stack. Example: JAVA -> AVAJ.
 *  @author : Kalpesh
 */
public class App02 {

	public static void main(String[] args) {

		String input = "Java";

		reverse(input);

	}

	private static void reverse(String input) {
		Stack<Character> st = new Stack<Character>();
		for (char ch : input.toCharArray())
			st.push(ch);

		while (!st.empty()) {
			System.out.println(st.pop());
		}
	}

}
