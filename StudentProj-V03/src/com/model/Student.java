package com.model;

public class Student {
	private int id;
	private String name;
	private double marks;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, double marks) {
		if (isValidStudent(id, name, marks)) {
			this.id = id;
			this.name = name;
			this.marks = marks;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return String.format("%-5d | %-10s | %-10.2f ", id, name, marks);
	}

	private boolean isValidStudent(int id, String name, double marks) {
		if (id < 0)
			throw new IllegalArgumentException("Not Valid " + id);
		{

		}
		if (name.equals("") || name.equals(null) || name.isEmpty()) {
			throw new IllegalArgumentException("In Valid Name" + marks);
		}
		if (marks <= 0 || marks > 100) {
			throw new IllegalArgumentException("In Valid Marks" + marks);
		}

		return true;

	}

}
