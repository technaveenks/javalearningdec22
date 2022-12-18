package com.sira.learning.javalearningdec22.harika;

//
public class MathOperations {

	private static int num1 = 5;
	private static int num2 = 3;
	public static void main(String[] args) {
		
// harika is changing from Temp Location..
		// TODO Auto-generated method stub
		System.out.println("just started my java programming...");
		
		System.out.println("Calling addition..." + Add(num1,num2));
		System.out.println("Calling subtraction..." + Subtraction(num1,num2));
		System.out.println("Calling Multiplication..." + Multiply(num1,num2));
		System.out.println("Calling addition..." + Add());
	}
	
	public static int Add(int number1, int number2) {
		//System.out.println("Adding two number...");
		int total = number1+number2;
		return total;
	}
	public static int Add() {
		//System.out.println("Adding two number...");
		int total = num1+num2;
		return total;
	}
	
public static int Subtraction(int number1, int number2) {
	//System.out.println("Subtracting two number...");
		int result = number1-number2;
		return result;
	}
public static int Multiply (int number1, int number2) {
	//System.out.println("Multiplying two number...");
	int result = number1*number2;
	return result;
}

}
