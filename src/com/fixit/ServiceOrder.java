package com.fixit;

import java.util.ArrayList;
import java.util.List;

public class ServiceOrder {
	
	private List<LineItem> partLineItems;

	public ServiceOrder() {
		partLineItems = new ArrayList<LineItem>();
	}
	
	public void addPart(Part part) {
		addPart(part, 1);
	}

	public void addPart(Part part, int quantity) {
		LineItem lineItem = new LineItem(part, quantity);
		
		partLineItems.add(lineItem);
	}
	
	public double total() {
		double total = 0;
		
		for (LineItem lineItem : partLineItems) {
			total += lineItem.getPart().getPrice() * lineItem.getQuantity();
		}
		
		return total;
	}
}
