package com.faculty.management.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String name;
	@Column(name ="couseid", nullable = false)
	private int courseid;
	
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public int getCourseid() {
		return courseid;
	}



	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}



	public Subject(int id, String name, int courseid) {
		super();
		this.id = id;
		this.name = name;
		this.courseid = courseid;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
