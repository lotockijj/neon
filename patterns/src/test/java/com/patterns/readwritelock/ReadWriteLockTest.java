package com.patterns.readwritelock;

import org.junit.Before;
import org.junit.Test;

public class ReadWriteLockTest {
	private Item item;
	
	@Before
	public void setUp() throws Exception {
		item = new Item("CompScience-I");
	}

	@Test
	public void test() {
		new MemberTransaction("Member1", item, "StatusCheck");
		new MemberTransaction("Member2", item, "StatusCheck");
		new MemberTransaction("Member3", item, "CheckOut");
		new MemberTransaction("Member4", item, "CheckOut");
		new MemberTransaction("Member5", item, "CheckOut");
		new MemberTransaction("Member6", item, "StatusCheck");
	}

}
