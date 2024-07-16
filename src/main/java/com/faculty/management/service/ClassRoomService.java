package com.faculty.management.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.faculty.management.dao.ClassRoomDao;
import com.faculty.management.entity.ClassRoom;
@Service
public class ClassRoomService {
      @Autowired
	ClassRoomDao dao;
	
	
	public void getInsertAllClassrooms( ClassRoom cla ) {
		
		dao.getInsertAllRecord(cla) ;
	}


	public List<ClassRoom> getAllClassrooms() {
		
		return dao.getAllRecordFromClassRoom();
	}


	public ClassRoom getClassroomById(long id) {
		 
		 return dao.getClassroomById(id);
	}


	public void saveClassRoom(ClassRoom classroom) 
	{
		 dao.saveClassRoom(classroom);	
	}
   
	public ClassRoom deleteClassroom(long id)
	{
		return dao.deleteClassroom(id);
		
	}
	


}
