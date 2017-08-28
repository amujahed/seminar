package com.thoughtworks.seminar;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        beginConference();
    }
    public static void beginConference()
    {
    	int noOfRooms=5;
    	Room[] rooms=new Room[noOfRooms];
    	Session[] sessions=new Session[noOfRooms];
    	
    	Conference conf=new Conference("Tech World");
    	
    	//adding sessions to the conference
    	for(int i=0;i<noOfRooms;i++)
    	{
    		rooms[i]=new Room(i+1,"Room "+(i+1),10*(i+1));
    		//allotting room to the session
    		sessions[i]=new Session(i+1,"Session "+(i+1),rooms[i]);
    		conf.addSession(sessions[i]);
    		
    	}
    	
    	//adding user
    	User user1=new RegisteredUser("John","Wright","john.wright@abc.com");
    	User user3=new RegisteredUser("John","Wright","john.wright@abc.com");
    	User user2=new RegisteredUser("Tom","Hudson","tom.son@xyz.com");

    	List<User> userList=new ArrayList<User>();
    	userList.add(user1);
    	userList.add(user2);
    	userList.add(user3);

    	//registering user to conference
    	for(User user:userList)
    	{
    	
    	if(!conf.isUserAlreadyRegistered(user))
    	{
    		((RegisteredUser)user).register(conf, sessions[0]);
    	}
    	else
    		System.out.println("Email Id "+user.getEmailId()+" is already registered!!!");
    	}

    	conf.printDetails();
    	//System.out.println("Room has no of seats occupied " +rooms[0].getNoOfSeatsOccupied());
    	
    	//unregistering user
    	//((RegisteredUser)user1).unregister(conf,sessions[0]);
    		
    	
    }
    
}
