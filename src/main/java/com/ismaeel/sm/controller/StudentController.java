package com.ismaeel.sm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ismaeel.sm.api.Student;
import com.ismaeel.sm.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/student-list")
	public String getStudentList(Model model)
	{
		List<Student> studentList = studentService.loadStudents();
		
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
		if(student.getId() > 0)
		{
			studentService.updateStudent(student);
		}
		else
		{
			studentService.insertStudent(student);
		}
		
		return "redirect:/student-list";
	}
	
	@GetMapping("/update-student")
	public String updateStudent(@RequestParam("id") int id, Model model)
	{		
		Student student = studentService.getStudent(id);
		model.addAttribute("student", student);
		
		System.out.println(student);
		return "add_student_form";
	}
	
	
	
	@GetMapping("/delete-student")
	public String deleteStudent(@RequestParam("id") int id)
	{		
		studentService.deleteStudent(id);
		return "redirect:/student-list";
	}
	
}
