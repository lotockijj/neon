package com.softserve.point;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class Point3DTest {
	private Point3D p1;
	private Point3D p2;
	private Point3D p3;
	private Point3D origin;
	
	@Before
	public void setUp() throws Exception {
		p1 = new Point3D(3, 3, 3);
		p2 = new Point3D(4, 4, 4);
		p3 = new Point3D(5, 5, 5);
		origin = new Point3D();
	}

	@Test
	public void testPoint3DDoubleDoubleDouble() {
		Assert.assertEquals(3.0, p1.getX());
		Assert.assertEquals(3.0, p1.getY());
		Assert.assertEquals(3.0, p1.getZ());
	}

	@Test
	public void testPoint3D() {
		Assert.assertEquals(0.0, origin.getX());
		Assert.assertEquals(0.0, origin.getY());
		Assert.assertEquals(0.0, origin.getZ());
	}

	@Test
	public void testDistanceTo() {
		double distance = p1.distanceTo(p2);
		double round = Math.round(distance*100);
		round = round/100;
		Assert.assertEquals(1.73, round);
	}

	@Test
	public void testToString() {
		System.out.println("Test toString(): \n" + p1 + "\n" + p2 + 
				"\n" + p3 + "\n" + origin );
	}

	@Test
	public void testMoveTo() {
		p1.moveTo(p2);
		Assert.assertEquals(4.0, p1.getX());
	}

}
