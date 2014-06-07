/**   
 * @Title: ReplaceParameterWithMethod.java 
 * @Package org.brilliance.refactoring.method 
 * @Description: TODO
 * @author PAI LI   
 * @date 2014-6-7 下午5:08:46 
 * @version V1.0   
 */
package org.brilliance.refactoring.method;

/**
 * @author PAI LI
 * 
 */
public class ReplaceParameterWithMethod {

	private static int _itemPrice;
	private static int _quantity;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int basePrice = _quantity * _itemPrice;
		double discountLevel = getDiscountLevel();
		double finalPrice = discountedPrice(basePrice, discountLevel);

		// refactoring
		double finalPrice_refactoring = discountedPrice(
				totalPrice(_itemPrice, _quantity), getDiscountLevel());

		assert finalPrice == finalPrice_refactoring;
	}

	public static double getPrice() {
		int basePrice = _quantity * _itemPrice;
		int discountLevel;
		if (_quantity > 100)
			discountLevel = 2;
		else
			discountLevel = 1;
		double finalPrice = discountedPrice(basePrice, discountLevel);
		return finalPrice;
	}

	public static double getPrice_refactoring() {
		return (getDiscountLevel() == TOP_DISCOUNT_LEVEL)?
				totalPrice(_itemPrice, _quantity) * TOP_DISCOUNT_RATE :
					totalPrice(_itemPrice, _quantity) * NORMAL_DISCOUNT_RATE;
	}

	private static final int TOP_DISCOUNT_LEVEL = 2;
	private static final int NORMAL_DISCOUNT_LEVEL = 1;
	private static final double TOP_DISCOUNT_RATE = 0.1;
	private static final double NORMAL_DISCOUNT_RATE = 0.05;
	private static final int QUANTITY_THRESHOLD = 100;
	
	private static double discountedPrice(int basePrice, double discountLevel) {
		if (discountLevel == TOP_DISCOUNT_LEVEL)
			return basePrice * TOP_DISCOUNT_RATE;
		else
			return basePrice * NORMAL_DISCOUNT_RATE;
	}

	private static double getDiscountLevel() {
		return _quantity > QUANTITY_THRESHOLD ? TOP_DISCOUNT_LEVEL : NORMAL_DISCOUNT_LEVEL;
	}

	private static int totalPrice(int itemPrice, int quantity) {
		return itemPrice * quantity;
	}

}
