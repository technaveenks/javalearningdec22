package com.sira.learning.javalearningdec22.sandhya;

public class ArithmeticOperatorsExample {
	

	 public static void main( String[] args )
	    {
		 int num1 = 20;
		 int num2 = 10;
		 
		 //aplying Arithmetic operators
		 System.out.println("Sum of two numbers is:"+(num1+num2));
		 System.out.println("Substraction  of two numbers is:"+(num1-num2));
		 System.out.println("Multiplication of two numbers is:"+(num1*num2));
		 System.out.println("Division of two numbers is:"+(num1/num2));
		 System.out.println("Modulus of two numbers is:"+(num1%num2));
		 
		 //aplying increment and decrement operators
		 num1=++num1;
		 System.out.println("pre increment of num1:"+num1);//preincrement
		 num1=num1++;
		 System.out.println("post increment of num1:"+num1);//postincrement
		 num1=--num1;
		 System.out.println("pre decrement of num1:"+num1);//predecrement
		 num1=num1--;
		 System.out.println("post decrement of num1:"+num1);//postdecrement
		 
		 //finding greater value
		 if(num1>num2)
			 System.out.println("greatest values is:"+num1);
		 else
			 System.out.println("greatest value is:"+num2);
			 
		 
	    }

}
