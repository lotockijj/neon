package com.patterns.guardedsuspension;

import org.junit.Before;
import org.junit.Test;

public class ParkingLotTest {
	private ParkingLot parkingLot;
	@Before
	public void setUp() throws Exception {
		parkingLot = new ParkingLot();
	}

	@Test
	public void test() {
		new Member(parkingLot, "first");
		new Member(parkingLot, "second");
		new Member(parkingLot, "third");
		new Member(parkingLot, "fourth");
		new Member(parkingLot, "fifth");
		new Member(parkingLot, "sixth");
	}

}
