package com.app;

import java.util.List;

import com.dao.StudentDAO;
import com.model.Student;

public class App {

	public static void main(String[] args) {

		// user input

		StudentDAO dao = new StudentDAO();
		Student student = new Student(11, "Kalpesh", 77.77);

		// store to db

		List<Student> list = dao.getAllStudents();

	}

}
