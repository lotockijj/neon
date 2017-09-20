package com.patterns.countingproxy.library;

public class Video implements Attendance {
	private int counter = 0;
	
	@Override
	public int getNumberCheckedItems() {
		return counter;
	}

	@Override
	public void checked() {
		counter++;
	}

}
