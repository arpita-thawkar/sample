package com.faculty.management.controller;



import java.security.Provider.Service;
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


import com.faculty.management.entity.ClassRoom;
import com.faculty.management.service.ClassRoomService;

@RestController
@RequestMapping("/api/classroom")
public class ClassRoomController {

	@Autowired
    private ClassRoomService service;
	
	
	@PostMapping("/insertintotable")
    public  void getInsertAllClassrooms(@RequestBody  ClassRoom cla) {
        service.getInsertAllClassrooms(cla);
    }
	
	 @GetMapping("/allclassroom")
	    public List<ClassRoom> getAllClassrooms() {
	        return service.getAllClassrooms();
	    }
	 
	 @GetMapping("/{id}")
	    public ClassRoom getClassroomById(@PathVariable long id) {
	        return service.getClassroomById(id);
	    }
	 
	 @PutMapping("/{id}")
	    public ClassRoom updateClassroom(@PathVariable long id, @RequestBody ClassRoom classroomDetails) {
	        ClassRoom classroom = service.getClassroomById(id);
	        if (classroom != null) {
	            classroom.setName(classroomDetails.getName());
	            service.saveClassRoom(classroom);
	        }
	        return classroom;
	    }
	 
	  @DeleteMapping("/{id}")
	    public String deleteClassroom(@PathVariable long id) 
	  {
	       if(id==0) {
	    	   return "no id found for deleting";
	       }else {
	    	   service.deleteClassroom(id);
	    	   return "data deleted";
	       }
	
	  }
	
	
}
