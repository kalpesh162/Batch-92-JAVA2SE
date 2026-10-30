package p1;

import java.util.Stack;

public class App01 {
	
	public static void main(String[] args) {
		
		Stack<Integer>st=new Stack<Integer>();
		System.out.println("Stack Empty  "+st.empty());
		
		System.out.println(st.push(11));
		System.out.println(st.push(22));
		System.out.println(st.push(33));
		System.out.println(st.push(44));
		System.out.println(st.push(55));
		
		System.out.println("TOP  "+st.peek());
		
		System.out.println("Search "+st.search(55));
		System.out.println("Search "+st.search(11));
		
		System.out.println("Search "+st.search(99));
		
		System.out.println("Stack Empty  "+st.empty());
		
		System.out.println("POP  "+st.pop());
		
		System.out.println(st);
		
		System.out.println("---------------------");
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
	}

}
