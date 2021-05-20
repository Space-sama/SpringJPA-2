package com.samaspace.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Levels")
public class Level implements Serializable{

	
	@Id @GeneratedValue
	private Long idLevel;
	
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "level", fetch = FetchType.LAZY)
	private Collection<Student> students;
	
	
	@Column(length = 100, nullable = false)
	private String Level;


	public Level(String level) {
		super();
		Level = level;
	}


	public Level() {
		super();
	}


	
	public Collection<Student> getStudents() {
		return students;
	}


	public void setStudents(Collection<Student> students) {
		this.students = students;
	}


	public String getLevel() {
		return Level;
	}


	public void setLevel(String level) {
		Level = level;
	}
	
	
	
}
