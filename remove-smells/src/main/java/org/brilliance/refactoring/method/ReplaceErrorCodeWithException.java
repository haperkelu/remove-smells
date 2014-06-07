/**   
 * @Title: ReplaceErrorCodeWithException.java 
 * @Package org.brilliance.refactoring.method 
 * @Description: TODO
 * @author PAI LI   
 * @date 2014-6-7 下午6:40:11 
 * @version V1.0   
 */
package org.brilliance.refactoring.method;

/**
 * @author PAI LI
 * 
 */
public class ReplaceErrorCodeWithException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private int _balance;

	int withdraw(int amount) {
		if (amount > _balance)
			return -1;
		else {
			_balance -= amount;
			return 0;
		}
	}
	
	void withdraw_refactoring1(int amount) throws BalanceException {
	     if (amount > _balance) 
	    	 throw new BalanceException();
	     _balance -= amount;
	 }
	
	void withdraw_refactoring2(int amount) {
	     if (amount > _balance) 
	    	 throw new RuntimeException("Amount exceeds balance!");
	     _balance -= amount;
	 }
	
	static class BalanceException extends Exception {
		
	}

}
