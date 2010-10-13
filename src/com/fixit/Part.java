package com.fixit;

public class Part {

	private double price;
	private String name;
	
	public Part(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double getPrice() {
		return this.price;
	}

	public String getName() {
		return name;
	}
}
