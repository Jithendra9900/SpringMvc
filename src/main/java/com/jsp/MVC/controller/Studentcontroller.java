package com.jsp.MVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.MVC.dao.StudentDao;
import com.jsp.MVC.entity.Student;

@Controller
public class Studentcontroller
{
	@Autowired
	private StudentDao dao;
	@RequestMapping("/addstd")
	public ModelAndView adddata(int sid,String sname,String stream,String sper)
	{
		ModelAndView mv=new ModelAndView();
		Student s=new Student();
		s.setSid(sid);
		s.setSname(sname);
		s.setStream(stream);
		s.setSper(sper);
		dao.insertStdData(s);
		mv.addObject("reslut", "Student Data Added Successfully...!!!");
		mv.setViewName("Addstd");
		return mv;
		
		
		
	}

}
