package com.faculty.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faculty.management.dao.SubjectDao;
import com.faculty.management.entity.Subject;

@Service
public class SubjectService {
	@Autowired
	SubjectDao dao;

	public List<Subject> getAllSubjects() {
		
		return dao.getAllSubject();
	}

	public void SaveSubject( Subject subject) {
		
	 dao.SaveSubject(subject);
	}

	public Subject getSubjectById(int id) {
		
		return dao.getSubjectById(id);
	}

	public void deleteSubject(int id) {
		 
		dao.deletesubject(id);
		
	}


	
	
	
	  

	
	

}
