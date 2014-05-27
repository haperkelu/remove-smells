/**   
* @Title: ReplaceNestedConditional.java 
* @Package org.brilliance.refactoring.condition 
* @Description: TODO
* @author PAI LI   
* @date 2014-5-26 下午5:33:13 
* @version V1.0   
*/
package org.brilliance.refactoring.condition;

/**
 * @author PAI LI
 *
 */
public class ReplaceNestedConditional {

	private static final int ADJ_FACTOR = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private double _capital;
	private double _duration;
	private double _intRate;
	private double _income;
	
	public double getAdjustedCapital() {
	     double result = 0.0;
	     if (_capital > 0.0) {
	       if (_intRate > 0.0 && _duration > 0.0) {
	         result = (_income / _duration) * ADJ_FACTOR;
	       }
	     }
	     return result;
	   }

}
