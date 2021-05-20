package com.samaspace;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.samaspace.dao.EntityRepositoryLevel;
import com.samaspace.dao.EntityRepositoryStudent;
import com.samaspace.model.Level;
import com.samaspace.model.Student;

@SpringBootApplication
public class Jpaspring2Application {

	public static void main(String[] args) {
		
		ApplicationContext atx =
		SpringApplication.run(Jpaspring2Application.class, args);
		
		EntityRepositoryStudent dao = atx.getBean(EntityRepositoryStudent.class);
		EntityRepositoryLevel daoLevel = (EntityRepositoryLevel) atx.getBean("daoLevel");
		
		
		Level l1 = new Level("Sliver");
		Level l2 = new Level("Gold");
		Level l3 = new Level("Dimand");
		daoLevel.save(l1);
		daoLevel.save(l2);
		daoLevel.save(l3);
		
		
		dao.save(new Student("User", "one", 13, l1));
		dao.save(new Student("User", "two", 16, l2));
		dao.save(new Student("User", "three", 15, l3));
		Student s1 = new Student("Oussama", "ELHarmali", 14, l1);
		dao.save(s1);
		//dao.delete(s1);
		
		
		List<Student> myStudents = dao.findAll();
		//List<Student> myStudents = dao.searchStudentByName("%"+"Ouss"+"%");
		
		for(int i=0;i < myStudents.size();++i) {
			System.out.println("Le nom est :"+" "+myStudents.get(i).getStudentFName());
			System.out.println("La note : "+" "+myStudents.get(i).getStudentRang());
			System.out.println("**************************************");
		}
		
		
		List<Level> myLevels = daoLevel.findAll();
		for(int i =0;i<myLevels.size();++i) {
			System.out.println("################################################");
			System.out.println("Level "+i+" "+ "is"+" "+myLevels.get(i).getLevel());
			System.out.println("################################################");
		}
		
	}

}
