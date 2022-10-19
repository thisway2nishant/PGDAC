package com.cdac.geometry;

public class Point2D {
	//Static
	
	//Data Members
	private double x;
	private double y;
	
	//Constructors
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	//Methods
	@Override
	public String toString() {
		return this.x+","+this.y;
	}
	
	public boolean isEqual(Point2D p) {
		boolean flag = false;
		if(this.x == p.x && this.y == p.y) {
			flag = true;
		}
		return flag;
	}
	
	public double calculateDistance(Point2D p) {
		double distance;
		double xDiffSq = Math.pow((this.x-p.x), 2);
		double yDiffSq = Math.pow((this.y-p.y), 2);
		distance = Math.pow((xDiffSq+yDiffSq), 1/2);
		return distance;
	}
	
	//Getters and Setters
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	
}
