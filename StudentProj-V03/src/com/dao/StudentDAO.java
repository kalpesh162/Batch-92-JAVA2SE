package com.dao;

import java.util.List;

import com.model.Student;

public interface StudentDAO {

	void addAllStudent(List<Student> list);

	void addStudent(Student student);

	void deleteStudent(int id);

	void updateStudent(Student student);

	List<Student> getAllStudents();

	Student findStudentById(int id);

}
