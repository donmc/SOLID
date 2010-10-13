package com.fixit;

import java.util.ArrayList;
import java.util.List;

public class ServiceOrder implements Receipt {
	
	List<LineItem> itemLineItems;

	public ServiceOrder() {
		itemLineItems = new ArrayList<LineItem>();
	}
	
	public void addItem(Item item) {
		addItem(item, 1);
	}

	public void addItem(Item item, int quantity) {
		LineItem lineItem = new LineItem(item, quantity);
		
		itemLineItems.add(lineItem);
	}
	
	public double total() {
		double total = 0;
		
		for (LineItem lineItem : itemLineItems) {
			total += lineItem.lineTotal();
		}
		
		return total;
	}
}
