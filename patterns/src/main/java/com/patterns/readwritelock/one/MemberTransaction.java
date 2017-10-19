package com.patterns.readwritelock.one;

public class MemberTransaction extends Thread{
	private String name;
	private Seat seat;
	private String operation;
	
	public MemberTransaction(String name, Seat seat, String operation) {
		this.name = name;
		this.seat = seat;
		this.operation = operation;
		start();
	}
	
	public void run(){
		seat.getStatus(name);
		if(operation.equals("Reserved")){
			System.out.println("\n" + name + " is ready to reserve the item. ");
			seat.checkOut(name);
			try{
				sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			seat.checkIn(name);
		}
	}
	
	
}
