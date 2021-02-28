package com.ismaeel.sm.dao.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ismaeel.sm.api.Student;

public class StudentRowMapper implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int index) throws SQLException {
		
		Student s = new Student();
		s.setId(rs.getInt(1));
		s.setName(rs.getString(2));
		s.setAddress(rs.getString(3));
		s.setMobile(rs.getLong(4));
		return s;
	}

}
