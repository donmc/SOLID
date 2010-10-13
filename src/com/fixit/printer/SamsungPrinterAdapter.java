package com.fixit.printer;

import com.samsung.printer.SamsungSRP350;

public class SamsungPrinterAdapter implements IGenericPrinter {

	private SamsungSRP350 samsungSRP350Printer;
	private String initString = "asdfasdfasdf";
	
	@Override
	public void print(String printString) {

		samsungSRP350Printer.init(initString);
		samsungSRP350Printer.processPages(printString);
	}

}
