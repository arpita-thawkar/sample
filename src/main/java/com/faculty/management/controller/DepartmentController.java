package com.faculty.management.controller;

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

import com.faculty.management.entity.Department;
import com.faculty.management.service.DepartmentServices;


@RestController
@RequestMapping("/api/department")
public class DepartmentController {
	@Autowired
	DepartmentServices service;
	
	

	 @GetMapping("/getalldepartment")
	    public List<Department> getAllDepartments() {
	        return service.getAllDepartments();
	    }

	 @PostMapping("/insert")
	    public Department createDepartment(@RequestBody Department department) {
	        service.saveDepartment(department);
	        return department;
	    }
	
	
	 @GetMapping("/{id}")
	    public Department getDepartmentById(@PathVariable int id) {
	        return service.getDepartmentById(id);
	    
	
}
	 
	 @PutMapping("/{id}")
	    public Department updateDepartment(@PathVariable int id, @RequestBody Department departmentDetails) {
	        Department department = service.getDepartmentById(id);
	        if (department != null) {
	            department.setName(departmentDetails.getName());
	            service.updateDepartment(department);
	        }
	        return department;
	 }
	        
	        @DeleteMapping("/{id}")
	        public void deleteDepartment(@PathVariable int id) 
	        {
	            service.deleteDepartment(id);
	        }

}
