/**   
 * @Title: EmployeeType.java 
 * @Package org.brilliance.refactoring.condition.polymorphism 
 * @Description: TODO
 * @author PAI LI   
 * @date 2014-5-26 下午11:01:44 
 * @version V1.0   
 */
package org.brilliance.refactoring.condition.polymorphism;

/**
 * @author PAI LI
 * 
 */
public abstract class EmployeeType_Refactoring {

	private int code;
	
	protected EmployeeType_Refactoring(int code) {
		this.code = code;
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}
	public abstract double payAmount(Employee_Refactoring employee);

}
