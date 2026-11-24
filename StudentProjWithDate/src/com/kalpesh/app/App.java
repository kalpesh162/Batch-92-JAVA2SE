package com.kalpesh.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kalpesh.dao.StudentDAO;
import com.kalpesh.dao.StudentDAOFactory;
import com.kalpesh.model.Student;

public class App {

	static StudentDAO dao = StudentDAOFactory.getStudentDAO();

	public static Student inputStudent() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Name");
		String name = scanner.nextLine();
		System.out.println("Enter Marks");
		double marks = scanner.nextDouble();
		System.out.println("ENTER Year ");
		int year = scanner.nextInt();
		System.out.println("ENTER Month ");
		int month = scanner.nextInt();
		System.out.println("ENTER Day ");
		int day = scanner.nextInt();
		return new Student(name, marks, year, month, day);
	}

	public static Student forUpdateStudent() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Existing Student ID ");
		int exId = scanner.nextInt();

		Student student = dao.findStudentById(exId);
		if (student == null)
			throw new RuntimeException("Student Record Not Found With id " + exId);

		System.out.println("Enter Name");
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("Enter Marks");
		double marks = scanner.nextDouble();
		System.out.println("ENTER Year ");
		int year = scanner.nextInt();
		System.out.println("ENTER Month ");
		int month = scanner.nextInt();
		System.out.println("ENTER Day ");
		int day = scanner.nextInt();
		LocalDate date = LocalDate.of(year, month, month);
		student.setName(name);
		student.setMarks(marks);
		student.setAdmissionDate(date);
		return student;

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
			System.out.println(" 5 :  GET  STUDENTBYID ");
			System.out.println(" 6 :  ADD MULTIPLE STUDENTS  ");
			System.out.println(" 7 :  EXIT  ");

			int option;
			Scanner scanner = new Scanner(System.in);
			option = scanner.nextInt();

			switch (option) {
			case 1:
				Student student = inputStudent(); // List<Student>list
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

				Student student1 = forUpdateStudent();
				dao.updateStudent(student1);
				break;
			case 5:
				System.out.println("Enter id");
				int id1 = scanner.nextInt();
				Student student2 = dao.findStudentById(id1);
				if (student2 != null)
					System.out.println(student2);
				else
					System.out.println("STUDENT WITH ID NOT FOUND " + id1);
				break;

			case 6:
				System.out.println("How Many Student Want to ADD  ");
				;
				int count = scanner.nextInt();

				List<Student> studlist = new ArrayList<Student>(count);

				while (count >= 1) {
					studlist.add(inputStudent());
					count--;
				}

				dao.addAllStudent(studlist);

			case 7:
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
