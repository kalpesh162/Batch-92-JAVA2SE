package com.kalpesh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.kalpesh.exception.StudentDAOException;
import com.kalpesh.model.Student;
import com.kalpesh.utility.DBUtility;

public class StudentDAOImpl implements StudentDAO {

	public void addStudent(Student student) {
		String query = "insert into student02 (name,marks,admission_date,admission_time) values(?,?,?,?)";

		try (Connection con = DBUtility.getDBConnection(); PreparedStatement ps = con.prepareStatement(query)) {

			ps.setString(1, student.getName());
			ps.setDouble(2, student.getMarks());
			ps.setObject(3, student.getAdmissionDate());
			ps.setObject(4, student.getAdmissionTime());

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
		String query = "DELETE FROM STUDENT02 WHERE id=?";
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
		String query = "update student02 set name=? ,marks =? ,admission_date=? , admission_time=?" + "where id=?";

		try (Connection con = DBUtility.getDBConnection(); PreparedStatement ps = con.prepareStatement(query)) {

			ps.setString(1, student.getName());
			ps.setDouble(2, student.getMarks());
			ps.setObject(3, student.getAdmissionDate());
			ps.setObject(4, student.getAdmissionTime());
			ps.setInt(5, student.getId());

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
		List<Student> list=new ArrayList<Student>();
		String SQL = "SELECT * FROM STUDENT02";
		try (Connection con = DBUtility.getDBConnection(); PreparedStatement ps = con.prepareStatement(SQL)) {

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Student student = new Student();
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setMarks(rs.getDouble("marks"));
				student.setAdmissionDate(rs.getDate("admission_date").toLocalDate());
				student.setAdmissionTime(rs.getTime("admission_time").toLocalTime());
				list.add(student);
			}
		} catch (

		Exception e) {
			StudentDAOException ex = new StudentDAOException("Student findStudentById Failed  ");
			ex.initCause(e);
			throw ex;
		}

		return list;
		
	}

	@Override
	public Student findStudentById(int id) {

		Student student = null;
		String SQL = "SELECT * FROM STUDENT02 WHERE ID=?";
		try (Connection con = DBUtility.getDBConnection(); PreparedStatement ps = con.prepareStatement(SQL)) {

			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				student = new Student();
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setMarks(rs.getDouble("marks"));
				student.setAdmissionDate(rs.getDate("admission_date").toLocalDate());
				student.setAdmissionTime(rs.getTime("admission_time").toLocalTime());
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
