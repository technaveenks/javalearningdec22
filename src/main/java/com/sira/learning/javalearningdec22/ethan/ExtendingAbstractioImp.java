package com.sira.learning.javalearningdec22.ethan;

public class ExtendingAbstractioImp extends UnderstandingAbstraction {

	@Override
	public void substraction() {
		int x = 20, y = 40;
		int z = x-y;
		System.out.println(z);
		
	}
	
	public static void main(String[] args) {
		ExtendingAbstractioImp ex = new ExtendingAbstractioImp();
		ex.substraction();
	}

}
