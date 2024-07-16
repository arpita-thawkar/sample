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

import com.faculty.management.entity.Course;
import com.faculty.management.service.CourseService;
@RestController
@RequestMapping("api/course")
public class CourseController {
        
	@Autowired
	CourseService service;
	
	  @PostMapping("/create")
	    public Course createCourse(@RequestBody Course course) {
	        service.saveCourse(course);
	        return course;
	    }
	
	   @GetMapping("/getall")
	    public List<Course> getAllCourses() {
	        return service.getAllCourses();
	    }
	   
	   
	   @GetMapping("/{id}")
	    public Course getCourseById(@PathVariable int id) {
	        return service.getCourseById(id);
	    }
	
	   @PutMapping("/{id}")
	    public Course updateCourse(@PathVariable int id, @RequestBody Course courseDetails) {
	        Course course = service.getCourseById(id);
	        if (course != null) {
	            course.setName(courseDetails.getName()); 
	            service.saveCourse(course);
	        }
	        return course;
	    }
	   
	   
	   @DeleteMapping("/{id}")
	    public void deleteCourse(@PathVariable int id) {
	        service.deleteCourse(id);
	    }
		
	
	
	
}
