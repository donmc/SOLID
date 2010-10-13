package com.fixit.ui;

import com.epson.printer.EpsonTMT88IVPrinter;
import com.fixit.FixItMechanicsSystem;
import com.fixit.ServiceOrder;

public class ReceiptGenerator {

	private FixItMechanicsSystem system;
	private EpsonTMT88IVPrinter epsonTMT88IVPrinter;
	private String initString = "sasllkslsl398383fa";

	public void PrintReceipt() {
		ServiceOrder order = system.finalizeOrder();
		String receiptString = "Total........ $" + order.total();
		epsonTMT88IVPrinter.initialize(initString);
		epsonTMT88IVPrinter.printBwMed239(receiptString);
		epsonTMT88IVPrinter.flush();
	}
}
