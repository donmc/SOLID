package com.fixit;

import java.util.ArrayList;
import java.util.List;

public class ServiceOrder {
	
	private List<Part> parts;

	public ServiceOrder() {
		parts = new ArrayList<Part>();
	}
	
	public void addPart(Part part) {
		parts.add(part);
	}
	
	public double total() {
		double total = 0;
		
		for (Part part : parts) {
			total += part.getPrice();
		}
		
		return total;
	}
}
