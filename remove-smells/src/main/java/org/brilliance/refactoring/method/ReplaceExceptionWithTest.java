/**   
 * @Title: ReplaceExceptionWithTest.java 
 * @Package org.brilliance.refactoring.method 
 * @Description: TODO
 * @author PAI LI   
 * @date 2014-6-7 下午6:53:08 
 * @version V1.0   
 */
package org.brilliance.refactoring.method;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author PAI LI
 * 
 */
public class ReplaceExceptionWithTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class ResourcePool {
		Resource getResource() {
			Resource result;
			try {
				result = (Resource) available.pop();
				allocated.push(result);
				return result;
			} catch (EmptyStackException e) {
				result = new Resource();
				allocated.push(result);
				return result;
			}
		}
		
		@SuppressWarnings("unchecked")
		Resource getResource_refactoring() {
			
			if(available.isEmpty())
				return new Resource();
			
			Resource result = null;
			allocated.push((result = (Resource) available.pop()));
			return result;
		}

		Stack available;
		Stack allocated;
	}
	class Resource {}

}
