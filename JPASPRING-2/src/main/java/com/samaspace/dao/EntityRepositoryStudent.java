package com.samaspace.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.samaspace.model.Student;

public interface EntityRepositoryStudent extends JpaRepository<Student, Long> {

	@Query("SELECT s FROM Student s WHERE s.studentFName like :x")
	public List<Student> searchStudentByName(@Param("x")String SName);
}
