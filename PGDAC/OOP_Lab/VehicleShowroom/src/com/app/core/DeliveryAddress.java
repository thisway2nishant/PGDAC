package com.app.core;

public class DeliveryAddress {
	//data members
	private String houseNo;
	private String street;
	private String distt;
	private String state;
	
	//constructor
	public DeliveryAddress(String houseNo, String street, String distt, String state) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		this.distt = distt;
		this.state = state;
	}

	@Override
	public String toString() {
		return "DeliveryAddress [houseNo=" + houseNo + ", street=" + street + ", distt=" + distt + ", state=" + state
				+ "]";
	}
	
	
	
	
}
