/**   
* @Title: Main.java 
* @Package org.brilliance.online 
* @Description: TODO
* @author PAI LI   
* @date 2014-5-27 下午12:06:45 
* @version V1.0   
*/
package org.brilliance.online;

import java.util.ArrayList;
import java.util.List;

/**
 * @author PAI LI
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericsWeird();
		printWeird();
	}
	public static synchronized void bar() {
		//http://stackoverflow.com/questions/437620/java-synchronized-static-methods-lock-on-object-or-class/437627#437627
    }
	
	private static void printWeird() {
		String a = "foo";
		String b = "food".substring(0, 3);
		String c = b.intern();

		if (a.equals(b)) {
		    if (a == b) {
		        System.out.println("1");
		    } else if (a == c) {
		        System.out.println("2");
		    } else {
		        System.out.println("3");
		    }
		} else {
		    System.out.println("4");
		}
	}
	
	private static void GenericsWeird() {
		//http://devender.files.wordpress.com/2008/05/effectivejava.pdf
		List<Apple> list = new ArrayList<Apple>();
		if(list instanceof List<?>){
			System.out.println("hit");
		}
	}
}



class Apple {
	
}
