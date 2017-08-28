package com.thoughtworks.seminar;

public class User {
	private String firstName;
	private String lastName;
	private String emailId;

	public User()
	{
		
	}
	public User(String firstName,String lastName,String emailId)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.emailId=emailId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void printDetails()
	{
		System.out.println("User Name: "+firstName+" "+lastName+" Email Id :"+ emailId);
	}
}
