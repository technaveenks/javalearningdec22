package com.sira.learning.javalearningdec22.rama;

public class Operators {

	public static void main(String[] args) 
	
	{
    	System.out.println( "Hi.. This is Rama" );  
    	int num1=30;
    	int num2=10;
    	int val=0;
    	
    	//Addition
    	val = num1+num2;
    	val+=val;
    	System.out.println("value : " +val);
    	
    	//Subtraction
    	val = num1-num2; //20
    	val-= num2;
    	System.out.println("value : " +val);
    	System.out.println("num2 : " +num2);
    	
    	//Multiplication
    	val = num1*num2; //300
    	num2*=val;
    	System.out.println("value : " +val);
    	System.out.println("num2 : " +num2);
    	
    	//Division
    	val = num2/num1; 
    	if (val >=0)
    		{
    		System.out.println("Value is greater than zero");
    	num2/= num1;
    	System.out.println("value : " +val);
    	System.out.println("num2 : " +num2);
    	}
    	else
    	{
    		System.out.println("Value is less than zero");
    	}
    	
    

	}

}
