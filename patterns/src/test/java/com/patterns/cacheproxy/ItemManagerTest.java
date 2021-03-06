package com.patterns.cacheproxy;

import java.math.BigDecimal;

import org.junit.Test;

public class ItemManagerTest {

	@Test
	public void testActivate() {
		ItemCache cache = new ItemCache(3);
		Item item = new Item("11101", 11.00, 11.00, "first", new BigDecimal(1000));
		Item item2 = new Item("22202", 22, 22, "second", new BigDecimal(2000));
		Item item3 = new Item("33303", 33, 33, "third", new BigDecimal(3000));
		Item item4 = new Item("44404", 44, 44, "fourth", new BigDecimal(4000));
		Item item5 = new Item("55505", 55, 55, "fifth", new BigDecimal(5000));
		Item item6 = new Item("66606", 66, 66, "sixth", new BigDecimal(6000));
		
		ItemManager manager = new ItemManager();
		manager.setCache(cache);
		manager.activate(item);
		manager.activate(item2);
		manager.activate(item);
		manager.activate(item3);
		manager.activate(item4);
		manager.activate(item3);
		manager.activate(item3);
		manager.activate(item4);
		manager.activate(item4);
		manager.activate(item5);
		manager.activate(item6);
		System.out.println("Size: " + cache.getCache().size());
		cache.printFrequency();
		cache.printCache();
	}

}
