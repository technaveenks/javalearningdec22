package com.sira.learning.javalearningdec22.sandhya;

public class ECommerce extends ItemsClass implements AddToCart,ConfirmPurchasesInterface{

	public static void main(String[] args) {
		
		ECommerce obj = new ECommerce();
		obj.cloths();
		obj.books();
		obj.food();
		obj.toys();
		obj.addItemsToCart();
		obj.confirmPurchase();
}

	@Override
	public void food() {
		System.out.println("add food items");		
	
	}

	@Override
	public void toys() {
		System.out.println("add toys");		

	}

	@Override
	public void books() {
		System.out.println("add books");		

	}

	@Override
	public void cloths() {
		System.out.println("add cloths");		

	}

	@Override
	public void addItemsToCart() {
		System.out.println("add your items to cart");		
	
	}

	@Override
	public void confirmPurchase() {
		System.out.println("confirm your purchase");		
	}


}