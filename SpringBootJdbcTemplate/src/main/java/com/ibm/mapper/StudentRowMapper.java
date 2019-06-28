package com.ibm.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ibm.bean.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student student = new Student();
		
		student.setStudentCode(rs.getInt("Student_Code"));
		student.setStudentName(rs.getString("Student_Name"));
		student.setDeptCode(rs.getInt("Dept_Code"));
		student.setDate(rs.getDate("Student_DOB"));
		student.setAddress(rs.getString("Student_Address"));
		
		
		return student;
	}
	

}
