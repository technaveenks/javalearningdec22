package com.sira.learning.javalearningdec22.SudhaVenkat;

public class Operators {

	public static void main(String[] args) {

		int firstnumber = 30;
		int secondnumber = 20;
		int result;

		// Arithmetic Operators =,-,*,/,%
		// + Addition operation
		System.out.println("Arithmetic operators +,-,*,/,%");
		result = firstnumber + secondnumber;
		System.out.println("Addition of " + firstnumber + " and " + secondnumber + " are " + result);

		// - Subtraction operation
		result = firstnumber - secondnumber;
		System.out.println("Subtraction of " + firstnumber + " and " + secondnumber + " are " + result);

		// * Multiplication operation
		result = firstnumber * secondnumber;
		System.out.println("Multiplication of " + firstnumber + " and " + secondnumber + " are " + result);

		// Division operation
		result = firstnumber / secondnumber;
		System.out.println("Division of " + firstnumber + " and " + secondnumber + " are " + result);

		// % Modulo operation
		result = firstnumber % secondnumber;
		System.out.println("Modulo of " + firstnumber + " and " + secondnumber + " are " + result);

		// Unary Operators ++ --

		// ++ Increments value by 1
		// pre-increment
		// firstnumber =30
		System.out.println("Increment/decrement operators ++ --");
		System.out.println("Value in firstnumber before incrementation is " + firstnumber);
		result = ++firstnumber;
		// result=31 firstnumber=31
		System.out.println("After pre-incrementation result = " + result + " firstnumber = " + firstnumber);

		// post increment
		System.out.println("Before post-incrementation firstnumber = " + firstnumber);
		result = firstnumber++;
		// result = 31 firstnumber = 32
		System.out.println("After post-incrementation result = " + result + " firstnumber = " + firstnumber);

		// -- Decrements value by 1
		// pre-decrement firstnumber=32
		System.out.println("Before pre-decrement firstnumber = " + firstnumber);
		result = --firstnumber;
		// result = 31 firstnumber = 31
		System.out.println("After pre-decrement result = " + result + " firstnumber =" + firstnumber);
		// post-decrement firstnumber=31
		System.out.println("Before post-decrement firstnumber = " + firstnumber);
		result = firstnumber--;
		// result = 31 firstnumber = 30
		System.out.println("After post-decrement result = " + result + " firstnumber =" + firstnumber);

		// Relational Operators <,>,<=,>=,==,!=
		// > greater than operation
		System.out.println("Relation operators <,>,<=,>=,==,!=");
		Boolean status;
		status = firstnumber > secondnumber;
		System.out.println("Is " + firstnumber + " > " + secondnumber + " " + status);

		// < lessthan operation
		status = firstnumber < secondnumber;
		System.out.println("Is " + firstnumber + " < " + secondnumber + " " + status);

		// <= lessthan or equal to operation
		status = firstnumber <= secondnumber;
		System.out.println("Is " + firstnumber + " <=  " + secondnumber + " " + status);

		// >= lessthan or equal to operation
		status = firstnumber >= secondnumber;
		System.out.println("Is " + firstnumber + " >=  " + secondnumber + " " + status);

		// == lessthan or equal to operation
		status = firstnumber <= secondnumber;
		System.out.println("Is " + firstnumber + " ==  " + secondnumber + " " + status);

		// != lessthan or equal to operation
		status = firstnumber <= secondnumber;
		System.out.println("Is " + firstnumber + " !=  " + secondnumber + " " + status);

	}

}
