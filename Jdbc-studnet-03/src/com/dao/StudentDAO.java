package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.model.Student;

public class StudentDAO {
	
	

	public void addStudent(Student student) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step 2 Get DB Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap92", "root", "root");

			// String query = "insert into student values (" + id + ",'" + name + "'," +
			// marks + " )";
			String query = "insert into student (id,name,marks) values(?,?,?)"; // ? place holder

			// Create PreparedStatement Object By Calling method from Connection
			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1, student.getId());
			ps.setString(2, student.getName());
			ps.setDouble(3, student.getMarks());

			// Excute Query

			int rowCount = ps.executeUpdate();

			if (rowCount > 0)
				System.out.println("Data Added SUCESS...");
		} catch (Exception e) {

			System.out.println("While Adding Student   --->   " + e);

		}
	}

	public void deleteStudent(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step 2 Get DB Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap92", "root", "root");

			String query = "DELETE FROM STUDENT WHERE id=?";

			// Create PreparedStatement Object By Calling method from Connection
			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1, id);

			// Excute Query

			int rowCount = ps.executeUpdate();

			if (rowCount > 0)
				System.out.println("Data DELETE SUCESS...");
		} catch (Exception e) {

			System.out.println("While Adding Student   --->   " + e);

		}
	}

	public void updateStudent(Student student) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step 2 Get DB Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap92", "root", "root");
			// 1 2 3
			String query = "UPDATE STUDENT SET name=? , marks=?  WHERE id=?";

			// Create PreparedStatement Object By Calling method from Connection
			PreparedStatement ps = con.prepareStatement(query);

			ps.setString(1, student.getName());
			ps.setDouble(2, student.getMarks());
			ps.setInt(3, student.getId());

			int rowCount = ps.executeUpdate();

			if (rowCount > 0)
				System.out.println("Data UPDATE SUCESS...");

		} catch (Exception e) {

			System.out.println("While Adding Student   --->   " + e);

		}
	}

	public List<Student> getAllStudents() {

		List<Student> list = new ArrayList<Student>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap92", "root", "root");

			String SQL = "SELECT ID,NAME,MARKS FROM STUDENT";
			PreparedStatement ps = con.prepareStatement(SQL);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Student student = new Student(rs.getInt(1), rs.getString(2), rs.getDouble(3));
				list.add(student);
			}
		} catch (Exception e) {
			System.out.println("While Reading Student  " + e);
		}

		return list;
	}

	public Student findStudentById(int id) {
		Student student=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap92", "root", "root");

			//String SQL = "SELECT ID,NAME,MARKS FROM STUDENT WHERE ID=?";
			String SQL = "SELECT * FROM STUDENT WHERE ID=?";
			PreparedStatement ps = con.prepareStatement(SQL);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				student = new Student(rs.getInt(1), rs.getString(2), rs.getDouble(3));

			}
		} catch (Exception e) {
			System.out.println("While Reading Student  " + e);
		}
		
		return student;

	}

}
