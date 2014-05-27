/**   
* @Title: Manager_Refactoring.java 
* @Package org.brilliance.refactoring.condition.polymorphism 
* @Description: TODO
* @author PAI LI   
* @date 2014-5-26 下午11:20:48 
* @version V1.0   
*/
package org.brilliance.refactoring.condition.polymorphism;

/**
 * @author PAI LI
 *
 */
public class Manager_Refactoring extends EmployeeType_Refactoring {
	
	private static final int MANAGER_TYPE_CODE = 3;
	
	public Manager_Refactoring() {
		super(MANAGER_TYPE_CODE);
	}
	
	public double payAmount(Employee_Refactoring employee) {
		return employee.getMonthlySalary() + employee.getBonus();	
	}

}
