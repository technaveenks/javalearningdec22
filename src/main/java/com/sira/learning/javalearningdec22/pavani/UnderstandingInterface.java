package com.sira.learning.javalearningdec22.pavani;

//import com.sira.learning.javalearningdec22.ethan.IAdvCalculator;
import com.sira.learning.javalearningdec22.ethan.ICalculator;

public class UnderstandingInterface implements ICalculator,IAdvCalculator{

	
	@Override
	public void addition() {
		System.out.println("Addition");
		
	}

	@Override
	public void substraction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void multiplication() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void division() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modulo() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnderstandingInterface UI = new UnderstandingInterface();
		UI.addition();

	}

}
