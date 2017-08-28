package com.thoughtworks.seminar;

public class RegisteredUser extends User{

	private int registrationId;
	private int sessionId;
	
	public RegisteredUser()
	{
		super();
	}
	public RegisteredUser(String firstName, String lastName, String emailId) {
		super(firstName, lastName, emailId);
		// TODO Auto-generated constructor stub
	}
	public int getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}
	public int getSessionId() {
		return sessionId;
	}
	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}
	
	public void unregister(Conference conf,Session session)
	{
		session.removeUser(this);
		conf.removeFromRegisteredUserEmailIdList(getEmailId());
		
	}
	public void register(Conference conf,Session session)
	{
		if(session.isAvailable())
		{
			session.addUser(this);
			this.setSessionId(session.getSessionId());
			conf.addToRegisteredUserEmailIdList(getEmailId());
			System.out.println("User "+getFirstName()+" "+getLastName()+"( "+getEmailId()+")" +
					"has been registered for Session: "+session.getSessionName()+" in the Conference: "+conf.getConferenceName());
		}
	}

}
