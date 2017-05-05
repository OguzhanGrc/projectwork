package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeService {

	
	@Autowired
	EmployeeRepository er;
	
	public void save(Employee e){
		er.save(e);
	}

	public List<Employee> findAll() {
		return (List<Employee>) er.findAll();
	}

	public Employee findEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return er.findEmployeeById(id);
	
	}

	public void delete(Employee findEmployeeById) {
		// TODO Auto-generated method stub
		er.delete(findEmployeeById);
	}
	
}
