package com.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.entity.Subject;

@Repository
public interface SubjectRepo extends JpaRepository<Subject, Long>{

}
