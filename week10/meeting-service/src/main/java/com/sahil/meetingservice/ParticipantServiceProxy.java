package com.sahil.meetingservice;

import java.util.ArrayList;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="participant-service", url="localhost:8080")
public interface ParticipantServiceProxy {
	
	
	@GetMapping("/participants/meeting/{id}")
	public ArrayList<Participants> participantsForMeetingById(@PathVariable int id);
	
	@GetMapping("/participants")
	public ArrayList<Participants> allParticipants();
}
