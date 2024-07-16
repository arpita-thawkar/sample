package com.faculty.management.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Faculty {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="name",nullable = false)
	private String name;
	@Column(name="email",nullable = false)
	private String eamil;
	@Column(name="departmentid",nullable = false)
	private int departmentid;
	
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Faculty( String name, String eamil, int departmentid) {
		super();
		this.name = name;
		this.eamil = eamil;
		this.departmentid = departmentid;
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

	public String getEamil() {
		return eamil;
	}

	public void setEamil(String eamil) {
		this.eamil = eamil;
	}

	public int getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	}
	
	
	
	
	
}
