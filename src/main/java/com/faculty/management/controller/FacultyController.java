package com.faculty.management.controller;


import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faculty.management.entity.Faculty;
import com.faculty.management.service.FacultyService;

@RestController
@RequestMapping("api/Faculty")
public class FacultyController {
	
	FacultyService service;
	
	@PutMapping("/insertallrecord")
	public Faculty insertAllRecord(@RequestBody Faculty faculty)
	{
		
		service.insertAllRecord(faculty);
		return faculty;
	}
	
	
	
	
	

}
