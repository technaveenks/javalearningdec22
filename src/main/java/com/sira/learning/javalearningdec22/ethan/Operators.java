package com.sira.learning.javalearningdec22.ethan;

public class Operators {

	public static void main(String[] args) {
		// Arithmetic Operators + - * / %
		int firstValue = 10;
		int secondValue = 20;

		int addition = firstValue + secondValue;
		System.out.println("Addition of two values are = " + addition);
		// System.out.println( firstValue + secondValue);

		int substraction = firstValue - secondValue;
		System.out.println("Substraction of two values are = " + substraction);

		// increment & decrement

		int value = 10;

		System.out.println(++value);
		value += value;
		System.out.println(value);

		// Assignment Operator
		int marks = value;
		System.out.println("Marks = " + marks);
		
		// + - * / %
		marks += 3;
		System.out.println(marks);
		
		marks -=3;
		System.out.println(marks);

	}

}