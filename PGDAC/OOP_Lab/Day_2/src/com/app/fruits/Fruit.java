package com.app.fruits;

public class Fruit {
	// static

	// Data Members
	private String name;
	private String color;
	private double weight;
	private boolean fresh;

	// Constructor
	public Fruit(String name, String color, double weight) {
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.fresh = true;
	}

	// methods
	@Override
	public String toString() {
		return "Name: " + this.name + " Color: " + this.color + " Weight: " + this.weight;
	}

	public String taste() {
		return "No Specific Taste.";
	}

	// Getters and Setters
	public boolean getFresh() {
		return fresh;
	}
	
	public void setFresh(boolean n) {
		this.fresh = n;
	}
	
	public String getName() {
		return this.name;
	}
}
