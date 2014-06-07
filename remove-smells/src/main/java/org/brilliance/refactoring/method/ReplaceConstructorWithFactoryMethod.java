/**   
 * @Title: ReplaceConstructorWithFactoryMethod.java 
 * @Package org.brilliance.refactoring.method 
 * @Description: TODO
 * @author PAI LI   
 * @date 2014-6-7 下午6:24:47 
 * @version V1.0   
 */
package org.brilliance.refactoring.method;

/**
 * @author PAI LI
 * 
 */
public class ReplaceConstructorWithFactoryMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee ken = EmployeeFactory.createEmployee(EmployeeTypeGroup.ENGINEER.getType());
	}

	static class Employee {
		private int _type;
		static final int ENGINEER = 0;
		static final int SALESMAN = 1;
		static final int MANAGER = 2;

		public Employee(int type) {
			_type = type;
		}
	}
	
	static final class EmployeeTypeGroup {
		public static final EmployeeTypeGroup  ENGINEER = new EmployeeTypeGroup(0);
		public static final EmployeeTypeGroup  SALESMAN = new EmployeeTypeGroup(1);
		public static final EmployeeTypeGroup  MANAGER = new EmployeeTypeGroup(2);
		private final int type;
		private EmployeeTypeGroup(int type){
			this.type = type;
		}
		public int getType() {return this.type;};
	}
	
	//refactoring
	 static final class EmployeeFactory {
		public static Employee createEmployee(int type){
			return new Employee(type);
		}
	}
	 
	 static class Person {}
	 static class Male extends Person {}
	 static class Female extends Person {}
	 static class PersonFactory {
		 public static Person createMale() {return new Male();}
		 public static Person createFemale() {return new Female();}
	 }

}
