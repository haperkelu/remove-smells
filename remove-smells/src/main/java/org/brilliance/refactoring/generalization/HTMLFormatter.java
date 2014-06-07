package org.brilliance.refactoring.generalization;

public class HTMLFormatter extends AbstractFormatter {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");	
	private static final String HEADER_TEMPLATE = "<H1>Rentals for <EM>%s </EM></H1><P>" + LINE_SEPARATOR;
	private static final String ITEM_TEMPLATE = "%s:%s<br/>" + LINE_SEPARATOR;
	private static final String FOOTER_TEMPLATE =  "<P>You owe <EM>%s</EM><P>" + LINE_SEPARATOR
			+ "On this rental you earned <EM>%s</EM> frequent renter points<P>";
	
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
