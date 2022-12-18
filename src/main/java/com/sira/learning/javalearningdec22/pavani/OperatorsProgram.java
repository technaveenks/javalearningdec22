package com.sira.learning.javalearningdec22.pavani;

public class OperatorsProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=2;		
		
	    num1++;	
		System.out.println("The value using postfix increment operator :" + num1);
		
		++num1;
		System.out.println("The value using prefix increment operator :" + num1);
		
		num1--;
		System.out.println("The value using decrement operator :" + num1);
		
		--num1;
		System.out.println("The value using prefix decrement operator :" + num1);		
		
		int num2 =2;
		System.out.println("The value using postfix increment operator :" + num2++);
		System.out.println("The value using prefix increment operator :" + ++num2);
		System.out.println("The value using postfix increment operator :" + num2++);
		System.out.println("The value using postfix increment operator :" + ++num2);
		
		System.out.println("The value using prefix increment operator :" + num2--);
		System.out.println("The value using prefix increment operator :" + --num2);
		System.out.println("The value using prefix increment operator :" + num2--);
		System.out.println("The value using prefix increment operator :" + --num2);
		
		
		
		
		// implementing arithmetic operators.
		
		int Result=20;
	
		
		Result += 5;
		System.out.println("Result of arthimetic addition combination" + Result);
				
		Result -=5;		
				
		System.out.println("Result of arthimetic substraction combination" + Result);
		
		Result*=5;
		
		System.out.println("Result of arthimetic multiplication combination" + Result);
		
		Result/=5;
		System.out.println("Result of arthimetic division combination" + Result);
		
		Result%=5;
		System.out.println("Result of arthimetic multiplication combination" + Result);
				
		
		
	}

}
