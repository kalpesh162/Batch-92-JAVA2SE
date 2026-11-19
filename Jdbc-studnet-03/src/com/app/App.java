package com.app;

import java.util.List;
import java.util.Scanner;

import com.dao.StudentDAO;
import com.model.Student;

public class App {

	static StudentDAO dao = new StudentDAO(); // this dao object has all method related to database logic

	public static Student inputStudent() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter id");
		int id = scanner.nextInt();
		System.out.println("Enter Name");
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("Enter Marks");
		double marks = scanner.nextDouble();

		return new Student(id, name, marks);
	}

	public static void main(String[] args) {

		menu();

	}

	private static void menu() {

		System.out.println("***** WELCOME *****");
		char letter;
		do {
			System.out.println("ENTER OPTION :  ");
			System.out.println(" 1 :  ADD     STUDENT  ");
			System.out.println(" 2 :  DELETE  STUDENT  ");
			System.out.println(" 3 :  GET ALL STUDENT  ");
			System.out.println(" 4 :  UPDATE  STUDENT  ");
			System.out.println(" 5 :  EXIT  ");

			int option;
			Scanner scanner = new Scanner(System.in);
			option = scanner.nextInt();

			switch (option) {
			case 1:
				Student student = inputStudent();
				dao.addStudent(student);
				break;

			case 2:
				System.out.println("Enter id");
				int id = scanner.nextInt();
				dao.deleteStudent(id);
				break;

			case 3:
				List<Student> list = dao.getAllStudents();
				display(list);
				break;

			case 4:
				Student student1 = inputStudent();
				dao.updateStudent(student1);
				break;
			case 5:
				System.out.println("**** THANK YOU *****");
				System.exit(0);
				break;

			}
			System.out.println("ENTER 'Y'  OR  'y'  CONTINUE .....");
			letter = scanner.next().charAt(0);
		} while (letter == 'Y' || letter == 'y');

	}

	private static void display(List<Student> list) {
		System.out.println("*****ALL STUDENTS RECORDS*****");
		System.out.println();
		System.out.println("-------------------------------");
		System.out.printf("%-5s | %-10s | %-10s \n", "ID", "NAME", "MARKS"); // HEADER
		System.out.println("-------------------------------");
		for (Student student : list)
			System.out.println(student);

	}

}
