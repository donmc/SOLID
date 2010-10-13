package com.fixit.printer;

import com.epson.printer.EpsonTMT88IVPrinter;

public class EpsonPrinterAdapter implements IGenericPrinter {

	private EpsonTMT88IVPrinter epsonTMT88IVPrinter;
	private String initString = "sasllkslsl398383fa";
	
	@Override
	public void print(String printString) {

		epsonTMT88IVPrinter.initialize(initString);
		epsonTMT88IVPrinter.printBwMed239(printString);
		epsonTMT88IVPrinter.flush();
	}

}
