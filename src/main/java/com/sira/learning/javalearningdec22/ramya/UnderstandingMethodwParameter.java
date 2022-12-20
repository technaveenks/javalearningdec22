package com.sira.learning.javalearningdec22.ramya;

public class UnderstandingMethodwParameter {

	public int add(int fvalue, int svalue ) {
		
		int add = fvalue + svalue;
		
		return add;
	}
	
	public int substraction(int fvalue, int svalue) {
		
		int substraction = fvalue + svalue;
		return substraction;
	}
		
		public int multiplication(int fvalue, int svalue) {       
			
			int multiplication= fvalue * svalue;
			//System.out.println("Multiplication of two values are = " + multiplication);
			return multiplication;
	}
		public int division(int fvalue, int svalue) {
			
			int division= fvalue / svalue;
			//System.out.println("Multiplication of two values are = " + division);
			return division;
	}
		public int mod(int fvalue, int svalue) {
			
			int mod= fvalue % svalue;
			              
			return mod;
	}
	public static void main(String[] args) {
		
		
		UnderstandingMethodwParameter UnderstandingmethodwParameter = new UnderstandingMethodwParameter();
		System.out.println("Addition of two values are = " +UnderstandingmethodwParameter.add(20,10));
		System.out.println("substraction of two values=" +UnderstandingmethodwParameter.substraction(32,14));
		System.out.println("Multiplication of two values are = " +UnderstandingmethodwParameter.multiplication(34,12));
		System.out.println("Multiplication of two values are = "+UnderstandingmethodwParameter.division(12,4));
		System.out.println("Mod of two values are = "+UnderstandingmethodwParameter.mod(12,13));
		
	}
}

