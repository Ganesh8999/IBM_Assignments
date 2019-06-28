package com.ibm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.ibm.bean.Student;

@Service
public class StudentService {

	@Autowired
	StudentDao dao;

	String getStudent(int id) {

		return dao.getStudent(id);
	}

	public List<Student> getStudents() {
		
		return dao.getStudents();
	}

	public void updateUser(Student student, Integer id) {
		
		dao.updateStudent(student,id);
		
	}

	public void addNewStudent(Student student) {
		
		dao.addNewStudent(student);
		
	}

	public void deleteStudent(int id) {
		
	  	dao.deleteStudent(id);
		
	}

	
	
}
