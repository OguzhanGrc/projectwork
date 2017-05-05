package com.example.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

 @Entity
 @Table(name="Meetings")
 public class Meetings {

	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE ,generator="seq_meetings_id")
	@SequenceGenerator(sequenceName="seq_meetings_id",name="seq_meetings_id",initialValue=100,allocationSize=1)
	private int id;
	
	@Column(name="NAME",length=100)
	private String name;
	
	@Column(name="DESCRIPTION",length=100)
	private String description;
	
	
	@ManyToOne
	private Department departments;

	//getters and setters // 

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
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Department getDepartments() {
		return departments;
	}


	public void setDepartments(Department departments) {
		this.departments = departments;
	}


	
	
	
	// getters and setters sonu // 


	
}
