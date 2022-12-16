package com.sira.learning.javalearningdec22.divya;

public class operatorsdivya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//data types and operators
		int num1 = 2;
		int num2 = 7;
		int num3 = 8;
		int result;
		result = (num1+num2)-num3;
		System.out.println("value equals to =" +result);
	    result = (num1-num2)+num3;
		System.out.println("value equals to =" +result);
		result = num1*num2*num3;
		System.out.println("value equals to =" +result);
		result = (num1/num2)*num3;
		System.out.println("value equals to =" +result);
		result = num1%num2;
		System.out.println("value equals to =" +result);
		//exponents		
		System.out.println(Math.pow(num1,num2));
		double num4 = num1/(double)num2;
		System.out.println(num4);
		
		//conditions (==,<,>,=<,=>,!=) and booleans( true or false)
		boolean compare = num1>num2;
		System.out.println(compare);
		
		boolean compare2 = num1<num2&&num2>num3;
		System.out.println(compare2);
		
		boolean compare3 = num1<num2||num2>num3;
		System.out.println(compare3);

	}

}
