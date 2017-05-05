package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="Employee")
public class Employee {

	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE ,generator="seq_employee_id")
	@SequenceGenerator(sequenceName="seq_employee_id",name="seq_employee_id",initialValue=100,allocationSize=1)
	private Long id;
	
	
	@Column(name="NAME",length=100)
	private String name;
	
	
	@Column(name="SURNAME",length=100)
	private String surname;
	
	
	@Column(name="SALARY",length=100)
	private int Salary;


    
	@ManyToOne
	private Department department;
	
	
	//getters and setters //


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public int getSalary() {
		return Salary;
	}


	public void setSalary(int salary) {
		Salary = salary;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	




   
   // getters and setters sonu //
}
