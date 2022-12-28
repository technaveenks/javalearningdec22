package com.sira.learning.javalearningdec22.pavani;

import java.util.Scanner;

public class UsingMethods {
	
		
	int firstValue;
	int secondValue;
	int thirdValue;
	int addition,substraction,multiplication,division;
	
	

	public void addition(int fvalue,int svalue)
	{
	
		//addition = firstValue + secondValue;
		addition = fvalue+svalue;
		
		System.out.println("Addition of two values are = " + addition);
	}
	
	public int addition1(int fvalue,int svalue)
	{
	
		//addition = firstValue + secondValue;
	 addition = fvalue+svalue;
		return addition;
		//System.out.println("Addition of two values are = " + addition);
	}
	
	public int addition1(int fvalue,int svalue,int tvalue)
	{
	
		//addition = firstValue + secondValue;
	 addition = fvalue+svalue+tvalue;
		return addition;
		//System.out.println("Addition of two values are = " + addition);
	}
	public void substraction(int fvalue,int svalue) 
	{
		
		//substraction = firstValue - secondValue;
		
		substraction = fvalue-svalue;
		System.out.println("Substraction of two values are = " + substraction);
	}
	public int  substraction1(int fvalue,int svalue) 
	{
					
		substraction = fvalue-svalue;
		return substraction;
		
	}
	public int  substraction1(int fvalue,int svalue,int tvalue) 
	{
					
		substraction = fvalue-svalue - tvalue;
		return substraction;
		
	}
	
	public void multiplication(int fvalue,int svalue)
	{
	
		// multiplication = firstValue * secondValue;
		multiplication = fvalue * svalue;
		System.out.println("Multiplication of two values are = " + multiplication);
		
	}
	
	public int  multiplication1(int fvalue,int svalue)
	{
	
		multiplication = fvalue * svalue;
		return multiplication;
		
		
	}
	public int  multiplication1(int fvalue,int svalue,int tvalue)
	{
	
		multiplication = fvalue * svalue * tvalue;
		return multiplication;
		
		
	}
	
	public void division(int fvalue,int svalue)
	{
			
		division = fvalue / svalue;
		System.out.println("Division of two values are = " + division);
	}

	public int division1(int fvalue,int svalue)
	{
			
		division = fvalue / svalue;
		return division;
		
	}
	public int division1(int fvalue,int svalue,int tvalue)
	{
			
		division = (fvalue / svalue)/tvalue;
		return division;
		
	}

	

	public static void main(String[] args)
	{
			
		UsingMethods usingmethods = new UsingMethods();
		Scanner sc= new Scanner(System.in);   
		System.out.println("Enter First Number:");  
		int num1= sc.nextInt();                 
		      
		System.out.println("");	
		
		System.out.println("Enter Second Number:");
		int num2= sc.nextInt();               
		
		System.out.println("");
		
		usingmethods.addition(num1,num2);
		usingmethods.addition(5,6);
		usingmethods.substraction(8,10);
		usingmethods.multiplication(5,7);
		usingmethods.division(10,2);
		
		
		System.out.println("Results using twoparameters");
		System.out.println("Addition of two value " + usingmethods.addition1(5, 6));
		System.out.println("Subraction of two value " + usingmethods.substraction1(5, 6));
		System.out.println("Multiplication of two value " + usingmethods.multiplication1(5, 6));
		System.out.println("Division of two value " + usingmethods.division1(num1,num2));
		
		System.out.println("Operators with three parameters");
		System.out.println("Addition of three value " + usingmethods.addition1(5,6,8));
		System.out.println("Subraction of three value " + usingmethods.substraction1(10, 2,6));
		System.out.println("Multiplication of two value " + usingmethods.multiplication1(5, 6,8));
		System.out.println("Division of two value " + usingmethods.division1(10,2,1));
		
				
		
	}
	
	
	
}