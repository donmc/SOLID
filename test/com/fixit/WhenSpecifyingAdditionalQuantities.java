package com.fixit;

import static org.junit.Assert.*;

import org.junit.Test;



public class WhenSpecifyingAdditionalQuantities {

	@Test
	public void shouldCalculateTotalAccordingly() {
		ServiceOrder order = new ServiceOrder();
		order.addPart(new Part("Piston", 299.99), 3);
		
		double total = order.total();
		
		assertEquals(899.97, total, 0.01);
	}

	@Test
	public void shouldCalculateTotalWhenAddingTheSamePartTwice() {
		ServiceOrder order = new ServiceOrder();
		
		Part part = new Part("Piston", 299.99);
		
		order.addPart(part, 3);
		order.addPart(part, 2);
		
		double total = order.total();
		
		assertEquals(1499.95, total, 0.01);
	}
}
