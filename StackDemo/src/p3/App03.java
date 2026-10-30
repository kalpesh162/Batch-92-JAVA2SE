package p3;

import java.util.Stack;

/*
 *   Balanced Parentheses    Given a string containing (), {} and [], 
 *   check whether all brackets are properly balanced. 
 *   Example: {[()]} -> Balanced.
 *   
 *   @author : Kalpesh
 */

public class App03 {

	public static void main(String[] args) {

		String input = "{[()]}";

		System.out.println(balancedParentheses(input));

	}

	private static boolean balancedParentheses(String input) {

		Stack<Character> st = new Stack<Character>();

		for (char ch : input.toCharArray()) {

			if (ch == '{' || ch == '[' || ch == '(') {
				st.push(ch);
			}

			else {

				char symbol = st.peek();

				if (symbol == '(' && ch == ')' || symbol == '[' && ch == ']' || symbol == '{' && ch == '}')
					st.pop();

			}

		}

		if (st.empty())
			return true;
		else
			return false;

	}

}
