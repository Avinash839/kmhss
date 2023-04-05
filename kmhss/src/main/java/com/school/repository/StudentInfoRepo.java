package com.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.entity.StudentInfo;

public interface StudentInfoRepo extends JpaRepository<StudentInfo, Long>{

	
	
}
