package com.sira.learning.javalearningdec22.SudhaVenkat;

public class ArraysExample {

	public static void main(String[] args) {
		int singlevalue = 6;
		System.out.println("We can easily print the value in variable if it has single value like this " + singlevalue);

		// single dimensional int array
		int multiplevalues[] = { 20, 22, 24, 26, 28 };
		System.out.println("The Values in integer array are ");
		for (int i = 0; i < multiplevalues.length; i++) {
			System.out.println(multiplevalues[i]);
		}
		// single-dimensional string array
		String namearray[] = { "sudha", "amma", "nanna" };
		System.out.println("The Values in string type array are ");
		for (int i = 0; i < namearray.length; i++) {
			System.out.println(namearray[i]);

		}

		// multi-dimensional array with integers
		System.out.println("The values in multidimensional array are ");
		int multiint[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 10 }, { 11 } };
		// to display multi-dimensional array we need 2 loops
		for (int i = 0; i < multiint.length; i++)// length=4
		{
			for (int j = 0; j < multiint[i].length; j++) {
				System.out.println(multiint[i][j]);
			}
		}

	}
}
