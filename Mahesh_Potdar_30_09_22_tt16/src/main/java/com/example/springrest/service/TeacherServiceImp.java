package com.example.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springrest.entity.Teacher;
import com.example.springrest.repository.TeacherRepo;

@Service
public class TeacherServiceImp implements ITeacherService {

	@Autowired
	TeacherRepo repo;
	
	@Override
	public Teacher addTeacher(Teacher teacher) {
		return repo.save(teacher);
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		return repo.save(teacher);
	}

	@Override
	public Teacher selectTeacherById(int id) {
		return repo.findById(id).orElse(new Teacher());
	}

	@Override
	public void deleteTeacherById(int id) {
		repo.deleteById(id);
	}

	@Override
	public List<Teacher> selectAllTeacher() {
		return repo.findAll();
	}
	

}
