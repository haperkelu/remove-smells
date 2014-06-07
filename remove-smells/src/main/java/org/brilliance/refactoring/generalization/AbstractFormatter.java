/**   
 * @Title: AbstractFormatter.java 
 * @Package org.brilliance.refactoring.generalization 
 * @Description: TODO
 * @author PAI LI   
 * @date 2014-6-7 下午10:19:02 
 * @version V1.0   
 */
package org.brilliance.refactoring.generalization;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author PAI LI
 * 
 */
public abstract class AbstractFormatter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}

	private Vector<Rental> _rentals;
	
	public String statement() {
		Enumeration<Rental> rentals = _rentals.elements();

		StringBuilder result = new StringBuilder();
		result.append(formatHeader(getName()));  //"Rental Record for " + getName() + "\n";
		while (rentals.hasMoreElements()) {
			Rental each = rentals.nextElement();
			result.append(formatEachItem(each.getMovie().getTitle(), each.getCharge()));//"\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n"
		}
		result.append(formatFooter(getTotalCharge(), getTotalFrequentRenterPoints()));
		return result.toString();
	}
	
	abstract String formatHeader(String name);
	abstract String formatEachItem(String title, double charge);
	abstract String formatFooter(double totalCharge, double totalFrequentRenterPoints);
	
	private double getTotalFrequentRenterPoints() {
		return 0;
	}

	private double getTotalCharge() {
		return 0;
	}

	private String getName() {
		return "";
	}

}
