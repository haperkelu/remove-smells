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
public class ReplaceNestedConditional_Refactoring {

	private static final int ADJ_FACTOR = 0;
	private static final double ZERO_CAPTIAL = 0.0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	private double _capital;
	private double _duration;
	private double _intRate;
	private double _income;

	public double getAdjustedCapital() {

		if (isCapitalInvalid()) {
			return ZERO_CAPTIAL;
		}
		if (isRateOrDuartionInvalid()) {
			return ZERO_CAPTIAL;
		}

		return (_income / _duration) * ADJ_FACTOR;
	}

	private boolean isRateOrDuartionInvalid() {
		return _intRate <= ZERO_CAPTIAL || _duration <= ZERO_CAPTIAL;
	}

	private boolean isCapitalInvalid() {
		return _capital <= ZERO_CAPTIAL;
	}

}
