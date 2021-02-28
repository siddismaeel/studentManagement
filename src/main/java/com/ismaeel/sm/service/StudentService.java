package com.ismaeel.sm.service;

import java.util.List;

import com.ismaeel.sm.api.Student;

public interface StudentService {
	
	public List<Student> loadStudents();
	public void insertStudent(Student student);

}
