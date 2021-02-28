package com.ismaeel.sm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ismaeel.sm.api.Student;
import com.ismaeel.sm.dao.StudentDao;

@Controller
public class StudentController {

	@Autowired
	StudentDao dao;
	
	@GetMapping("/student-list")
	public String getStudentList(Model model)
	{
		List<Student> studentList = dao.fetchAll();
		
		studentList.forEach(s -> System.out.println(s));
		
		model.addAttribute("studentList", studentList);
		return "studentList";
	}
	
	@GetMapping("/add-student-form")
	public String showStudentForm(Model model)
	{		
		model.addAttribute("student", new Student());
		return "add_student_form";
	}
	
	
	@GetMapping("/add-student")
	public String addStudent(Student student)
	{		
		System.out.println(student);
		dao.saveStudent(student);
		return "redirect:/student-list";
	}
	
}
