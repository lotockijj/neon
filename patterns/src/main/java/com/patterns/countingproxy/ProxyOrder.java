package com.patterns.countingproxy;

public class ProxyOrder implements Common {
	private int counter = 0;
	
	@Override
	public int getAllOrders() {
		Order order = new Order();
		order.getAllOrders();
		counter++;
		System.out.println("Counter is: " + counter);
		return counter;
	}

}
