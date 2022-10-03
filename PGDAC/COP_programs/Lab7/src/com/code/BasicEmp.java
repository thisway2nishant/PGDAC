package com.code;

import com.code.Date;

public class BasicEmp {
	//static
	private static int index = 100;
	private static int counter = 0;
	
	
	//Data Members
	private int id;
	private String name;
	private Date dob;
	
	//Constructors
	public BasicEmp(String name, Date dob) {
		super();
		this.name = name;
		this.dob = dob;
		this.id = index;
		index++;
		counter++;
	}
	

	//Methods
	public void display() {
		System.out.println("Name: "+this.name);
		System.out.println("Id: "+this.id);
		System.out.println("DoB: ");
		this.dob.display();
	}
	
	//Getters and Setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getId() {
		return id;
	}
	
}
