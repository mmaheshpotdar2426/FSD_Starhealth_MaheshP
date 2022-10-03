package com.example.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springrest.entity.Teacher;
import com.example.springrest.service.ITeacherService;

@RestController
@RequestMapping("/api/teacher")
public class TeacherController {

	@Autowired
	ITeacherService service;
	
	//@RequestMapping(value="/add",method= RequestMethod.POST)
	@PostMapping("/add")
	public Teacher add(@RequestBody Teacher teacher) {
		return service.addTeacher(teacher);
	}
		
	@PutMapping("/update")
	public Teacher update(@RequestBody Teacher teacher) {
		return service.updateTeacher(teacher);
	}
		
	@DeleteMapping("/delete/{id}")  // http://localhost:8080/api/teacher/delete/101
	public String delete(@PathVariable int id) {
		service.deleteTeacherById(id);
		return "Recored Deleted Successfully";
	}
		
	@GetMapping("/get/{id}")
	public Teacher  getById(@PathVariable  int id) {    // http://localhost:8080/api/teacher/get/101
		return service.selectTeacherById(id);
	}
		
	@GetMapping("/getall")
	public List<Teacher>  getAll(){  // http://localhost:8080/api/teacher/getall
		return service.selectAllTeacher();
	}
	
}
