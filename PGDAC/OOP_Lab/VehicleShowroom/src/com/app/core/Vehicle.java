package com.app.core;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicle {
	//Statics
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	
	//data members
	private String chasisno;
	private String name;
	private String cmpnyname;
	private Date mfd;
	private Colors color;
	private DeliveryAddress delivery;
	
	//constructor
	public Vehicle(String chasisno, String name, String cmpnyname, Date mfd,String color) throws ParseException {
		super();
		this.chasisno = chasisno;
		this.name = name;
		this.cmpnyname = cmpnyname;
		this.mfd = mfd;
		this.color = Colors.valueOf(color.toUpperCase());
	}
	
	//getters and setters
	
	//methods
	@Override
	public String toString() {
		return "Vehicle [chasisno=" + chasisno + ", name=" + name + ", cmpnyname=" + cmpnyname + ", mfd=" + sdf.format(mfd)
				+ ", color=" + color + "]";
	}
}
