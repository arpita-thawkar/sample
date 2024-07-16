package com.faculty.management.dao;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.faculty.management.entity.Department;



@Repository
public class DepartmentDao {
	@Autowired
	 private SessionFactory factory; 

	public List<Department> getAllDepartment() {
		Session  session=factory.openSession();
		Criteria criteria=session.createCriteria(Department.class);
		List<Department> clist=criteria.list();
		return clist;
	}

	public void saveDepartment(Department department) {
		Session session=factory.openSession();
		Transaction transaction =session.beginTransaction();
		session.save(department);
		transaction.commit();
		
	}

	public Department getDepartmentNameById(int id) {
		
		Session session =factory.openSession();
		Department department=session.get(Department.class, id);
		return department;
	}

	public Department updateDepartment(Department department) {
		Session session=factory.openSession();
		Transaction  transaction=session.beginTransaction();
		 session.save(department);
		 transaction.commit();
		
		return department ;
	}

	public void deleteDepartment(int id) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Department  department=session.load(Department.class, id);
		session.delete(department);
		transaction.commit();
		
	}
	
	
	 
	    
	

}
