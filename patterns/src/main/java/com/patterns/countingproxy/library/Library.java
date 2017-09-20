package com.patterns.countingproxy.library;

public class Library implements Attendance {
	private Attendance[] items;
	
	private int counter = 0;

	public Library(Attendance[] items) {
		this.items = items;
	}

	@Override
	public int getNumberCheckedItems() {
		counter = 0;
		for (int i = 0; i < items.length; i++) {
			counter += items[i].getNumberCheckedItems();
		}
		return counter;
	}

	@Override
	public void checked() {
	}

}
