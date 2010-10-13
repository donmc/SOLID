package com.fixit;

public class Part extends Item {

	private double wholesalePrice;
	private int    markupPercentage;
	
	public Part(String name, double price) {
		this(name, price, 0);
	}
	public Part(String name, double price, int markup) {
		super(name);
		this.wholesalePrice = price;
		this.markupPercentage = markup;
	}
	
	public double calculatePrice() {
		return wholesalePrice * (markupPercentage/100d +1);
	}

	public double getWholesalePrice() {
		return this.wholesalePrice;
	}
	
	public int getMarkupPercentage() {
		return markupPercentage;
	}
}
