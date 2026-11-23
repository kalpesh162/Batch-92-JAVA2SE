package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.exception.StudentDAOException;
import com.model.Student;
import com.utilty.DBUtility;

public class StudentDAO {

	public void addAllStudent(List<Student> list) {
		String query = "insert into student (id,name,marks) values(?,?,?)";

		try (Connection con = DBUtility.getDBConnection(); PreparedStatement ps = con.prepareStatement(query)) {

			for (Student student : list) {
				ps.setInt(1, student.getId());
				ps.setString(2, student.getName());
				ps.setDouble(3, student.getMarks());

				int rowCount = ps.executeUpdate();
				if (rowCount > 0)
					System.out.println("Data Added SUCESS...");
			}

		} catch (Exception e) {

			StudentDAOException ex = new StudentDAOException("Student ADD Failed To Add ");
			ex.initCause(e);
			throw ex;

		}

	}

	public void addStudent(Student student) {
		String query = "insert into student (id,name,marks) values(?,?,?)";

		try (Connection con = DBUtility.getDBConnection(); PreparedStatement ps = con.prepareStatement(query)) {
			ps.setInt(4, student.getId());
			ps.setString(2, student.getName());
			ps.setDouble(3, student.getMarks());

			int rowCount = ps.executeUpdate();

			if (rowCount > 0)
				System.out.println("Data Added SUCESS...");
		} catch (Exception e) {
			StudentDAOException ex = new StudentDAOException("Student ADD Failed To Add ");
			ex.initCause(e);
			throw ex;
		}

	}

	public void deleteStudent(int id) {
		try {
			Connection con = DBUtility.getDBConnection();
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
			Connection con = DBUtility.getDBConnection();
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
			Connection con = DBUtility.getDBConnection();
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
		Student student = null;
		try {
			Connection con = DBUtility.getDBConnection(); // String SQL = "SELECT ID,NAME,MARKS FROM STUDENT WHERE
															// ID=?";
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
