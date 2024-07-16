package com.faculty.management.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faculty.management.dao.CourseDao;
import com.faculty.management.entity.Course;

@Service
public class CourseService {
     @Autowired
	CourseDao dao;
	
	public void saveCourse(Course course) {

		dao.createCourse(course);
	}

	public List<Course> getAllCourses() {
		
		
		 List<Course> c1=dao.createCourse();
		
		return  c1;
	}

	public Course getCourseById(int id) {
	
		
		return dao.getCourseByID(id);
	}

	public void deleteCourse(int id) {
		dao.deleteCourse(id);
		
	}

}
 