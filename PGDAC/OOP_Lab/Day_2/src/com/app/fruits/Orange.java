package com.app.fruits;

public class Orange extends Fruit {
	//static
	
	//data members
	
	
	//constructors
	public Orange(String name, String color, double weight) {
		super(name, color, weight);

	}
	
	//methods
	@Override
	public String taste() {
		return "Sour";
	}
	
	public void juice() {
		System.out.println("extracting juice.");
	}
	
	//getters and setters
}
