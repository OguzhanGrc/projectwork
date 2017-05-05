package com.example.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Department")
public class Department {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE ,generator="seq_depatment_id")
	@SequenceGenerator(sequenceName="seq_depatment_id",name="seq_depatment_id",initialValue=100,allocationSize=1)
	private int id;
	
	
	@Column(name="NAME",length=100)
	private String name;
	
	
	@Column(name="DESCRIPTION",length=100)
	private String Description;
	
	
	@OneToMany
	private List<Employee> employees;


	@OneToMany
	private List<Meetings> meetings;
	
		
	// GETTERS AND SETTERS // 
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return Description;
	}


	public void setDescription(String description) {
		Description = description;
	}


	public List<Employee> getEmployees() {
		return employees;
	}


	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}


	public List<Meetings> getMeetings() {
		return meetings;
	}


	public void setMeetings(List<Meetings> meetings) {
		this.meetings = meetings;
	}


	
	
	
	
	// GETTERS AND SETTERS SONU //
	
}
