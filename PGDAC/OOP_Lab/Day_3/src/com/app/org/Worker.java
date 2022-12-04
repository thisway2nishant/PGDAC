package com.app.org;

public class Worker extends Emp{
	//data members
	private double hoursWorked;
	private double hourlyRate;
	
	//constructor
	public Worker(String firstName, String lastName, int deptId, double basicSal, double hoursWorked, double hourlyRate) {
		super(firstName, lastName, deptId, basicSal);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	//methods
	
	@Override
	public String toString() {
		return super.toString()+ "Hours Worked: "+hoursWorked+" Hourly Rate: "+hourlyRate;
	}
	
	public double calcSal() {
		return this.getBasicSal()+(hoursWorked * hourlyRate);
	}
	
	//getter and setter
	public double getHourlyRate() {
		return hourlyRate;
	}
}
