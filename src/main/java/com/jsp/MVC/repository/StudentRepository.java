package com.jsp.MVC.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.MVC.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> 
{

}
