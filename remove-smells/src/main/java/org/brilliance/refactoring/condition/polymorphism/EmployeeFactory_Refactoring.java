/**   
* @Title: EmployeeFactory_Refactoring.java 
* @Package org.brilliance.refactoring.condition.polymorphism 
* @Description: TODO
* @author PAI LI   
* @date 2014-5-26 下午11:13:24 
* @version V1.0   
*/
package org.brilliance.refactoring.condition.polymorphism;

/**
 * @author PAI LI
 *
 */
public final class EmployeeFactory_Refactoring {

	private EmployeeFactory_Refactoring(){
		
	}
	
	public static Employee_Refactoring createEngineer() {
		return new Employee_Refactoring(new Engineer_Refactoring());
	}
	
	public static Employee_Refactoring createSalesman() {
		return new Employee_Refactoring(new Salesman_Refactoring());
	}
	
	public static Employee_Refactoring createManager() {
		return new Employee_Refactoring(new Manager_Refactoring());
	}
	
	
}
