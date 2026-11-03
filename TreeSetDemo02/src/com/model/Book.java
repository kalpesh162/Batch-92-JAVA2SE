package com.model;

public class Book implements Comparable<Book> {

	private int isbnId;
	private String name;
	private String author;
	private double price;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int isbnId, String name, String author, double price) {
		super();
		this.isbnId = isbnId;
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public int getIsbnId() {
		return isbnId;
	}

	public void setIsbnId(int isbnId) {
		this.isbnId = isbnId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("%5d  %10s  %10s  %8.2f  \n", isbnId, name, author, price);
	}

	@Override
	public int compareTo(Book o) {
		Integer i1 = Integer.valueOf(this.isbnId);
		Integer i2 = Integer.valueOf(o.isbnId);
		return i1.compareTo(i2);
	}

}
