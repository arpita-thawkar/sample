package com.faculty.management.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.faculty.management.entity.Faculty;

@Repository
public class FacultyDao {
	
	@Autowired
	SessionFactory factory;

	public void insertAllRecord(Faculty faculty) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
	     session.save(faculty);
	     transaction.commit();
		
	}
	
	
	
	

}
