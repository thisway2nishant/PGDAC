package com.app.org;

public abstract class Emp {
	//Statics
	private static int id = 100;
	
	//Data Members
	private int empid;
	private String firstName;
	private String lastName;
	private int deptId;
	private double basicSal;
	
	//constructors
	public Emp(String firstName, String lastName, int deptId, double basicSal) {
		super();
		this.empid = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.deptId = deptId;
		this.basicSal = basicSal;
		id++;
	}
	
	//methods
	@Override
	public String toString() {
		return "Empid: "+empid+" Name: "+firstName+" "+lastName+" DeptId: "+deptId;
	}
	public abstract double calcSal();
	
	//getters and setters
	public double getBasicSal() {
		return basicSal;
	}
	
	public int getEmpid() {
		return empid;
	}
	
	public void setBasicSal(double salary) {
		this.basicSal = salary;
	}
}
