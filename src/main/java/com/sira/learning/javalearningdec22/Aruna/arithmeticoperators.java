package com.sira.learning.javalearningdec22.Aruna;

public class arithmeticoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value1= 23;
		int value2= 45;
		
		// Addition
		System.out.println("Sum of value1 and value2= "+(value1+ value2));
		
		//subtraction
		System.out.println("subtraction of value1 and value2= "+(value1 - value2));
		
		//multiplication
		System.out.println("multiplication of value1 and value2= "+(value1 * value2));
		
		//division
		System.out.println("Division of value1 and value2= "+(value1 / value2));
		
		//modulus
		System.out.println("modulus of value1 and value2="+(value1 % value2));
		
		// boolean 
		
		boolean b1=true;
		boolean b2=false;
		
		if(value1 < value2)
			System.out.println(b1);
		else
			System.out.println(b2);
		
		//post and pre (incremenmt) and post and pre (decrement)
		System.out.println("post increment of value1= "+(++value1));
		System.out.println("pre incremnt of value1= "+(value1++));
		System.out.println("post decrement of value2="+(--value2));
		System.out.println("pre decrement of value2="+(value2--));
		
		// equality and relational operator
		
		 if(value1 == value2)
	            System.out.println("value1 == value2"); //equal to
		 else System.out.println("value1 != value2"); //not equal to
	        if(value1 > value2)
	            System.out.println("value1 is greater than value2"); // greater than
	        else System.out.println("value1 is less than value2 ");
	        if(value1 >= value2)
	             System.out.println("value1 is greater than value2"); // greater than or equal to
	        else System.out.println("value1 is equal to value2");
	        if(value1 < value2)
	            System.out.println("value1 is less than value2"); // less than
	        else System.out.println("value1 is greater than value2 ");
	        	        
	}

}
