/**   
 * @Title: SeparateQueryfromModifier.java 
 * @Package org.brilliance.refactoring.method 
 * @Description: TODO
 * @author PAI LI   
 * @date 2014-6-1 下午10:58:31 
 * @version V1.0   
 */
package org.brilliance.refactoring.method;

/**
 * @author PAI LI
 * 
 */
public class SeparateQueryfromModifier {
	
	private static final String EMPTY_STRING = "";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	       //String found = foundMiscreant(new String[] {"Jim", "Duncan"}, new String[] {"Jim"});
		String[] people = new String[] {"Jim", "Duncan"};
		String[] blackList = new String[] {"Jim"};
		
		sendAlertMessageToMiscreat(people, blackList);   
		someLaterCode(foundMiscreant(people, blackList));
	}

	private static void someLaterCode(String found) {
		
	}

	static void sendAlertMessageToMiscreat(String[] people, String[] blacklist) {
		if(!foundMiscreant(people, blacklist).equals(EMPTY_STRING)) {
			sendAlert();
		}
	}
	
	static String foundMiscreant(String[] people, String[] blacklist) {
		for(String person: people){
			if(isArrayContainElement(blacklist, person)){
				return person;
			}
		}
		return EMPTY_STRING;
	}

	private static boolean isArrayContainElement(String[] array,
			String target) {
		for(String item: array){
			if(item.equals(target)) 
				return true;
		}
		return false;
	}

	private static void sendAlert() {
	}

}
