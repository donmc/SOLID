package com.fixit;

import java.util.HashMap;
import java.util.Map;

public class ServiceOrder {
	
	private Map<Part, Integer> parts;

	public ServiceOrder() {
		parts = new HashMap<Part, Integer>();
	}
	
	public void addPart(Part part) {
		addPart(part, 1);
	}

	public void addPart(Part part, int quantity) {
		
		if (parts.containsKey(part)) {
			quantity += parts.get(part);
		}
		
		parts.put(part, quantity);
	}
	
	public double total() {
		double total = 0;
		
		for (Part part : parts.keySet()) {
			int quantity = parts.get(part);
			total += part.getPrice() * quantity;
		}
		
		return total;
	}
}
