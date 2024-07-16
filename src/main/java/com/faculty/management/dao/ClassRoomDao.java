package com.faculty.management.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.faculty.management.entity.ClassRoom;

@Repository
public class ClassRoomDao {

	@Autowired
	SessionFactory factory;
	
	
	public  void getInsertAllRecord(ClassRoom cla)
	{
	   Session session=factory.openSession();
	     Transaction transaction=session.beginTransaction();
	     session.save(cla);
	     transaction.commit();
	     
	}


	public List<ClassRoom> getAllRecordFromClassRoom() {
		
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(ClassRoom.class);
		List<ClassRoom> clist=criteria.list();
		return clist;
	} 
	
	public ClassRoom getClassroomById(long id)
	{
		Session session=factory.openSession();
		ClassRoom clist=session.get(ClassRoom.class, id);
		return clist;
		
	}


	public void saveClassRoom(ClassRoom classroom) 
	{
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(classroom);
		transaction.commit();
		
		
	}


	public ClassRoom deleteClassroom(long id) {
		Session session=factory.openSession();
		Transaction transaction = session.beginTransaction();
		ClassRoom cls=session.load(ClassRoom.class,id);
		session.delete(cls);
		transaction.commit();
		 return cls;
		
	}
	
	
	 

}
