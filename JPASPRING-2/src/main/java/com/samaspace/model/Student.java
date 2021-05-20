package com.samaspace.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Stud")
public class Student implements Serializable{
	
	private Long idStudent;
	
	@Column(name = "FirstName", length = 50, nullable = false)
	private String studentFName;
	
	@Column(name = "LastName", length = 50, nullable = false)
	private String studentLName;
	
	@Column(name = "Note", nullable = false)
	private double studentRang;
	
	
	
	public Level level;
	
	public Student() {
		super();
	}
	
	public Student(String studentFName, String studentLName, double studentRang) {
		super();
		this.studentFName = studentFName;
		this.studentLName = studentLName;
		this.studentRang = studentRang;
	}
	
	
	
	
	public Student(String studentFName, String studentLName, double studentRang, Level level) {
		super();
		this.studentFName = studentFName;
		this.studentLName = studentLName;
		this.studentRang = studentRang;
		this.level = level;
	}




	{System.out.println("Hellooo from Student...");}
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(Long idStudent) {
		this.idStudent = idStudent;
	}

	
	
	public String getStudentFName() {
		return studentFName;
	}
	public void setStudentFName(String studentFName) {
		this.studentFName = studentFName;
	}
	
	
	public String getStudentLName() {
		return studentLName;
	}
	public void setStudentLName(String studentLName) {
		this.studentLName = studentLName;
	}
	
	
	
	public double getStudentRang() {
		return studentRang;
	}
	public void setStudentRang(double studentRang) {
		this.studentRang = studentRang;
	}

	
	@ManyToOne
	@JoinColumn(name = "idLevel")
	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	
	
	

	
	
	

}
