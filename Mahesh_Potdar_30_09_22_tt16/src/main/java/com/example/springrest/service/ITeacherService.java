package com.example.springrest.service;

import java.util.List;

import com.example.springrest.entity.Teacher;

public interface ITeacherService {


	public Teacher  addTeacher(Teacher teacher);
	public Teacher  updateTeacher(Teacher teacher);
	
	public Teacher selectTeacherById(int id);
	public void    deleteTeacherById(int id);
	
	public List<Teacher>  selectAllTeacher();
	
}
