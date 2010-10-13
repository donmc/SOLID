package com.fixit;

public class LineItem {
	private int quantity;
	private Part part;
	
	public LineItem(Part part, int quantity) {
		this.part = part;
		this.quantity = quantity;
	}

	public Part getPart() {
		return part;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
