package com.softserve.next;

import java.io.Serializable;

/** Create classes Car, Trailer and RoadTrain with methods which return 
 * the permissible speed and minimum turning radius. Give your suggestions 
 * about relations between classes (is-a, has-a, use-a, etc.).
 * Find solution for avoiding of duplicate code. Write well commented code 
 * with examples of using these classes. Write code for reading and writing 
 * collection of these objects from (into) file. Find object with maximum speed.
 * Find object with minimum turning radius. Write code for handling the incorrect 
 * format of incoming file.
 */

public class Car implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int permissibleSpeed;
	private int minRadius;
	
	public Car(int permissibleSpeed, int minRadius) {
		this.permissibleSpeed = permissibleSpeed;
		this.minRadius = minRadius;
	}
	
	@Override
	public String toString() {
		return new StringBuffer("PermissibleSpeed: ").append(this.permissibleSpeed)
				.append(". Minimum radius: ").append(this.minRadius).toString();
	}

	public int getPermissibleSpeed() {
		return permissibleSpeed;
	}

	public void setPermissibleSpeed(int permissibleSpeed) {
		this.permissibleSpeed = permissibleSpeed;
	}

	public int getMinRadius() {
		return minRadius;
	}

	public void setMinRadius(int minRadius) {
		this.minRadius = minRadius;
	}
	
}
