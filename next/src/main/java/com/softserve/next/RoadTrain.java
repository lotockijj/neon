package com.softserve.next;

public class RoadTrain extends Car {
	private static final long serialVersionUID = 1L;
	private int maxWeight;
	
	public RoadTrain(int permissibleSpeed, int minRadius, int maxWeight) {
		super(permissibleSpeed, minRadius);
		this.maxWeight = maxWeight;
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	
}
