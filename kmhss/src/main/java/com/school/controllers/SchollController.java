package com.school.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.school.entity.Student;
import com.school.repository.StudentRepo;

@RestController
public class SchollController {
	
	@Autowired
	private StudentRepo studentRepo;

	@GetMapping("/school")
	public String getName() {
		return "Kamaraj Matric Hr Sec Shool";
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		return studentRepo.findAll();
	}
	
	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable  Long id) {
		return studentRepo.findById(id).get();
	}
	
	 @PostMapping("/student")
	    public Student createEmployee(@RequestBody Student student) {
		 	System.out.println(student.toString());
	        return studentRepo.save(student);
	    }
}
