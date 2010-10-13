package com.fixit;

import static org.junit.Assert.*;

import org.junit.Test;


public class WhenCalculatingTotal {

	@Test
	public void shouldTotalWithJustOnePart() {
		ServiceOrder order = new ServiceOrder();
		order.addItem(new Part("Piston", 299.99));
		
		double total = order.total();
		
		assertEquals(299.99, total, 0.01);
	}
	
	@Test
	public void shouldTotalWithMultipleParts() {
		ServiceOrder order = new ServiceOrder();
		order.addItem(new Part("Piston", 299.99));
		order.addItem(new Part("Clock", 129.99));
		
		double total = order.total();
		
		assertEquals(429.98, total, 0.01);
	}
}
