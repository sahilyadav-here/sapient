package com.sahil.meetingservice;

import java.util.ArrayList;


public class allMeeting {
	
	ArrayList<Meeting> list = new ArrayList<Meeting>();
	
	public allMeeting() {
	list.add(new Meeting(1,"topic1","1200","1500"));
	list.add(new Meeting(2,"topic2","1500","1800"));
	list.add(new Meeting(3,"topic3","0900","1200"));
	list.add(new Meeting(4,"topic4","1800","2200"));
	list.add(new Meeting(5,"topic5","2200","2300"));
	}
	
	public ArrayList<Meeting> getAllMeetings(){
		return list;
	}
	
	public Meeting getMeetingById(int id) {
		// TODO Auto-generated method stub
		for(Meeting m : list) {
			if(m.getMeetingId() == id) {
				return m;
			}
		}
		return new Meeting(0,"no meeting","-","-");
	}

}
