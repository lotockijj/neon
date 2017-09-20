package com.patterns.virtualproxy;

import org.junit.Test;

import junit.framework.Assert;

public class SomethingTest {

	@Test
	public void test() {
		Something someJob = new ProxyExpensiveOperation();
		Assert.assertEquals("Operation 1 has created something.", someJob.createProduct_A());
		Assert.assertEquals("Operation 2 has created something.", someJob.createProduct_B());
		Assert.assertEquals("Operation 3 has done some EXPENSIVE job", someJob.createProduct_C());
	}

}
