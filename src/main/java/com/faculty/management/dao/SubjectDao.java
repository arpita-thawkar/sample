package com.faculty.management.dao;

import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.faculty.management.entity.Subject;
import com.mysql.cj.xdevapi.Schema.CreateCollectionOptions;


@Repository
public class SubjectDao {
	@Autowired
	SessionFactory sessionFactory;

	public List<Subject> getAllSubject() {
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Subject.class);
		 List<Subject> slist=criteria.list();
		return slist;
	}

	public void SaveSubject(Subject  subject) {
		Session session=sessionFactory.openSession();
	 Transaction transaction=session.beginTransaction();
	 session.save(subject);
	 transaction.commit();
		
		
	}

	public Subject getSubjectById( int id) {
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Subject.class);
	Subject	sub=session.load(Subject.class, id);
		
		
		return sub;
	}

	public void deletesubject(int id) {
		
		Session session=sessionFactory.openSession();
	
		Transaction transaction=session.beginTransaction();
		Subject subject=session.get(Subject.class, id);
		session.delete(subject);
		transaction.commit();
	}
	
	

}
