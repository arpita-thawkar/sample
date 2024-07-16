package com.faculty.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faculty.management.dao.DepartmentDao;
import com.faculty.management.entity.Department;

@Service
public class DepartmentServices {

	@Autowired
	DepartmentDao dao;
	  
	public List<Department> getAllDepartments() {
		
		return dao.getAllDepartment();
	}

	public void saveDepartment(Department department) {
		dao.saveDepartment(department);
		
	}

	public Department getDepartmentById(int id) {

		return dao.getDepartmentNameById(id);
	}


	public void updateDepartment(Department department) {
	
		dao.updateDepartment(department);
		
	}

	  
	 public void deleteDepartment(int id)
			 {
		         dao.deleteDepartment(id);
		 
			 }

	
	
	
	
	
	
	
}
