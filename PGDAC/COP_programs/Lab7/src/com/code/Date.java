package com.code;

public class Date {

	//Data Members
	private int day,month,year;
	
	//Constructors
	public Date() {
		System.out.println("\n Default Constructor");
		day = 11;
		month = 11;
		year = 11;
	}

	public Date(int dd, int mm, int yy) {
		super();
		//System.out.println("\n Parameterised Constructor");
		this.day = dd;
		this.month = mm;
		this.year = yy;
	}
	
	//methods
	
	public void display() {
		System.out.println(""+day+"\\"+month+"\\"+year);
	}
}
