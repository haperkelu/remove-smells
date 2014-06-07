/**   
 * @Title: RemoveSettingMethod.java 
 * @Package org.brilliance.refactoring.method 
 * @Description: TODO
 * @author PAI LI   
 * @date 2014-6-7 下午5:56:51 
 * @version V1.0   
 */
package org.brilliance.refactoring.method;

/**
 * @author PAI LI
 * 
 */
public class RemoveSettingMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class Account {

		private String _id;

		Account(String id) {
			setId(id);
		}

		void setId(String arg) {
			_id = arg;
		}
	}
	
	class Account_refactoring {

		private final String _id;

		Account_refactoring(String id) {
			this._id = id;
		}
	}
	
	class InterestAccount extends Account {

		InterestAccount(String id) {
			super(id);
		}
		
	}
	
}
