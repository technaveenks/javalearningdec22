package com.sira.learning.javalearningdec22.ethan;

public class UndestandingAbstractionImpl extends UnderstandingAbstraction{
	

	@Override
	public void substraction() {
		System.out.println(" Substraction method from child class - Abstraction Implementation Class ");
	}

	/*
	 * @Override public void addition() { System.out.
	 * println(" Addition method from child class - Abstraction Implementation Class "
	 * ); }
	 */
	

	public static void main(String[] args) {
		UndestandingAbstractionImpl uAbstractImp = new UndestandingAbstractionImpl();
		uAbstractImp.addition();
		uAbstractImp.substraction();
			
			
	}
	

}
