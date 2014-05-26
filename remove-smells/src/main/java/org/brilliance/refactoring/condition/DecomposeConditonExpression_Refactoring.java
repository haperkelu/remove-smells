/**   
* @Title: DecomposeConditonExpression.java 
* @Package org.brilliance.refactoring.condition 
* @Description: TODO
* @author PAI LI   
* @date 2014-5-26 下午2:58:51 
* @version V1.0   
*/
package org.brilliance.refactoring.condition;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Date;
import java.util.Random;
import org.joda.time.DateTime;

/**
 * @author PAI LI
 *
 */
public class DecomposeConditonExpression_Refactoring {

	private static Date SUMMER_START = new DateTime(1900, 6, 1, 0, 0).toDate();
	private static Date SUMMER_END = new DateTime(1900, 8, 31, 23, 59).toDate();
	private static Date[] DATES_POOL = new Date[] {new DateTime(1900, 6,20, 0, 0).toDate(), new DateTime(1900, 11,20, 0, 0).toDate()};
	
	private static double WINTER_RATE = 3.3333;
	private static double SUMMER_RATE = 4.3333;
	private static double WINTER_SERVICE_CHARGE = 5000.555;
	
	private static final Random RANDOM_NUMBER_GENERATOR = new Random();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		doubleVersusBigDecimal();
		System.out.println(CalculateChargedFee(selectOneDateFromPoolRandomly(), 3000));
	}
	
	private static void doubleVersusBigDecimal() {
		System.out.println( "362.2 - 362.6 = " + ( 362.2 - 362.6 ) );
		System.out.println("362.2 - 362.6 = " +  substractWithPrecision(362.2, 362.6).toEngineeringString());
	}
	
	private static Date selectOneDateFromPoolRandomly() {
		return DATES_POOL[(int) Math.floor(DATES_POOL.length * RANDOM_NUMBER_GENERATOR.nextDouble())];
	}
	
	private static double CalculateChargedFee(Date date, int quantity) {

		if(isNotSummer(date)) //decompose condition expression
			return addWithPrecision(multipleWithPrecision(quantity, WINTER_RATE), WINTER_SERVICE_CHARGE);
		else 
			return multipleWithPrecision(quantity, SUMMER_RATE);
	}
	
	private static boolean isNotSummer(Date date){
		return date.before(SUMMER_START) || date.after(SUMMER_END);
	}
	
	private static double multipleWithPrecision(double quantity, double rate) {
		//http://java-performance.info/bigdecimal-vs-double-in-financial-calculations/
		//http://stackoverflow.com/questions/9795364/java-bigdecimal-precision-problems
		return new BigDecimal(String.valueOf(quantity)).multiply(new BigDecimal(String.valueOf(rate)), MathContext.DECIMAL64).doubleValue();
	}
	
	private static double addWithPrecision(double charge, double extraCharge){
		//http://java-performance.info/bigdecimal-vs-double-in-financial-calculations/
		//http://stackoverflow.com/questions/9795364/java-bigdecimal-precision-problems
		return new BigDecimal(String.valueOf(charge)).add(new BigDecimal(String.valueOf(extraCharge))).doubleValue(); 
	}
	
	private static BigDecimal substractWithPrecision(double minuend, double subtrahend){
		//http://java-performance.info/bigdecimal-vs-double-in-financial-calculations/
		//http://stackoverflow.com/questions/9795364/java-bigdecimal-precision-problems
		return new BigDecimal(String.valueOf(minuend)).subtract(new BigDecimal(String.valueOf(subtrahend)), MathContext.DECIMAL64);
	}

}
