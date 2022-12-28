package com.sira.learning.javalearningdec22.SudhaVenkat;

public class ClassEcommerce extends AbstractItem implements IAddToCart, IConfirmPurchase {

	@Override
	public void shoe() {
		System.out.println("Sketchers shoe will give lot of comfort");

	}

	@Override
	public void clothing() {
		System.out.println("Carters brand clothes are very good for kids and babies");

	}

	@Override
	public void kitchen() {

		System.out.println("Using branded utensils makes easy cooking");
	}

	@Override
	public void confirmpurchase() {
		System.out.println("If you are ready to purchase please confirm the transaction");

	}

	@Override
	public void addtocart() {
		System.out.println("Add to the cart if you like it");

	}

	public static void main(String[] args) {
		ClassEcommerce ceobj = new ClassEcommerce();
		ceobj.shoe();
		ceobj.clothing();
		ceobj.kitchen();
		ceobj.washroom();
		ceobj.addtocart();
		ceobj.confirmpurchase();

	}

}
