package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.entity.Meetings;

import com.example.repository.MeetingRepository;

@Service
public class MeetingService {


	@Autowired
	MeetingRepository mr;
	
	public void save(Meetings e){
		mr.save(e);
	}

	public List<Meetings> findAll() {
		return (List<Meetings>) mr.findAll();
	}

	public Meetings findMeetingsById(Long id) {
		// TODO Auto-generated method stub
		return mr.findMeetingsById(id);
	
	}

	public void delete(Meetings findMeetingsById) {
		// TODO Auto-generated method stub
		mr.delete(findMeetingsById);
	}
	
	
	
	
}
