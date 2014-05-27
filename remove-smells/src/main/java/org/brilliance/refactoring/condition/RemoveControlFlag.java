/**   
* @Title: RemoveControlFlag.java 
* @Package org.brilliance.refactoring.condition 
* @Description: TODO
* @author PAI LI   
* @date 2014-5-26 下午4:44:59 
* @version V1.0   
*/
package org.brilliance.refactoring.condition;

/**
 * @author PAI LI
 *
 */
public class RemoveControlFlag {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	
	void checkSecurity(String[] people) {
	       boolean found = false;
	       for (int i = 0; i < people.length; i++) {
	           if (! found) {
	              if (people[i].equals ("Don")){
	                sendAlert();
	                found = true;
	              }
	              if (people[i].equals ("John")){
	                sendAlert();
	                found = true;
	              }
	           }
	       }
	   }

	private void sendAlert() {
		
	}

}
