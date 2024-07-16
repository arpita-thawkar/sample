package com.faculty.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faculty.management.dao.FacultyDao;
import com.faculty.management.entity.Faculty;

@Service
public class FacultyService {
	@Autowired
	FacultyDao dao;

	public void insertAllRecord(Faculty faculty) {
		
		dao.insertAllRecord(faculty);
		
	}
	

}
