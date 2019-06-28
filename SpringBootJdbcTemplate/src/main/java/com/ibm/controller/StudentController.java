package com.ibm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.bean.Student;


@RestController
public class StudentController {

	@Autowired
	StudentService service;

	@RequestMapping("/users/{id}")
	String getStudent(@PathVariable int id) {

		return service.getStudent(id);
	}

	@RequestMapping("/users")
	public List<Student> getStudents() {

		List<Student> studentDetails = service.getStudents();
		
//		for (Student student : studentDetails) {
//			
//			System.out.println(student.getStudentName());
//			
//		}
		
		return service.getStudents();
	}
	
	
	//update user by id
		@RequestMapping(method = RequestMethod.PUT, value="/users/{id}")
		void updateStudent(@RequestBody Student student,@PathVariable Integer id) {
			
			service.updateUser(student,id);
			
		}
		
		@RequestMapping(method = RequestMethod.POST, value="/users")
		void addNewStudent(@RequestBody Student student) {
			
			service.addNewStudent(student);
			
		}
		
		@RequestMapping(method = RequestMethod.DELETE,value="/users/{id}")
		public void deleteStudent(@PathVariable int id) {
	
			service.deleteStudent(id);
		}

}
