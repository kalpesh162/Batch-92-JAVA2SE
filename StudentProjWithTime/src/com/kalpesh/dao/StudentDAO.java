package com.kalpesh.dao;

import java.util.List;

import com.kalpesh.model.Student;


public interface StudentDAO {

	void addAllStudent(List<Student> list);

	void addStudent(Student student);

	void deleteStudent(int id);

	void updateStudent(Student student);

	List<Student> getAllStudents();

	Student findStudentById(int id);

}
