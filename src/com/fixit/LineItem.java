package com.fixit;

public class LineItem {
	private int quantity;
	private Item item;
	
	public LineItem(Item item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}

	public Item getItem() {
		return item;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double lineTotal() {
		return item.calculatePrice() * quantity;
	}
}
