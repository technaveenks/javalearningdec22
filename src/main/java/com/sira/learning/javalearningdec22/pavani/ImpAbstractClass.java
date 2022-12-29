package com.sira.learning.javalearningdec22.pavani;

public class ImpAbstractClass extends UnderstandingAbstraction {
	

	public static void main(String[] args)
	    {
			
			ImpAbstractClass iacl = new ImpAbstractClass();
			iacl.addition();
			iacl.substraction();
			iacl.multiplication();
			iacl.division();
			iacl.module();		
		
		}
	

	@Override
	public void addition()
	{
		
		System.out.println("Addition method from child class -- Implementing Abstraction");
		
	}

	@Override
	public void substraction() {
		// TODO Auto-generated method stub
		System.out.println("Substraction method from child class -- Abstraction Implementation Class");
		
	}

	@Override
	void multiplication() {
		// TODO Auto-generated method stub
		
	}

}
