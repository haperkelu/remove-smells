/**   
 * @Title: ParameterizedMethod.java 
 * @Package org.brilliance.refactoring.method 
 * @Description: TODO
 * @author PAI LI   
 * @date 2014-6-6 下午10:34:10 
 * @version V1.0   
 */
package org.brilliance.refactoring.method;

/**
 * @author PAI LI
 * 
 */
public class ParameterizedMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private double salary;

	void tenPercentRaise() {
		salary *= 1.1;
	}

	void fivePercentRaise() {
		salary *= 1.05;
	}

	void salaryRaised(double percent) {
		salary *= percent;
	}

	protected Dollars baseCharge_pre() {
		double result = Math.min(lastUsage(), 100) * 0.03;
		if (lastUsage() > 100) {
			result += (Math.min(lastUsage(), 200) - 100) * 0.05;
		}
		if (lastUsage() > 200) {
			result += (lastUsage() - 200) * 0.07;
		}
		return new Dollars(result);
	}

	protected Dollars baseCharge_post() {
		double result = extractNumberBetweenRange(lastUsage(), ZERO_USAGE,
				FIRST_THRESHOLD) * LEVEL1_RATE;
		result += extractNumberBetweenRange(lastUsage(), FIRST_THRESHOLD,
				SECOND_THRESHOLD) * LEVEL2_RATE;
		result += extractNumberBetweenRange(lastUsage(), SECOND_THRESHOLD,
				Double.MAX_VALUE) * LEVEL3_RATE;
		return new Dollars(result);
	}

	private static final double ZERO_USAGE = 0;
	private static final double FIRST_THRESHOLD = 100;
	private static final double SECOND_THRESHOLD = 200;
	private static final double LEVEL1_RATE = 0.03;
	private static final double LEVEL2_RATE = 0.05;
	private static final double LEVEL3_RATE = 0.07;

	protected double extractNumberBetweenRange(double value, double start, double end) {
		if (value > start)
			return Math.min(value, end) - start;
		return ZERO_USAGE;
	}

	private int lastUsage() {
		return 0;
	}

	class Dollars {

		public Dollars(double result) {
		}

	}

}
