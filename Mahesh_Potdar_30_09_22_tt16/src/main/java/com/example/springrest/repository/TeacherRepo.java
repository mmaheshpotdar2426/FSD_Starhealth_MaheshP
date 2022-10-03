package com.example.springrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springrest.entity.Teacher;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Integer> {

	
}
