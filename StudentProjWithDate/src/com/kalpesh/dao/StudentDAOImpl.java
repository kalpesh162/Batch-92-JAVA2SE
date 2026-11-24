package com.kalpesh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.kalpesh.exception.StudentDAOException;
import com.kalpesh.model.Student;
import com.kalpesh.utility.DBUtility;

public class StudentDAOImpl implements StudentDAO {

	public void addStudent(Student student) {
		String query = "insert into student01 (name,marks,admission_date) values(?,?,?)";

		try (Connection con = DBUtility.getDBConnection(); PreparedStatement ps = con.prepareStatement(query)) {

			ps.setString(1, student.getName());
			ps.setDouble(2, student.getMarks());
			ps.setObject(3, student.getAdmissionDate());

			int rowCount = ps.executeUpdate();

			if (rowCount > 0)
				System.out.println("Data Added SUCESS...");
		} catch (Exception e) {
			StudentDAOException ex = new StudentDAOException("Student ADD Failed To Add ");
			ex.initCause(e);
			throw ex;
		}

	}

	@Override
	public void addAllStudent(List<Student> list) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteStudent(int id) {
		String query = "DELETE FROM STUDENT01 WHERE id=?";
		System.out.println("DELETE ID ");
		try (Connection con = DBUtility.getDBConnection(); PreparedStatement ps = con.prepareStatement(query);) {

			ps.setInt(1, id);
			int rowCount = ps.executeUpdate();
			System.out.println("-------------" + rowCount);
			if (rowCount > 0)
				System.out.println("Data DELETE SUCESS...");
		} catch (Exception e) {

			StudentDAOException ex = new StudentDAOException("deleteStudent  Failed To delete with id  " + id);
			ex.initCause(e);
			throw ex;

		}
	}

	@Override
	public void updateStudent(Student student) {
		String query = "update student01 set name=? ,marks =? ,admission_date=? " + "where id=?";

		try (Connection con = DBUtility.getDBConnection(); PreparedStatement ps = con.prepareStatement(query)) {

			ps.setString(1, student.getName());
			ps.setDouble(2, student.getMarks());
			ps.setObject(3, student.getAdmissionDate());
			ps.setInt(4, student.getId());

			int rowCount = ps.executeUpdate();

			if (rowCount > 0)
				System.out.println("Data UPDATE SUCESS...");
		} catch (Exception e) {
			StudentDAOException ex = new StudentDAOException("Student UPDATE  Failed ");
			ex.initCause(e);
			throw ex;
		}

	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findStudentById(int id) {

		Student student = null;
		String SQL = "SELECT * FROM STUDENT01 WHERE ID=?";
		try (Connection con = DBUtility.getDBConnection(); PreparedStatement ps = con.prepareStatement(SQL)) {

			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				student = new Student();
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setMarks(rs.getDouble("marks"));
				student.setAdmissionDate(rs.getDate("admission_date").toLocalDate());
			}
		} catch (

		Exception e) {
			StudentDAOException ex = new StudentDAOException("Student findStudentById Failed  ");
			ex.initCause(e);
			throw ex;
		}

		return student;
	}

}
