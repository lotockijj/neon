package com.softserve.next;

public class Trailer extends Car {
	private static final long serialVersionUID = 1L;
	private int maxCapacity;

	public Trailer(int permissibleSpeed, int minRadius, int maxCapacity) {
		super(permissibleSpeed, minRadius);
		this.maxCapacity = maxCapacity;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	
}
