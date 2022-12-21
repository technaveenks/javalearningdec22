package com.sira.learning.javalearningdec22.ethan;

public class UnderstandingTypeCasting {
	
		static int number=10;
		
		public static void addition() {
			int num1 = 10;
			int num2 = 20;
			float sum = num1+num2;
			float newValue = 3.67f;
			float summation = sum+newValue;
			System.out.println(summation);
			
			int cValue = (int)summation;
			System.out.println(cValue);
			
			double dValue = summation;
			System.out.println("D Value "+dValue);
			float fValue = (float)dValue;
			System.out.println("Float Value "+ fValue);
			
			/*
			 * int data = (int)sum;
			 * 
			 * int value = (int)sum;
			 * 
			 * int total = num1 + num2; System.out.println(" addition of two numbers are " +
			 * total); System.out.println(" Number = "+ number); number = number+5;
			 */
		}
		
		static {
			System.out.println(" This is static block");
			number = number+5;
		}

		public static void main(String[] args) {
			
			addition();
			//System.out.println(" Number = "+ number);
			

		}
		
		public static class arithmetic{
			
		}
	

}
