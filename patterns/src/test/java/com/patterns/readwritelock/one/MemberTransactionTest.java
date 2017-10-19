package com.patterns.readwritelock.one;

import org.junit.Before;
import org.junit.Test;

public class MemberTransactionTest {
	private Seat seat;
	private Seat seat2;
	
	@Before
	public void setUp() throws Exception {
		seat = new Seat(1);
		seat2 = new Seat(2);
	}

	@Test
	public void test() {
		new MemberTransaction("First", seat, "free");
		new MemberTransaction("Second", seat, "free");
		new MemberTransaction("Third", seat, "Reserved");
		new MemberTransaction("Fourth", seat, "free");
		new MemberTransaction("Fifth", seat, "free");
		new MemberTransaction("Sixth", seat2, "Reserved");
	}

}
