package com.patterns.guardedsuspension;

public class Member extends Thread {
	private ParkingLot parkingLot;
	private String name;

	public Member(ParkingLot parkingLot, String name) {
		this.parkingLot = parkingLot;
		this.name = name;
		start();
	}
	
	public void run(){
		System.out.println(name + " is ready to park.");
		parkingLot.park(name);
		try{
			sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		parkingLot.leave(name);
	}
	

}
