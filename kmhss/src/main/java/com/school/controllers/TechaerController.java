package com.school.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.school.entity.Subject;
import com.school.entity.Teacher;
import com.school.repository.SubjectRepo;
import com.school.repository.TecaherRepo;

@RestController
public class TechaerController {

	@Autowired
	TecaherRepo techerRepo;
	
	@Autowired
	SubjectRepo subjectRepo;
	
	
	@GetMapping("/tecaher/{id}")
	public Teacher getTeacher(@PathVariable Long id) throws Exception {
		
		return techerRepo.findById(id).get();
	}
	
	
	@PostMapping("/tecaher")
	public void addteacher(@RequestBody Teacher teacher) {
		try {
			for(Subject sub : teacher.getSubjects()) {
				sub.setTeacher(teacher);
			}
			System.out.println(teacher.toString());
			 techerRepo.save(teacher);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
