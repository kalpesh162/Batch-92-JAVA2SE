package com.kalpesh.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Student implements Serializable {
	private int id;
	private String name;
	private double marks;
	private LocalDate admissionDate;

	public Student() {

	}

	public Student(String name, double marks, LocalDate admissionDate) {
		this.name = name;
		this.marks = marks;
		this.admissionDate = admissionDate;
	}

	public Student(String name, double marks, int year, int month, int dayOfMonth) {
		this.name = name;
		this.marks = marks;
		this.admissionDate = LocalDate.of(year, month, dayOfMonth);
	}

	public int getId() {
		return id;
	}
	
	

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public LocalDate getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(LocalDate admissionDate) {
		this.admissionDate = admissionDate;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", admissionDate=" + admissionDate + "]";
	}

}
