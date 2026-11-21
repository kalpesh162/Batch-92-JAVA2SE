package com.app;

import java.util.ArrayList;
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
			System.out.println(" 5 :  GET  STUDENTBYID ");
			System.out.println(" 6 :  ADD MULTIPLE STUDENTS  ");
			System.out.println(" 7 :  EXIT  ");

			int option;
			Scanner scanner = new Scanner(System.in);
			option = scanner.nextInt();

			switch (option) {
			case 1:
				Student student = inputStudent();   // List<Student>list
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
				System.out.println("Enter id");
				int id1 = scanner.nextInt();
				Student student2 = dao.findStudentById(id1);
				if (student2 != null)
					System.out.println(student2);
				else
					System.out.println("STUDENT WITH ID NOT FOUND " + id1);
				break;
				
			case 6:
				     System.out.println("How Many Student Want to ADD  ");;
				     int count=scanner.nextInt();
				     
				     List<Student>studlist=new ArrayList<Student>(count);
				     
				     while (count>=1) {
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
