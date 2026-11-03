package com.app;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

import com.model.Book;
import com.model.BookNameComparator;

public class App {
	
	static  void sortedSetMethods(SortedSet<Book>ts){
		
		System.out.println("First   "+ts.first());
		System.out.println("Last   "+ts.last());
		Book b4 = new Book(104, "Effective Java", "Joshua Bloch", 650.00);
		System.out.println(ts.headSet(b4));   // from    < to
		
		System.out.println();
		System.out.println(ts.tailSet(b4));  // from=    to
		
		
	}

	public static void main(String[] args) {

		TreeSet<Book> library = new TreeSet<>();
		Book b1 = new Book(101, "Java Programming", "James Gosling", 450.50);

		Book b2 = new Book(102, "Python Programming", "Guido van Rossum", 550.00);

		Book b3 = new Book(103, "C Programming", "Dennis Ritchie", 350.00);

		Book b4 = new Book(104, "Effective Java", "Joshua Bloch", 650.00);

		Book b5 = new Book(105, "Clean Code", "Robert C. Martin", 700.00);

		library.add(b1);
		library.add(b2);
		library.add(b5);
		library.add(b3);
		library.add(b4);

		System.out.println("BASED ON ID  ");
		for (Book book : library)
			System.out.println(book);

		System.out.println("---------------------------------------");

		BookNameComparator comparator = new BookNameComparator();
		TreeSet<Book> byBookName = new TreeSet<Book>(comparator);
		byBookName.add(b1);
		byBookName.add(b2);
		byBookName.add(b5);
		byBookName.add(b3);
		byBookName.add(b4);

		System.out.println("BASED ON Name  ");
		for (Book book : byBookName)
			System.out.println(book);

		System.out.println("----------------------------------------------");

		// Anonymous inner class
		Comparator<Book> byAuthor = new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {

				return o1.getAuthor().compareTo(o2.getAuthor());
			}

		};

		TreeSet<Book> byBookAuthor = new TreeSet<Book>(byAuthor);
		byBookAuthor.add(b1);
		byBookAuthor.add(b2);
		byBookAuthor.add(b5);
		byBookAuthor.add(b3);
		byBookAuthor.add(b4);
		System.out.println("++++++++++++++++++++++++++++++");
		System.out.println("BASED ON Author Name  ");
		for (Book book : byBookAuthor)
			System.out.println(book);

		System.out.println("++++++++++++++++++++++++++++++");

		TreeSet<Book> byBookPrice = new TreeSet<Book>(new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {
				Double d1 = o1.getPrice();
				Double d2 = o2.getPrice();
				return d1.compareTo(d2);
			}
		});

		byBookPrice.add(b1);
		byBookPrice.add(b2);
		byBookPrice.add(b5);
		byBookPrice.add(b3);
		byBookPrice.add(b4);
		System.out.println("++++++++++++++++++++++++++++++");
		System.out.println("BASED ON Book Price  ");
		for (Book book : byBookPrice)
			System.out.println(book);

		System.out.println("++++++++++++++++++++++++++++++");

		
		sortedSetMethods(byBookPrice);
	}

}
