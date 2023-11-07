package com.jsp.MVC.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.MVC.entity.Student;
import com.jsp.MVC.repository.StudentRepository;
@Component
public class StudentDaoimpl implements StudentDao {

	@Autowired
	private StudentRepository repo;
	@Override
	public void insertStdData(Student std) 
	{
		repo.save(std);

	}

}
