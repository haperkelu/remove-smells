/**   
* @Title: Salesman_Refactoring.java 
* @Package org.brilliance.refactoring.condition.polymorphism 
* @Description: TODO
* @author PAI LI   
* @date 2014-5-26 下午11:20:01 
* @version V1.0   
*/
package org.brilliance.refactoring.condition.polymorphism;

/**
 * @author PAI LI
 *
 */
public class Salesman_Refactoring extends EmployeeType_Refactoring implements SalaryPolicy {

	private static final int SALESMAN_TYPE_CODE = 2;
	
	public Salesman_Refactoring() {
		super(SALESMAN_TYPE_CODE);
	}
	
	public double payAmount(Employee_Refactoring employee) {
		return employee.getMonthlySalary() + employee.getCommission();	
	}

}
