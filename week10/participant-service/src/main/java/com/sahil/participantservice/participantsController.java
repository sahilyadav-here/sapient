package com.sahil.participantservice;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class participantsController {
	
	@GetMapping("/participants")
	public ArrayList<Participants> allParticipants() {
		ArrayList<Participants> temp = new allParticipants().getAllparticipants();
		return temp;
	}
	
	@GetMapping("/participant/{id}")
	public Participants meetingsForId(@PathVariable int id) {
		return new allParticipants().getParticipantById(id);
	}
	
	@GetMapping("/participants/meeting/{id}")
	public ArrayList<Participants> participantsForMeetingById(@PathVariable int id) {
		return new allParticipants().getParticipantByMeetingId(id);
	}


}
