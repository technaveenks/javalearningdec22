package com.sira.learning.javalearningdec22.pavani;

//import com.sira.learning.javalearningdec22.UnderstandingMethods;

public class UsingMethods {
	
	int firstValue = 10;
	int secondValue = 20;
	

	public void addition()
	{
	
		int addition = firstValue + secondValue;
		System.out.println("Addition of two values are = " + addition);
	}
	
	public void substraction() 
	{
		
		int substraction = firstValue - secondValue;
		System.out.println("Substraction of two values are = " + substraction);
	}
	
	public void multiplication()
	{
	
		int multiplication = firstValue * secondValue;
		System.out.println("Multiplication of two values are = " + multiplication);
		
	}
	
	public void division()
	{
		
		int multiplication = firstValue / secondValue;
		System.out.println("Division of two values are = " + multiplication);
	}



	public static void main(String[] args)
	{
			
		UsingMethods usingmethods = new UsingMethods();
		usingmethods.addition();
		usingmethods.substraction();
		usingmethods.multiplication();
		usingmethods.division();
		
				
		
	}
	
	
	
}