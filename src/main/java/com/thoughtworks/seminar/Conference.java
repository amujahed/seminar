package com.thoughtworks.seminar;

import java.util.ArrayList;
import java.util.List;

public class Conference {
	private String conferenceName;
	private List<Session> sessionList  ;
	private List<String> registeredUserEmailIdList;
	
	public Conference()
	{
		registeredUserEmailIdList=new ArrayList<String>();
	}
	
	public Conference(String conferenceName)
	{
		this.conferenceName=conferenceName;
		sessionList=new ArrayList<Session>();
		registeredUserEmailIdList=new ArrayList<String>();
		
	}
	public String getConferenceName() {
		return conferenceName;
	}
	public void setConferenceName(String conferenceName) {
		this.conferenceName = conferenceName;
	}
	public List<Session> getSessionList() {
		return sessionList;
	}
	public void setSessionList(List<Session> sessionList) {
		this.sessionList = sessionList;
	}
	public void addSession(Session session)
	{
		sessionList.add(session);
	}
//	public void registerUser(User user,Session session)
//	{
//		if(session.isAvailable())
//		{
//			session.addUser(user);
//			this.addToRegisteredUserEmailIdList(user.getEmailId());
//		}
//		else
//			System.out.println("Session not available");
//	}
	public void addToRegisteredUserEmailIdList(String emailId)
	{
		registeredUserEmailIdList.add(emailId);
	}
	public void removeFromRegisteredUserEmailIdList(String emailId)
	{
		registeredUserEmailIdList.remove(emailId);
	}
	public boolean isUserAlreadyRegistered(User user)
	{
		boolean isRegistered=false;
		if(registeredUserEmailIdList.contains(user.getEmailId()))
			isRegistered=true;
		return isRegistered;
	}
	public List<Session> getAvailableSessionList()
	{
		List<Session> availableSessionList=new ArrayList<Session>();
		for(Session session:sessionList)
		{
			if(session.isAvailable())
				availableSessionList.add(session);
		}
		return availableSessionList;
	}
	
	public void printDetails()
	{
		
		System.out.println("################Conference Details#################");
		System.out.println("Conference Name:"+conferenceName);
		System.out.println("###################################################");
		//print session details
		
		for(Session session:sessionList)
		{
			session.printDetails();
		}
		System.out.println("###################################################");
	}

}
