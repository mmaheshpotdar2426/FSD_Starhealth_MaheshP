package com.example.springrest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Data;


@NoArgsConstructor
@Data
@Entity
@Table(name="TeacherInfo")
public class Teacher {

	@Id
	@Column(name="teacher_id")
	private int tid;
	@Column(name="teacher_name")
	private String tname;
	private String department;
	private double salary;
	
}
