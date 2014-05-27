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
public class IntroduceAssertion_Refactoring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}

class Employee_Refactoring {
	private static final double NULL_EXPENSE = -1.0;
	private double _expenseLimit = NULL_EXPENSE;
	private Project_Refactoring _primaryProject;

	double getExpenseLimit() {
		//http://stackoverflow.com/questions/2758224/assertion-in-java
		assert (_expenseLimit != NULL_EXPENSE || _primaryProject != null);
		return (_expenseLimit != NULL_EXPENSE) ? _expenseLimit
				: _primaryProject.getMemberExpenseLimit();
	}

	boolean withinLimit(double expenseAmount) {
		return (expenseAmount <= getExpenseLimit());
	}
}

class Project_Refactoring {

	public double getMemberExpenseLimit() {
		return 0;
	}
	
}
