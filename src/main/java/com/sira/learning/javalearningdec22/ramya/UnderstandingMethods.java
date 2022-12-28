package com.sira.learning.javalearningdec22.ramya;

public class UnderstandingMethods {
	
	int firstValue = 10;
	int secondValue = 20;
	
	public void addition() {
		
		int addition = firstValue + secondValue;
		System.out.println("Addition of two values are = " + addition);
	}
	
	public void substraction() {
		
		int substraction = firstValue - secondValue;
		System.out.println("Substraction of two values are = " + substraction);
	}
		
		public void Multiplication() {
			
			int multiplication= firstValue * secondValue;
			System.out.println("Multiplication of two values are = " + multiplication);
			
	}
		public void Division() {
			
			int division= firstValue / secondValue;
			System.out.println("Multiplication of two values are = " + division);
			
	}
		public void Mod() {
			
			int mod= firstValue % secondValue;
			System.out.println("Mod of two values are = " + mod);
			
	}
	public static void main(String[] args) {
		
		
		UnderstandingMethods understandingMethods = new UnderstandingMethods();
		understandingMethods.addition();
		understandingMethods.substraction();
		understandingMethods.Multiplication();
		understandingMethods.Division();
		understandingMethods.Mod();
		
	}

	}

	
	

	
	


