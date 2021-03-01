package com.ismaeel.sm.dao;

import java.util.List;

import com.ismaeel.sm.api.Student;

public interface StudentDao {

	public List<Student> fetchAll();
	public void saveStudent(Student st);
	public Student getStudent(int id);
	public void updateStudent(Student student);
	public void deleteStudent(int id);
}
