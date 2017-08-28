package com.thoughtworks.seminar;

import java.util.ArrayList;
import java.util.List;


public class Session {
	private String sessionName;
	private int sessionId;
	private String sessionSpeaker;
	private Room room;
	private List<RegisteredUser> regsteredUserList;
	
	public Session()
	{
		regsteredUserList=new ArrayList<RegisteredUser>();
	}
	
	public Session(int sessionId,String sessionName,Room room)
	{
		this.sessionId=sessionId;
		this.sessionName=sessionName;
		this.room=room;
		regsteredUserList=new ArrayList<RegisteredUser>();
	}
	public String getSessionName() {
		return sessionName;
	}
	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}
	public int getSessionId() {
		return sessionId;
	}
	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}
	public String getSessionSpeaker() {
		return sessionSpeaker;
	}
	public void setSessionSpeaker(String sessionSpeaker) {
		this.sessionSpeaker = sessionSpeaker;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public List<RegisteredUser> getRegsteredUserList() {
		return regsteredUserList;
	}
	public void setRegsteredUserList(List<RegisteredUser> regsteredUserList) {
		this.regsteredUserList = regsteredUserList;
	}
	public boolean isAvailable()
	{
		boolean isAvailable=false;
		
		//check if the room is available
		isAvailable=room.isAvailable();
		return isAvailable;
	}
	public void addUser(User user)
	{
		regsteredUserList.add((RegisteredUser) user);
		room.occupySeat();
		
	}
	public void removeUser(User user)
	{
		regsteredUserList.remove(user);
		room.freeSeat();
	}
	public void printDetails()
	{
		System.out.println("##################Session Details##################");
		System.out.println("Session Name: "+sessionName+" , Id: "+sessionId+" , Speaker: "+sessionSpeaker);
		System.out.println("###################################################");
		
		
		//printing user details
		System.out.println("Registered User Details");
		System.out.println("###################################################");
		for(User user:regsteredUserList)
		{
			user.printDetails();
			System.out.println("###################################################");
		}
		
		//printing room details
		System.out.println("Room Details");
		System.out.println("###################################################");
		room.printDetails();
		System.out.println("###################################################");
	}
	
	

}
