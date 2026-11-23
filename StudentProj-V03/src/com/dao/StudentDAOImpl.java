package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exception.StudentDAOException;
import com.model.Student;
import com.utilty.DBUtility;

public class StudentDAOImpl implements StudentDAO {

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

			StudentDAOException ex = new StudentDAOException("addAllStudent Failed To Add ");
			ex.initCause(e);
			throw ex;

		}

	}

	public void addStudent(Student student) {
		String query = "insert into student (id,name,marks) values(?,?,?)";

		try (Connection con = DBUtility.getDBConnection(); PreparedStatement ps = con.prepareStatement(query)) {
			ps.setInt(1, student.getId());
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

			StudentDAOException ex = new StudentDAOException("deleteStudent  Failed To delete with id  " + id);
			ex.initCause(e);
			throw ex;

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

			StudentDAOException ex = new StudentDAOException("Student update Failed To update ");
			ex.initCause(e);
			throw ex;

		}
	}

	public List<Student> getAllStudents() {

		List<Student> list = new ArrayList<Student>();
		try {
			Connection con = DBUtility.getDBConnection();
			String SQL = "SELECT ID,NAME,MARKS FROM STUDENT";
			PreparedStatement ps = con.prepareStatement(SQL);

			ResultSet rs = ps.executeQuery();

			list = mapRow(rs);

		} catch (Exception e) {
			StudentDAOException ex = new StudentDAOException("getAllStudents  Not ablte to read ALl");
			ex.initCause(e);
			throw ex;
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
			StudentDAOException ex = new StudentDAOException("Student findStudentById Failed  ");
			ex.initCause(e);
			throw ex;
		}

		return student;

	}

	private List<Student> mapRow(ResultSet rs) {
		List<Student> list = new ArrayList<Student>();

		try {
			while (rs.next()) {
				Student student = new Student(rs.getInt(1), rs.getString(2), rs.getDouble(3));
				list.add(student);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

}
