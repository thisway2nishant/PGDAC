package com.app.org;

public class Mgr extends Emp {
	//Data Members
	private double perfBonus;
	
	//constructor
	public Mgr(String firstName, String lastName, int deptId, double basicSal, double perfBonus) {
		super(firstName, lastName, deptId, basicSal);
		this.perfBonus = perfBonus;
	}
	
	//methods
	
	@Override
	public String toString() {
		return super.toString()+ "Perf Bonus: "+perfBonus;
	}
	
	public double calcSal() {
		return this.getBasicSal()+this.perfBonus;
	}
	
	//getter and setter
	public double getPerfBonus() {
		return perfBonus;
	}
}
