package com.ibm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.ibm.bean.Student;
import com.ibm.mapper.StudentRowMapper;

@Repository
public class StudentDao {

	@Autowired
	JdbcTemplate template;

	@Autowired
	NamedParameterJdbcTemplate ntemp;

	public String getStudent(int id) {

		String getStudentQuery = "select Student_Name from student_master where Student_Code = ?";

		return this.template.queryForObject(getStudentQuery, new Object[] { id }, String.class);

	}

	public List<Student> getStudents() {

		String allStudents = "select * from student_master";

		return (List<Student>) ntemp.query(allStudents, new StudentRowMapper());
	}

	public void updateStudent(Student student, Integer id) {

		String updateQuery = "update student_master set Student_Name = :sName where Student_Code = :uId";

		SqlParameterSource paramSource = new MapSqlParameterSource("uId", id).addValue("sName",
				student.getStudentName());

		ntemp.update(updateQuery, paramSource);

	}

	// add new user
	public void addNewStudent(Student student) {
		// System.out.println(customer);
		String addStudentQuery = "insert into student_master(Student_Name,Dept_Code,Student_DOB,Student_Address) values(:Student_Name,:Dept_Code,:Student_DOB,:Student_Address)";

		SqlParameterSource paramSource = new MapSqlParameterSource("Student_Name", student.getStudentName())
				.addValue("Dept_Code", student.getStudentCode()).addValue("Student_DOB", student.getDate())
				.addValue("Student_Address", student.getAddress());

		ntemp.update(addStudentQuery, paramSource);
	}

	// delete user by id
	public void deleteStudent(int id) {
		String deleteQuery = "delete from student_master where Student_Code = :sId";
		
		SqlParameterSource parameterSource = new MapSqlParameterSource("sId",id);
		ntemp.update(deleteQuery, parameterSource);
		
		
		

	}

	
}
