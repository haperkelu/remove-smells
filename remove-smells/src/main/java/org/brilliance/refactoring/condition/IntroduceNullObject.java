/**   
 * @Title: IntroduceNullObject.java 
 * @Package org.brilliance.refactoring.condition 
 * @Description: TODO
 * @author PAI LI   
 * @date 2014-5-27 上午10:45:57 
 * @version V1.0   
 */
package org.brilliance.refactoring.condition;

/**
 * @author PAI LI
 * 
 */
public class IntroduceNullObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Site site = new Site();
		Customer customer = site.getCustomer();
        BillingPlan plan = null;
        if (customer == null) plan = BillingPlan.basic();
        else plan = customer.getPlan();       
        System.out.println(plan);
        
        String customerName;
        if (customer == null) customerName = "occupant";
        else customerName = customer.getName();
        System.out.println(customerName);
        
        int weeksDelinquent;
        if (customer == null) weeksDelinquent = 0;
        else weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();
        System.out.println(weeksDelinquent);
	}

}

class Site {
	Customer getCustomer() {
		return customer;
	}

	private Customer customer;
}

class Customer {
	private String name;
	public String getName() {return this.name;}
    public BillingPlan getPlan() {return new BillingPlan();}
    public PaymentHistory getHistory() {return new PaymentHistory();}
}

class BillingPlan {

	public static BillingPlan basic() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class PaymentHistory {
	int getWeeksDelinquentInLastYear() {
		return 0;
	}
}
