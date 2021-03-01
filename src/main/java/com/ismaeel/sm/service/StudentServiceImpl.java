package com.ismaeel.sm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ismaeel.sm.api.Student;
import com.ismaeel.sm.dao.StudentDao;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	@Override
	public List<Student> loadStudents() {
		List<Student> students = studentDao.fetchAll();
		return students;
	}

	@Override
	public void insertStudent(Student student) {
		
		
			studentDao.saveStudent(student);
		

	}

	@Override
	public Student getStudent(int id) {
		
		return studentDao.getStudent(id);
	}

	@Override
	public void updateStudent(Student student) {
		
		studentDao.updateStudent(student);
		
	}

	@Override
	public void deleteStudent(int id) {

		studentDao.deleteStudent(id);
		
	}

}
