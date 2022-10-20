package com.app.fruits;

public class Apple extends Fruit {
	//static
	
	//data members
	
	
	//constructors
	public Apple(String name, String color, double weight) {
		super(name, color, weight);

	}
	
	//methods
	@Override
	public String taste() {
		return "Sweet and Sour";
	}
	
	public void jam() {
		System.out.println(" Making Jam");
	}
	
	//getters and setters
}
