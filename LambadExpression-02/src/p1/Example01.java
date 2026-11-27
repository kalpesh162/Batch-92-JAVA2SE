package p1;

import java.sql.Connection;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Example01 {

	public static void main(String[] args) {

		Consumer<String> byName = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println("***" + t.toUpperCase() + "***");
			}
		};

		byName.accept("Hello");

		// Print Name
		Consumer<String> ref = (String name) -> System.out.println(name.toLowerCase());

		ref.accept("KALPESH");

		Consumer<Integer> evenOdd = (Integer i) -> {
			if (i % 2 == 0)
				System.out.println("Even");
			else
				System.out.println("ODD");
		};

		evenOdd.accept(5);
		evenOdd.accept(34);

		Consumer<Integer> evenOdd1 = (i) -> {
			if (i % 2 == 0)
				System.out.println("Even");
			else
				System.out.println("ODD");
		};

		Consumer<Integer> evenOdd2 = i -> {
			if (i % 2 == 0)
				System.out.println("Even");
			else
				System.out.println("ODD");
		};

	}

}
