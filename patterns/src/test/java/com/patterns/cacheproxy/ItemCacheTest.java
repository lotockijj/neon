package com.patterns.cacheproxy;

import java.math.BigDecimal;

import org.junit.Test;

import junit.framework.Assert;

public class ItemCacheTest {

	@Test
	public void testGetItem() {
		Item item = new Item("11101", 11.00, 22.00, "first", new BigDecimal(1000));
		ItemCache cache = new ItemCache(4);
		cache.addItem(item);
		Assert.assertEquals("11101", cache.getItem("11101").getBarCode());
		Item item2 = new Item("22202", 33, 44, "second", new BigDecimal(2000));
		cache.addItem(item2);
		Assert.assertEquals("22202", cache.getItem("22202").getBarCode());
	}

}
