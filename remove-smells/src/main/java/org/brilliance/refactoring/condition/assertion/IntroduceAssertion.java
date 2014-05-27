/**   
 * @Title: IntroduceAssertion.java 
 * @Package org.brilliance.refactoring.condition.assertion 
 * @Description: TODO
 * @author PAI LI   
 * @date 2014-5-27 上午11:38:41 
 * @version V1.0   
 */
package org.brilliance.refactoring.condition.assertion;

/**
 * @author PAI LI
 * 
 */
public class IntroduceAssertion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}

class Employee {
	private static final double NULL_EXPENSE = -1.0;
	private double _expenseLimit = NULL_EXPENSE;
	private Project _primaryProject;

	double getExpenseLimit() {
		return (_expenseLimit != NULL_EXPENSE) ? _expenseLimit
				: _primaryProject.getMemberExpenseLimit();
	}

	boolean withinLimit(double expenseAmount) {
		return (expenseAmount <= getExpenseLimit());
	}
}

class Project {

	public double getMemberExpenseLimit() {
		return 0;
	}
	
}
