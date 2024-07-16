package com.faculty.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.faculty.management.entity.Subject;
import com.faculty.management.service.SubjectService;

@RestController
@RequestMapping("api/Subject")
public class SubjectController {
	
	@Autowired
	SubjectService service;
	
	@GetMapping("/getallsubjects")
    public List<Subject> getAllSubjects() {
        return service.getAllSubjects();
    }

	
	@PutMapping("/insertallRecords")
	public Subject insertAllRecord(@RequestBody Subject subject)
	{
		service.SaveSubject(subject);
		return subject;
	}
	
	

    @GetMapping("/{id}")
    public Subject getSubjectById(@PathVariable int id) {
        return service.getSubjectById(id);
    }
    

    @PutMapping("/{id}")
    public Subject updateSubject(@PathVariable int id, @RequestBody Subject subjectDetails) {
        Subject subject = service.getSubjectById(id);
        if (subject != null) {
            subject.setName(subjectDetails.getName());
            subject.setCourseid(subjectDetails.getCourseid());
            service.SaveSubject(subject);
        }
        return subject;
    }
    
    @DeleteMapping("/{id}")
    public void deleteSubject(@PathVariable int id) {
        service.deleteSubject(id);
    }
    

}
