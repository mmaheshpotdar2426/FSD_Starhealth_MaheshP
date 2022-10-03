package com.star.demo.springd;

import java.util.List;


public class Student {

	private int sid;
	private String sname; 
	private  Teacher  teacher;
	private List<String> subjects;
		
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int sid, String sname, Teacher teacher, List<String> subjects) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.teacher = teacher;
		this.subjects = subjects;
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	
	
	
}
