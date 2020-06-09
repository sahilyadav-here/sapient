package com.sahil.meetingservice;

public class Participants {
	private int pId;
	private String pname;
	private int MeetingId;
	
	public Participants() {
		
	}
	
	public Participants(int pId, String pname, int meetingId) {
		super();
		this.pId = pId;
		this.pname = pname;
		this.MeetingId = meetingId;
	}
	public int getpId() {
		return pId;
	}
	public String getPname() {
		return pname;
	}
	public int getMeetingId() {
		return MeetingId;
	}
}
