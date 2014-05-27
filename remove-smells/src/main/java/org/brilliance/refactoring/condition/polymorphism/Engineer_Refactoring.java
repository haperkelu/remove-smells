/**   
* @Title: Engineer_Refactoring.java 
* @Package org.brilliance.refactoring.condition.polymorphism 
* @Description: TODO
* @author PAI LI   
* @date 2014-5-26 下午11:14:59 
* @version V1.0   
*/
package org.brilliance.refactoring.condition.polymorphism;

/**
 * @author PAI LI
 *
 */
public class Engineer_Refactoring extends EmployeeType_Refactoring implements SalaryPolicy {

	private static final int ENGINEER_TYPE_CODE = 1;
	
	public Engineer_Refactoring() {
		super(ENGINEER_TYPE_CODE);
	}

	public double payAmount(Employee_Refactoring employee) {
		return employee.getMonthlySalary();
	}
	
}
