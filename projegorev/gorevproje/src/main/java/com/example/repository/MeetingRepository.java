package com.example.repository;

import org.springframework.data.repository.CrudRepository;


import com.example.entity.Meetings;

public interface MeetingRepository extends CrudRepository<Meetings, Long> {

	Meetings findMeetingsById(Long id);

}
