package com.fixit;

public class Part {

	private double wholesalePrice;
	private int    markupPercentage;
	private String name;
	
	public Part(String name, double price) {
		this(name, price, 0);
	}
	public Part(String name, double price, int markup) {
		this.name = name;
		this.wholesalePrice = price;
		this.markupPercentage = markup;
	}

	public double getWholesalePrice() {
		return this.wholesalePrice;
	}
	
	public int getMarkupPercentage() {
		return markupPercentage;
	}

	public String getName() {
		return name;
	}
}
