package com.faculty.management.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.faculty.management.entity.Course;

@Repository
public class CourseDao {
      @Autowired
	private SessionFactory factory;
	
	public void createCourse(Course course) {
		 Session session=factory.openSession();
		   Transaction transaction=session.beginTransaction();
		   session.save(course);
		     transaction.commit();
		
	}

	public List<Course> createCourse() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Course.class);
		List<Course> clist=criteria.list();
		return clist;
	}

	public Course getCourseByID(int id) {
		Session session=factory.openSession();
		Course course=session.get(Course.class, id);
		return course;
	}

	public void deleteCourse(int id) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Course course=session.load(Course.class, id);
		session.delete(course);
		transaction.commit();
		
	}

	

    
	
}
