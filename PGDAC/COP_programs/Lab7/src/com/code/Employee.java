package com.code;

public class Employee {
	
	//static
	private static double med = 1000;
	private static double pt = 200;
	private static int index = 1000;
	
	//Data Members
	private int id;
	private String name;
	private double baseSal,hra,pf; //hra, pf, pt, netSal, grosSal;
//	private double hra = (baseSal/2);
//	private double pf = (.12 * baseSal);
	
	private double grosSal;
	private double netSal;
	
	//constructor
	public Employee(String name, double baseSal) {
		super();
		this.name = name;
		this.baseSal = baseSal;
		this.id = index;
		this.hra = (baseSal/2);
		this.pf = (.12 * baseSal);
		index++;
	} 
	
	//methods
	
	public double calcGrosSal() {
		this.grosSal = baseSal+hra+med;
		return this.grosSal;
	}
	
	public double calcNetSal() {
		this.netSal = this.grosSal - (pt+pf);
		return this.netSal;
	}
	
	public void display() {
		System.out.println("Name: "+this.name);
		System.out.println("Id: "+this.id);
		System.out.println("Gross Salary: "+this.calcGrosSal());
		System.out.println("Net Salary: "+this.calcNetSal());
	}
	
	}

