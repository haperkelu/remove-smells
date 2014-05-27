/**   
 * @Title: Employee_Refactoring.java 
 * @Package org.brilliance.refactoring.condition.polymorphism 
 * @Description: TODO
 * @author PAI LI   
 * @date 2014-5-26 下午11:11:00 
 * @version V1.0   
 */
package org.brilliance.refactoring.condition.polymorphism;

/**
 * @author PAI LI
 * 
 */
public class Employee_Refactoring {

	private EmployeeType_Refactoring employeeType;
	private double monthlySalary;
	private double commission;
	private double bonus;

	public Employee_Refactoring() {

	}

	public Employee_Refactoring(EmployeeType_Refactoring employeeType) {
		this.setEmployeeType(employeeType);
	}

	/**
	 * @return the employeeType
	 */
	public EmployeeType_Refactoring getEmployeeType() {
		return employeeType;
	}

	/**
	 * @param employeeType
	 *            the employeeType to set
	 */
	public void setEmployeeType(EmployeeType_Refactoring employeeType) {
		this.employeeType = employeeType;
	}

	/**
	 * @return the monthlySalary
	 */
	public double getMonthlySalary() {
		return monthlySalary;
	}

	/**
	 * @param monthlySalary
	 *            the monthlySalary to set
	 */
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	/**
	 * @return the commission
	 */
	public double getCommission() {
		return commission;
	}

	/**
	 * @param commission
	 *            the commission to set
	 */
	public void setCommission(double commission) {
		this.commission = commission;
	}

	/**
	 * @return the bonus
	 */
	public double getBonus() {
		return bonus;
	}

	/**
	 * @param bonus
	 *            the bonus to set
	 */
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double payAmount() {
		return employeeType.payAmount(this);
	}

}
