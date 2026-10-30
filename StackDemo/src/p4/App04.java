package p4;

import java.util.Stack;

/*
 * Remove Adjacent Duplicates  Given a string, 
 * remove adjacent duplicate characters using Stack.
 *  Example: abbaca -> ca.
 *  
 *  @author : Kalpesh
 */
public class App04 {

	public static void main(String[] args) {

		String input = "abbaca";

		String output = removeAdjacentDuplicates(input);

		System.out.println(output);

		Stack<Character> st = new Stack<Character>();

		// System.out.println(st.peek()); //EmptyStackException
		// System.out.println(st.pop());//EmptyStackException

	}

	private static String removeAdjacentDuplicates(String input) {
		String res = "";
		Stack<Character> st = new Stack<Character>();

		for (char letter : input.toCharArray()) {

			if (!st.empty() && st.peek() == letter)
				st.pop();
			else
				st.push(letter);

		}

		if (st.empty())
			return res;
		else {

			while (!st.empty())
				res += st.pop();
		}

		return new StringBuilder(res).reverse().toString();

	}

}
