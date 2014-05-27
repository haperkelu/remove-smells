/**   
* @Title: ConsolidateDuplicateConditionExpression.java 
* @Package org.brilliance.refactoring.condition 
* @Description: TODO
* @author PAI LI   
* @date 2014-5-26 下午4:36:54 
* @version V1.0   
*/
package org.brilliance.refactoring.condition;

/**
 * @author PAI LI
 *
 */
public class ConsolidateDuplicateConditionExpression_Refactoring {

	private static final double SPECIAL_OFFER_DISCOUNT = 0.95;
	private static final double STANDARD_OFFER_DISCOUNT = 0.98;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(isSpecialDeal()? calculateTotalPrice(getPrice(), SPECIAL_OFFER_DISCOUNT) : calculateTotalPrice(getPrice(), STANDARD_OFFER_DISCOUNT));		
		send();

	}

	private static double getPrice() {
		return 55;
	}
	
	private static void send() {
		
	}

	private static boolean isSpecialDeal() {
		return false;
	}
	private static double calculateTotalPrice(double price, double discount){
		return price * discount;
	}
	

}
