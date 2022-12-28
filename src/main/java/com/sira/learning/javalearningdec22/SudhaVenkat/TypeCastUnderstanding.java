package com.sira.learning.javalearningdec22.SudhaVenkat;

public class TypeCastUnderstanding {

	public static void main(String[] args) {

		// Up-casting while doing up-casting there is no risk of loosing the data i.e
		// text/number
		// since we are moving the smaller container/size to larger container/size
		int num1 = 10;
		int num2 = 20;
		int sum = num1 + num2;

		// converting the variable sum to float

		System.out.println("Addition of 2 numbers before upcasting " + sum);
		// while doing up-casting no need to specify the data-type
		// we can directly assign the variable to up-casted variable
		// conversion happens implicitly
		float fsum = sum;
		System.out.println("Addition of 2 number after upcasting " + fsum);

		// Down-casting
		// since we are pouring big container data into small container
		// there is chance of spilling the data or loosing the data

		double var1 = 10.2;
		int var2 = (int) var1;
		System.out.println("After downcasting double variable with value 10.2 to integer output is " + var2);

	}

}
