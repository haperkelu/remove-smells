package org.brilliance.refactoring.condition;

public class ConsolidateCondtionExpression_Refactoring {

	ConsolidateCondtionExpression_Refactoring() {
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(new ConsolidateCondtionExpression_Refactoring().disabilityAmount());
	}

	private int _seniority;
	private int _monthsDisabled;
	private boolean _isPartTime;
	private static double NO_MONEY_FOR_BENEFIT = 0.0;
	private static double STANDARD_AMOUNT_OF_DISABILITY = 5555.3;

	double disabilityAmount() {
		if(isNotEligibleForBenefit()) return NO_MONEY_FOR_BENEFIT;
		return STANDARD_AMOUNT_OF_DISABILITY;
	}
	
	boolean isNotEligibleForBenefit() {
		return _seniority < 2 || _monthsDisabled > 12 || _isPartTime == true;
	}

}
