/**   
 * @Title: EncapsulateDowncast.java 
 * @Package org.brilliance.refactoring.method 
 * @Description: TODO
 * @author PAI LI   
 * @date 2014-6-7 下午6:33:36 
 * @version V1.0   
 */
package org.brilliance.refactoring.method;

/**
 * @author PAI LI
 * 
 */
public class EncapsulateDowncast {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Reading lastReading = (Reading) lastReading();
		//refactoring
		Reading lastReading1 = lastReading_refactoring();
		assert lastReading == lastReading1;
	}
	private static Reading readings = new Reading();

	static Object lastReading() {
		return readings.lastElement();
	}
	
	static Reading lastReading_refactoring() {
		return (Reading)readings.lastElement();
	}
	static class Reading {

		public Reading lastElement() {
			// TODO Auto-generated method stub
			return null;
		}}
}
