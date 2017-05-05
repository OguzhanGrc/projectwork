package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Department;
import com.example.entity.Employee;
import com.example.repository.DepartmentRepository;


@Service
public class DepartmentService {

	
	@Autowired
	DepartmentRepository dr;
	
	
	
	  public void save(Department department){
		
		dr.save(department);
		
	  }
	
	
      public List<Department> findAll() {
		
		  return (List<Department>) dr.findAll();
	
	   }
      
	
	  public Department findDepartmentById(Long id) {
			
		 // TODO Auto-generated method stub
		  
		   return dr.findDepartmentById(id);
		
	 }
}
