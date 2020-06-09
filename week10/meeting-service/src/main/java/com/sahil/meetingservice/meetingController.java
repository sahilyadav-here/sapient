package com.sahil.meetingservice;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class meetingController {
	
	@Autowired
	private ParticipantServiceProxy proxy;

	@GetMapping("/meeting")
	public ArrayList<Meeting> allMeeting() {
		ArrayList<Meeting> temp = new allMeeting().getAllMeetings();
		return temp;
	}
	
	@GetMapping("/meeting/{id}")
	public Meeting meetingsForId(@PathVariable int id) {
		return new allMeeting().getMeetingById(id);
	}
	
//	@GetMapping("/meeting/{id}/participants/normal")
//	public ArrayList<Participants> getAllParticipantsNormal(@PathVariable int id) {
//
//		ResponseEntity<JsonNode> responseEntity = new RestTemplate().getForEntity(
//				"http://localhost:8080/participants",JsonNode.class);
//		
//		ObjectMapper mapper = new ObjectMapper();
//		ArrayList<Participants> participantList = mapper.convertValue(responseEntity, 
//				new TypeReference<ArrayList<Participants>>(){});
//
//		
//		ArrayList<Participants> output = new ArrayList<Participants>();
//		for(int i =0;i<participantList.size();i++) {
//			if(participantList.get(i).getMeetingId() == id) {
//				output.add(participantList.get(i));
//			}
//		}
//
//		return output;
//	}
	
	@GetMapping("/meeting/{id}/participants")
	public ArrayList<Participants> getAllParticipants(@PathVariable int id) {
		
		ArrayList<Participants> response = proxy.allParticipants();
		ArrayList<Participants> output = new ArrayList<Participants>();
		for(Participants p : response) {
			if(p.getMeetingId() == id) {
				output.add(p);
			}
		}
		return output;
	}
	
	@GetMapping("/meeting/{id}/participants/try")
	public ArrayList<Participants> getAllParticipantsTry(@PathVariable int id) {
		ArrayList<Participants> response = proxy.participantsForMeetingById(id);
		return response;
	}
	
}
