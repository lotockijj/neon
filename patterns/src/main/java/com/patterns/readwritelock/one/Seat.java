package com.patterns.readwritelock.one;

import com.patterns.readwritelock.ReadWriteLock;

public class Seat {
	@SuppressWarnings("unused")
	private int numberSeat;
	private ReadWriteLock lock;
	private String status;
	
	public Seat(int numberSeat) {
		this.numberSeat = numberSeat;
		lock = new ReadWriteLock();
		status = "free";
	}
	
	public void checkOut(String member){
		lock.getWriteLock();
		status = "Reserved";
		System.out.println(member + " has been issued a write lock. ");
	}
	
	public String getStatus(String member){
		lock.getReadLock();
		System.out.println(member + " has been issued a read lock");
		return status;
	}
	
	public void checkIn(String member){
		lock.getWriteLock();
		status = "free";
		System.out.println(member + " has been issued a write lock");
		lock.done();
	}

	
}
