package org.brilliance.refactoring.condition;

public class ConsolidateCondtionExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private int _seniority;
	private int _monthsDisabled;
	private boolean _isPartTime;

	double disabilityAmount() {
		if (_seniority < 2)
			return 0;
		if (_monthsDisabled > 12)
			return 0;
		if (_isPartTime)
			return 0;
		return 0;
	}

}
