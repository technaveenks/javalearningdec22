package com.sira.learning.javalearningdec22;

public class UnderstandingArray {
	
	public static void main(String[] args) {
		
		int z = 10;
		//System.out.println(z);

		int[] value = { 10, 11, 12, 32, 32, 21 };
		//System.out.println(value[2]);

		for (int d = 0; d < value.length; d++) {
			System.out.println(value[d]);
		}

		
		  // int[] number = { 1, 2, 4, 5, 3, 7, 8, 9 }; int[] number = { 1, 2, 4};
		  int[] numbers = { 1, 2, 4 };
		  
		  String[] names = { "Ram", "Raghav", "Robert" };
		  
		  // System.out.println(number.length);
		  
		  // System.out.println(number[2]); //System.out.println(names[3]);
		  
		  for (int x = 0; x < names.length; x++) {
		  System.out.println(" The value of name is " + names[x]); }
		 

		
		int[][] number = { { 1, 2, 4 }, { 1, 2, 3 }, { 3, 5, 7 }, { 2, 3 }, { 2, 4, 3, 2, 1 } };
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
				System.out.println(" the values in array are " + number[i][j]);

			}
		}
	}

}
