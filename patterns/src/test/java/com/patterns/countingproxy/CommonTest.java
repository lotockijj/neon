package com.patterns.countingproxy;

import org.junit.Test;

public class CommonTest {

	@Test
	public void test() {
		Common order = new ProxyOrder();
		order.getAllOrders();
		order.getAllOrders();
		order.getAllOrders();
	}

}
