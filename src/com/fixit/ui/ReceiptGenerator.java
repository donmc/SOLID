package com.fixit.ui;

import com.fixit.FixItMechanicsSystem;
import com.fixit.Receipt;
import com.fixit.printer.IGenericPrinter;

public class ReceiptGenerator {

	private FixItMechanicsSystem system;
	private IGenericPrinter printer;

	public void PrintReceipt() {
		Receipt receipt = system.finalizeOrder();
		String receiptString = "Total........ $" + receipt.total();
		
		printer.print(receiptString);
	}
}
