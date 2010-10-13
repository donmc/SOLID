package com.fixit;

public class Labor extends Item {

	private double price;

	public Labor(String name, double price) {
		super(name);
		this.price = price;
	}

	@Override
	public double calculatePrice() {
		return price;
	}
}
