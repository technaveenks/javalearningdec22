package com.sira.learning.javalearningdec22.kalpana;

public class operators {
	public static void main(String[] args) {
		int val1 = 100,val2 = 15, val3;
		boolean val4;
		//Arithmetic operators
		val3 = val1+val2;
		System.out.println("Add = " + val3);
		val3 = val1-val2;
		System.out.println("Sub = " + val3);
		val3 = val1*val2;
		System.out.println("Mul = " + val3);
		val3 = val1/val2;
		System.out.println("Div = " + val3);
		val3 = val1%val2;
		System.out.println("Mod = " + val3);
		if(val1 > val2)
		{val4 = true;}
		else {val4 = false;}
		//compound operators method 1
	    System.out.println( " value " +val1);
		val1 = val1+3;		
		System.out.println("compound add " + val1);
		val1 = val1-3;
		System.out.println("compound sub " + val1);
		val1 = val1*3;
		System.out.println("compound mul " + val1);
		val1 = val1/3;
		System.out.println("compound div " + val1);
		val1 = val1%3;
		System.out.println("compound mod " + val1);
		//compound operators method 2
	    System.out.println( " value " +val1);
		val3 =(val1+=2); 
		System.out.println("compound add " + val3);
		val3 =(val1-=2); 
		System.out.println("compound sub " + val3);
		val3 =(val1*=2); 
		System.out.println("compound mul " + val3);
		val3 =(val1/=2); 
		System.out.println("compound div " + val3);
		val3 =(val1%=2); 
		System.out.println("compound mod " + val3);
		// increment decrement
		val3 = val2++;
		System.out.println("post increment " + val3);
		val3 = ++val2;
		System.out.println("pre increment " + val3);
		val3 = val2--;
		System.out.println("post decrement " + val3);
		val3 = --val2;
		System.out.println("pre decrement " + val3);
				
		
		
	}

}
