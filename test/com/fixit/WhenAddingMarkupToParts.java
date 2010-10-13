package com.fixit;

import static org.junit.Assert.*;

import org.junit.Test;

public class WhenAddingMarkupToParts {

	@Test
	public void shouldApplyMarkupWhenTotaling() {
		ServiceOrder order = new ServiceOrder();
		order.addItem(new Part("Fan Belt", 100, 20));
		
		double total = order.total();
		
		assertEquals(120, total, 0.01);
	}
}
