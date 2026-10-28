package com.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.model.Student;

public class App {

	private static Scanner scanner = new Scanner(System.in);

	public static Student inputStudent() {
		System.out.println("ENTER ID  :");
		int id = scanner.nextInt();
		System.out.println("ENTER Name  :");
		String name = scanner.next();
		System.out.println("ENTER Marks  :");
		double marks = scanner.nextDouble();

		return new Student(id, name, marks);
	}

	public static void displayStudents(ArrayList<Student> list) {
		String header = String.format("%-5s %-10s %-10s  \n", "ID", "NAME", "MARKS");
		System.err.println(header);
		System.out.println("-----------------------------------");
		for (Student student : list)
			System.out.println(student);

	}

	public static Student findById(int id, ArrayList<Student> list) {
		for (Student student : list) {
			if (student.getId() == id)
				return student;
		}

		return null;
		// throw RuntimeException("Student Not Found With The id "+id);
	}

	public static void main(String[] args) {
		// Data
		ArrayList<Student> students = new ArrayList<Student>();

		for (int i = 1; i <= 3; i++) {
			Student student_add = inputStudent();
			students.add(student_add);
		}

		displayStudents(students);

		System.out.println("----------find-------------");

		Student student = findById(11, students);

		//
		System.out.println(student);

		// method Overload

	}

}
