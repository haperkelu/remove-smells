/**   
 * @Title: PreserveWholeObject.java 
 * @Package org.brilliance.refactoring.method 
 * @Description: TODO
 * @author PAI LI   
 * @date 2014-6-7 下午4:51:59 
 * @version V1.0   
 */
package org.brilliance.refactoring.method;

/**
 * @author PAI LI
 * 
 */
public class PreserveWholeObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int low = daysTempRange().getLow();
		int high = daysTempRange().getHigh();
		int withinPlan = new Plan().withinRange(low, high);

		// refactoring
		int withinPlan_refactoring = new Plan().withinRange(daysTempRange());
	}

	static class Plan {
		public int withinRange(int low, int high) {
			// TODO Auto-generated method stub
			return 0;
		}

		public int withinRange(TempRange range) {
			return withinRange(range.getLow(), range.getHigh());
		}
	}

	static class TempRange {

		public int getLow() {
			// TODO Auto-generated method stub
			return 0;
		}

		public int getHigh() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		//refactoring
		public boolean includes(TempRange other){
			return other.getLow() >= this.getLow() 
					&& other.getHigh() <= this.getHigh();
		};
	}

	private static TempRange daysTempRange() {
		return new TempRange();
	}

	class Room {
		boolean withinPlan(HeatingPlan plan) {
			int low = daysTempRange().getLow();
			int high = daysTempRange().getHigh();
			return plan.withinRange(low, high);
		}
		
		boolean withinPlan_Refactoring(HeatingPlan plan) {
			return plan.withinRange(daysTempRange());
		}
	}

	class HeatingPlan {
		boolean withinRange (int low, int high) {
	        return (low >= _range.getLow() && high <= _range.getHigh());
	    }
		
		boolean withinRange(TempRange range) {
			return _range.includes(range);
		}
		private TempRange _range;
	}
	
	//refactoring
	
	
}
