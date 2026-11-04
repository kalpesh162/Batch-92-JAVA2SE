package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

/*
 * 

1 :Find Duplicate Elements
Input:
[10, 20, 30, 20, 40, 10, 50, 30]
Expected output:
10, 20, 30

 * 
 */
public class Example01 {

	public static ArrayList<Integer> duplicates(ArrayList<Integer> list) {
		HashSet<Integer> numbers = new HashSet<>();

		ArrayList<Integer> duplicateEle = new ArrayList<Integer>();
		for (Integer ele : list) {
			if (!numbers.add(ele))
				duplicateEle.add(ele);
		}

		Collections.sort(duplicateEle);
		return duplicateEle;
	}

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 20, 40, 10, 50, 30 };
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int ele : arr)
			list.add(ele);

		System.out.println("Before  " + list);
		ArrayList<Integer> dupElements = duplicates(list);

		System.out.println(dupElements);

	}

}
