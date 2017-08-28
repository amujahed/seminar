package com.thoughtworks.seminar;

public class Room {
	private int roomNo;
	private String roomName;
	private int totalNoOfSeats=0;
	private int noOfSeatsOccupied=0;
	
	public Room(int roomNo,String roomName,int totalNoOfSeats)
	{
		this.roomNo=roomNo;
		this.roomName=roomName;
		this.totalNoOfSeats=totalNoOfSeats;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public int getTotalNoOfSeats() {
		return totalNoOfSeats;
	}
	public void setTotalNoOfSeats(int totalNoOfSeats) {
		this.totalNoOfSeats = totalNoOfSeats;
	}
	public int getNoOfSeatsOccupied() {
		return noOfSeatsOccupied;
	}
	public void setNoOfSeatsOccupied(int noOfSeatsOccupied) {
		this.noOfSeatsOccupied = noOfSeatsOccupied;
	}
	public int getNoOfSeatsAvailable()
	{
		return totalNoOfSeats-noOfSeatsOccupied;
	}
	public boolean isAvailable()
	{
		return (totalNoOfSeats-noOfSeatsOccupied >0);	
	}
	public void occupySeat()
	{
		noOfSeatsOccupied++;
	}
	public void freeSeat()
	{
		noOfSeatsOccupied--;
	}
	
	public void printDetails()
	{
		System.out.println("Room no: "+roomNo+" RoomName: "+roomName);
		System.out.println("Total No of seats: "+totalNoOfSeats+" No of seats available : "+getNoOfSeatsAvailable());
	}
}
