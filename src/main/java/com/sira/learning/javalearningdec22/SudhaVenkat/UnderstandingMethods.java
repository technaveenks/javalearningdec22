package com.sira.learning.javalearningdec22.SudhaVenkat;

public class UnderstandingMethods {

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
	public void multiplication() {
		int firstValue = 10;
		int secondValue = 20;
		int multiplication = firstValue * secondValue;
		System.out.println("Multiplication of two values are = " + multiplication);
	}
	public void division() {
		int firstValue = 10;
		int secondValue = 20;
		int division = firstValue / secondValue;
		System.out.println("Division of two values are = " + division);
	}
	public void modulo() {
		int firstValue = 10;
		int secondValue = 20;
		int modulo = firstValue % secondValue;
		System.out.println("modulo of two values are = " + modulo);
	}
	
	

	public static void main(String[] args) {
		UnderstandingMethods understandingMethods = new UnderstandingMethods();
		understandingMethods.addition();
		understandingMethods.substraction();
		understandingMethods.division();
		understandingMethods.modulo();
	}

}
