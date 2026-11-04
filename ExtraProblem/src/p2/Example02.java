package p2;

import java.util.HashSet;

public class Example02 {
	
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 20, 40, 10, 50, 30 };
		HashSet<Integer> list = new HashSet<Integer>();
		for (int ele : arr)
			System.out.println(ele  + "  "+ list.add(ele));

	}

}
