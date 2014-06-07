package org.brilliance.refactoring.generalization;

public class TextFormatter extends AbstractFormatter {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");	
	private static final String HEADER_TEMPLATE = "Rental Record for %s" + LINE_SEPARATOR;
	private static final String ITEM_TEMPLATE = "\t%s\t%s" + LINE_SEPARATOR;
	private static final String FOOTER_TEMPLATE =  "Amount owed is %s" 
			+  LINE_SEPARATOR + "You earned %s frequent renter points";
	
	@Override
	String formatHeader(String name) {
		return String.format(HEADER_TEMPLATE, name);
	}

	@Override
	String formatEachItem(String title, double charge) {
		return String.format(ITEM_TEMPLATE, title, String.valueOf(charge));
	}

	@Override
	String formatFooter(double totalCharge, double totalFrequentRenterPoints) {
		return String.format(FOOTER_TEMPLATE, String.valueOf(totalCharge), String.valueOf(totalFrequentRenterPoints));
	}

}
