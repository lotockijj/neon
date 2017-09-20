package com.softserve.point;

/** Create class Point3D to represent a point in 3-D space with coordinates x, y and z.
 *  Define properties for each field and following methods: distanceTo() - for calculating 
 *  the distance to another point; toString(), which returns a string similar 
 *  to “(2,-7,0)"; moveTo(Point3D point), which should change the coordinates of point 
 *  to the given; Create a class PointsSet which consists of field "points" 
 *  (container of Point3D objects). In this class define method addPoint() for adding 
 *  point to container; method toString() for converting  points to user friendly string;
 *  method distance(), which calculates the sum of distances between all points 
 *  (from first to the last); method move(), which should move all points from container, 
 *  which are inside the ball of radius 5 and center in origin, to the first point 
 *  in container. Write short code to demonstrate your solution. Your code should 
 *  include class (interface) aggregation or inheritance, should use collections or 
 *  generics, should implement exception handling.
 */

public class Point3D{
	private double x;
	private double y;
	private double z;

	public Point3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Point3D(){
		this(0, 0, 0);
	}

	public double distanceTo(Point3D p){
		return Math.sqrt(Math.pow(x - p.getX(), 2) + 
				Math.pow(y - p.getY(), 2) + 
				Math.pow(z - p.getZ(), 2));
	}
	
	@Override
	public String toString() {
		return "(" + x + "," + y + "," + z + ")";
	}
	
	public void moveTo(Point3D p){
		setX(p.getX());
		setY(p.getY());
		setZ(p.getZ());
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}


}
