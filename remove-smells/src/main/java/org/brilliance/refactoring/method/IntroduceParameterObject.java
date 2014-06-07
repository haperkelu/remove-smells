/**   
 * @Title: IntroduceParameterObject.java 
 * @Package org.brilliance.refactoring.method 
 * @Description: TODO
 * @author PAI LI   
 * @date 2014-6-7 下午5:23:30 
 * @version V1.0   
 */
package org.brilliance.refactoring.method;

import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

import org.joda.time.DateTime;
import org.joda.time.Interval;

/**
 * @author PAI LI
 * 
 */
public class IntroduceParameterObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(1900, 1, 1);
		Date begin = calendar.getTime();
		calendar.set(1910, 1, 1);
		Date end = calendar.getTime();
		double flow = new Account().getFlowBetween(begin, end);

		// refactoring
		double flow1 = new Account().getFlowBetween_refactoring(new Interval(
				new DateTime(begin), new DateTime(end)));
		
	}

	class Entry {
		Entry(double value, Date chargeDate) {
			_value = value;
			_chargeDate = chargeDate;
		}

		Date getDate() {
			return _chargeDate;
		}

		double getValue() {
			return _value;
		}

		private Date _chargeDate;
		private double _value;
	}

	static class Account {
		@SuppressWarnings("rawtypes")
		double getFlowBetween(Date start, Date end) {
			double result = 0;
			Enumeration e = _entries.elements();
			while (e.hasMoreElements()) {
				Entry each = (Entry) e.nextElement();
				if (each.getDate().equals(start)
						|| each.getDate().equals(end)
						|| (each.getDate().after(start) && each.getDate()
								.before(end))) {
					result += each.getValue();
				}
			}
			return result;
		}

		@SuppressWarnings("rawtypes")
		double getFlowBetween_refactoring(Interval interval) {
			double result = 0;
			Enumeration e = _entries.elements();
			while (e.hasMoreElements()) {
				Entry each = (Entry) e.nextElement();
				long millionSecondsOfEachDate = each.getDate().getTime();
				if (interval.contains(millionSecondsOfEachDate)
						|| interval.getEnd().equals(millionSecondsOfEachDate)) {
					result += each.getValue();
				}
			}
			return result;
		}

		@SuppressWarnings("rawtypes")
		private Vector _entries = new Vector();
	}
}
