package com.ismaeel.sm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ismaeel.sm.api.Student;
import com.ismaeel.sm.dao.rowMapper.StudentRowMapper;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	public List<Student> fetchAll() {

		String query = "select * from student";
		
		List<Student> students = jdbcTemplate.query(query, new StudentRowMapper());
		return students;
	}
	@Override
	public void saveStudent(Student st) {
		
		String sql = "insert into student(name, address, mobile) values(?, ?, ?)";
		
		Object[] args = {st.getName(),st.getAddress(), st.getMobile()};
		jdbcTemplate.update(sql, args);
		
		System.out.println("1: record inserted");
		
	}

}
