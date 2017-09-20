package com.softserve.point;

import java.util.ArrayList;
import java.util.List;

public class PointSet {
	List<Point3D> points;

	public PointSet(){
		points = new ArrayList<>();
	}

	public void addPoint(Point3D p){
		points.add(p);
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for(Point3D p : points){
			sb.append(p.toString());
		}
		return sb.toString();
	}

	public double distance(){
		double result = 0;
		Point3D currentPoint = points.get(0);
		for (int i = 1; i < points.size(); i++) {
			Point3D nextPoint = points.get(i);
			result += nextPoint.distanceTo(currentPoint);
			currentPoint = nextPoint;
		}
		return result;
	}

	public void move(){
		Point3D originPoint = new Point3D();
		Point3D firstPoint = points.get(0);
		for (int i = 1; i < points.size(); i++) {
			Point3D currentPoint = points.get(i);
			if(currentPoint.distanceTo(originPoint) < 5){
				currentPoint.moveTo(firstPoint);
			}
		}
	}
}
