/**   
* @Title: DecomposeConditonExpression.java 
* @Package org.brilliance.refactoring.condition 
* @Description: TODO
* @author PAI LI   
* @date 2014-5-26 下午2:58:51 
* @version V1.0   
*/
package org.brilliance.refactoring.condition;

import java.util.Calendar;
import java.util.Date;
import org.joda.time.DateTime;

/**
 * @author PAI LI
 *
 */
public class DecomposeConditonExpression {

	private static Date SUMMER_START = new DateTime(1900, 6, 1, 0, 0).toDate();
	private static Date SUMMER_END = new DateTime(1900, 8, 31, 23, 59).toDate();
	
	private static double WINTER_RATE = 3.3333;
	private static double SUMMER_RATE = 4.3333;
	private static double WINTER_SERVICE_CHARGE = 5000.555;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Date date = Calendar.getInstance().getTime();
		double charge = CalculateChargeFee(date, 3000);
		System.out.println(charge);
	}
	
	private static double CalculateChargeFee(Date date, int quantity) {
		double charge = 0.0;
		if(date.before (SUMMER_START) || date.after(SUMMER_END))
			charge = quantity * WINTER_RATE + WINTER_SERVICE_CHARGE;
		else charge = quantity * SUMMER_RATE;
		return charge;
	}

}
