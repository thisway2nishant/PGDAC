package com.app.fruits;

public class Mango extends Fruit {
	//static
	
	//data members
	
	//constructors
	public Mango(String name, String color, double weight) {
		super(name, color, weight);

	}
	
	//methods
	
	@Override
	public String taste() {
		return "Sweet";
	}
	
	public void pulp() {
		System.out.println("creating Pulp");
	}
	
	//getters and setters
}
