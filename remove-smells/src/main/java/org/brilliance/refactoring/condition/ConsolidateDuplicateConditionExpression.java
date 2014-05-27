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
public class ConsolidateDuplicateConditionExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double total = 0;
		double price = 55;
		
		if (isSpecialDeal()) {
	          total = price * 0.95;
	          send();
	      }
	      else {
	          total = price * 0.98;
	          send();
	      }

	}

	private static void send() {
		
	}

	private static boolean isSpecialDeal() {
		return false;
	}

}
