package com.sira.learning.javalearningdec22.Aruna;

public class UnderstandingMethods {
	
	
	public UnderstandingMethods() {
		System.out.println(" Default Constructor is called ");

	}
	public UnderstandingMethods(String name ) {
		System.out.println(" Constructor is called ");
		System.out.println(" Executor of Program is "+ name);
	}

	public int addition(int fValue, int sValue) {
		/// int firstValue = 10;
		// int secondValue = 20;
		// int addition = firstValue + secondValue;
		int addition = fValue + sValue;
		return addition;
		// System.out.println("Addition of two values are = " + addition);
	}
	
	public int addition(int fValue, int sValue, int tValue) {
		/// int firstValue = 10;
		// int secondValue = 20;
		// int addition = firstValue + secondValue;
		int addition = fValue + sValue + tValue;
		return addition;
		// System.out.println("Addition of two values are = " + addition);
	}

	public void substraction() {
		int firstValue = 10;
		int secondValue = 20;
		int substraction = firstValue - secondValue;
		System.out.println("Substraction of two values are = " + substraction);
	}

	public static void main(String[] args) {
		UnderstandingMethods understandingMethods = new UnderstandingMethods();
		System.out.println("Addition of two values are = " + understandingMethods.addition(26, 46, 76));
		understandingMethods.substraction();
	}

}
