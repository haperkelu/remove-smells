/**   
 * @Title: ReplaceParameterWithExplicitMethods.java 
 * @Package org.brilliance.refactoring.method 
 * @Description: TODO
 * @author PAI LI   
 * @date 2014-6-7 下午3:05:04 
 * @version V1.0   
 */
package org.brilliance.refactoring.method;

/**
 * @author PAI LI
 * 
 */
public class ReplaceParameterWithExplicitMethods {

	private int _height;
	private int _width;

	// to be refactored
	void setValue(String name, int value) {
		if (name.equals("height"))
			_height = value;
		if (name.equals("width"))
			_width = value;

		assert false : "you should never reach here";
	}

	// refactoring
	void setHeight(int height) {
		this._height = height;
	}

	// refactoring
	void setWidth(int width) {
		this._width = width;
	}
	static class Employee {}
	static class Engineer extends Employee {}
	static class Salesman extends Employee {}
	static class Manager extends Employee {}
	static class EmployeeFactory {
		private static final int ENGINEER = 0;
		private static final int SALESMAN = 1;
		private static final int MANAGER = 2;
		
		// to be refactored
		static Employee create(int type) {
			switch (type) {
			case ENGINEER:
				return new Engineer();
			case SALESMAN:
				return new Salesman();
			case MANAGER:
				return new Manager();
			default:
				throw new IllegalArgumentException("Incorrect type code value");
			}
		}

		//refactoring
		static Employee createEngineer() {
			return new Engineer();
		}

		//refactoring
		static Employee createSalesman() {
			return new Salesman();
		}

		//refactoring
		static Employee createManager() {
			return new Manager();
		}
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee ken = EmployeeFactory.createEngineer();
		System.out.println(ken);
	}

}
