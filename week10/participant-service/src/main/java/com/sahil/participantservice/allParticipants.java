package com.sahil.participantservice;

import java.util.ArrayList;


public class allParticipants {
	
	ArrayList<Participants> list = new ArrayList<Participants>();
	
	public allParticipants() {
		list.add(new Participants(100,"sahil",1));
		list.add(new Participants(101,"rajat",1));
		list.add(new Participants(102,"yash",2));
		list.add(new Participants(103,"rohan",3));
		list.add(new Participants(104,"faiz",4));
		}
	
	
	public ArrayList<Participants> getAllparticipants(){
		return list;
	}
	
	public Participants getParticipantById(int id) {
		for(Participants p : list) {
			if(p.getpId() == id) {
				return p;
			}
		}
		return new Participants(0,"-",0);
	}
	
	public ArrayList<Participants> getParticipantByMeetingId(int id) {
		ArrayList<Participants> plist = new ArrayList<Participants>();
		for(Participants p : list) {
			if(p.getMeetingId() == id) {
				plist.add(p);
			}
		}
		return plist;
	}

}
