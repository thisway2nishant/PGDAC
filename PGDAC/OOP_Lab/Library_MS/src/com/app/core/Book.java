package com.app.core;

import java.time.LocalDate;

public class Book {
	//Data Members
	private String title;
	private Category category;
	private double price;
	private LocalDate publishDate;
	private String authorName;
	private int quantity;
	
	//constructors
	public Book(String title, Category category, double price, LocalDate publishDate, String authorName, int quantity) {
		super();
		this.title = title;
		this.category = category;
		this.price = price;
		this.publishDate = publishDate;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	
	//methods
	
	//getters and setters
}
