package com.patterns.guardedsuspension;

public class ParkingLot {
	public static final int MAX_CAPACITY = 4;
	private int totalParkedCars = 0;
	
	public synchronized void park(String member){
		while(totalParkedCars >= MAX_CAPACITY){
			System.out.println("The parking lot is full " + member + 
					" has to wait. ");
			try{
				wait();
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println(member + " has parked. ");
		totalParkedCars++;
	}
	
	public synchronized void leave(String member){
		totalParkedCars--;
		System.out.println(member +	" has left, notify a waiting member");
		notify();
	}
}
