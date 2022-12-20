package com.sira.learning.javalearningdec22;

public class UnderstandingMethods {
	
	public UnderstandingMethods() {
		System.out.println(" this is constructor ");
	}

	public void addition() {
		int firstValue = 10;
		int secondValue = 20;
		int addition = firstValue + secondValue;
		System.out.println("Addition of two values are = " + addition);
	}
	
	public void substraction() {
		int firstValue = 10;
		int secondValue = 20;
		int substraction = firstValue - secondValue;
		System.out.println("Substraction of two values are = " + substraction);
	}

	public static void main(String[] args) {
		UnderstandingMethods understandingMethods = new UnderstandingMethods();
		understandingMethods.addition();
		understandingMethods.substraction();
	}

}
