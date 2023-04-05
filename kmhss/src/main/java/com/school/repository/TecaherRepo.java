package com.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.entity.Teacher;

@Repository
public interface TecaherRepo extends JpaRepository<Teacher, Long>{

}
