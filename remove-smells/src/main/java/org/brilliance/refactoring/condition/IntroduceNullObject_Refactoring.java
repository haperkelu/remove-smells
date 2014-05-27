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
public class IntroduceNullObject_Refactoring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Site_Refactoring site = new Site_Refactoring();
		Customer_Refactoring customer = site.getCustomer();
		customer.setPlan(BillingPlan_Refactoring.special());
		customer.getName();
		customer.getHistory().getWeeksDelinquentInLastYear();
	}

}

class Site_Refactoring {
	Customer_Refactoring getCustomer() {
		return customer == null ? CustomerFactory.newNullCustomer(): customer;
	}

	private Customer_Refactoring customer;
}

class CustomerFactory {
	static Customer_Refactoring newNullCustomer() {
		return new NullCustomer();
	}
}

class Customer_Refactoring {
	public Customer_Refactoring(String name) {
		this.name = name;
	}
	private String name;
	private BillingPlan_Refactoring billingPlan;
	private PaymentHistory_Refactoring paymentHistory;
	public String getName() {return this.name;}
	
    public BillingPlan_Refactoring getPlan() {return this.billingPlan;}
    public void setPlan(BillingPlan_Refactoring billingPlan) {this.billingPlan = billingPlan;}
    
    public PaymentHistory_Refactoring getHistory() {return this.paymentHistory;}
    public void setPaymentHistory(PaymentHistory_Refactoring paymentHistory) {this.paymentHistory = paymentHistory;}
}

class NullCustomer extends Customer_Refactoring {
	private static final String NULL_CUSTOMER_NAME = "occupant";
	public NullCustomer() {
		super(NULL_CUSTOMER_NAME);
		super.setPlan(BillingPlan_Refactoring.basic());
		super.setPaymentHistory(PaymentHistoryFactory.newNullPaymentHistory());
	}
    public void setPlan(BillingPlan billingPlan) {}
    public void setPaymentHistory(PaymentHistory paymentHistory) {}
}

class BillingPlan_Refactoring {

	public static BillingPlan_Refactoring basic() {
		return null;
	}
	
	public static BillingPlan_Refactoring special() {
		return null;
	}
	
}

class PaymentHistory_Refactoring {
	private int weeksDelinquentLastYear;
	int getWeeksDelinquentInLastYear() {
		return this.weeksDelinquentLastYear;
	}
}
class NullPaymentHistory extends  PaymentHistory_Refactoring{
	int getWeeksDelinquentInLastYear() {
		return 0;
	}
}

class PaymentHistoryFactory {
	static PaymentHistory_Refactoring newNullPaymentHistory() {return new NullPaymentHistory();}
}