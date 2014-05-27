/**   
 * @Title: Employee.java 
 * @Package org.brilliance.refactoring.condition.polymorphism 
 * @Description: TODO
 * @author PAI LI   
 * @date 2014-5-26 下午11:00:10 
 * @version V1.0   
 */
package org.brilliance.refactoring.condition.polymorphism;

/**
 * @author PAI LI
 * 
 */
public class Employee {
	 
    private int type;
    public static final int ENGINEER = 0;
    public static final int SALESMAN = 1;
    public static final int MANAGER = 2;
    
    private double monthlySalary;
    private double commission;
    private double bonus;
 
    /**
	 * @return the monthlySalary
	 */
	public double getMonthlySalary() {
		return monthlySalary;
	}

	/**
	 * @param monthlySalary the monthlySalary to set
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
	 * @param commission the commission to set
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
	 * @param bonus the bonus to set
	 */
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public Employee (int type) {
        this.type = type;
    }

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}
	
	public double payAmount() {
        switch (this.type) {
            case ENGINEER:
               return this.getMonthlySalary();
            case SALESMAN:
               return this.getMonthlySalary() + this.getCommission();
            case MANAGER:
               return this.getMonthlySalary() + this.getBonus();
            default:
               throw new RuntimeException("Incorrect Employee");
        }
    }

}