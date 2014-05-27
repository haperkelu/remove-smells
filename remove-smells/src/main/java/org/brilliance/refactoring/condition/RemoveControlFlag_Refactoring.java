/**   
 * @Title: RemoveControlFlag.java 
 * @Package org.brilliance.refactoring.condition 
 * @Description: TODO
 * @author PAI LI   
 * @date 2014-5-26 下午4:44:59 
 * @version V1.0   
 */
package org.brilliance.refactoring.condition;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

/**
 * @author PAI LI
 * 
 */
public class RemoveControlFlag_Refactoring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	private static String[] BLACK_LIST = new String[] { "Don", "John" };

	void checkSecurity(String[] people) {
		someLaterCode(findDangerousPerson(people));
	}
	
	 String findDangerousPerson(String[] people) {
		for (String person : people) {
			if (ArrayUtils.contains(BLACK_LIST, person)) {
				sendAlert();
				return person;
			}
		}
		return StringUtils.EMPTY;
	}

	private void someLaterCode(String found) {
		// TODO Auto-generated method stub
	}

	private void sendAlert() {

	}

}
