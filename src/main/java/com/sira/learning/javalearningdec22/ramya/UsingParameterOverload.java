package com.sira.learning.javalearningdec22.ramya;

public class UsingParameterOverload {

public int add(int fvalue, int svalue ) {
		
		int add = fvalue + svalue;
		
		return add;
	}
public int add(int fvalue, int svalue, int tvalue ) {
	
	int add = fvalue + svalue+ tvalue;
	
	return add;
}
	public int substraction(int fvalue, int svalue) {
		
		int substraction = fvalue - svalue;
		return substraction;
	}
public int substraction(int fvalue, int svalue, int tvalue) {
		
		int substraction = fvalue - svalue-tvalue ;
		return substraction;
	}
		
		public int multiplication(int fvalue, int svalue) {       
			
			int multiplication= fvalue * svalue;
			//System.out.println("Multiplication of two values are = " + multiplication);
			return multiplication;
	}
	public int multiplication(int fvalue, int svalue, int tvalue) {       
			
			int multiplication= fvalue * svalue *tvalue;
			//System.out.println("Multiplication of two values are = " + multiplication);
			return multiplication;
	}
		public int division(int fvalue, int svalue) {
			
			int division= fvalue / svalue;
			//System.out.println("Multiplication of two values are = " + division);
			return division;
	}
public int division(int fvalue, int svalue, int tvalue) {
			
			int division= fvalue / svalue;
			//System.out.println("Multiplication of two values are = " + division);
			return division;
	}public int mod(int fvalue, int svalue) {
			
			int mod= fvalue % svalue;
			              
			return mod;
	}
public int mod(int fvalue, int svalue, int tvalue) {
			
			int mod= fvalue % svalue;
			              
			return mod;
	}
	public static void main(String[] args) {
		
		
		UsingParameterOverload usingparameteroverload = new UsingParameterOverload();
		System.out.println("Addition of two values are = " +usingparameteroverload.add(20,10));
		System.out.println("Addition of 3 values are = " +usingparameteroverload.add(20,10,11));
		System.out.println("substraction of two values=" +usingparameteroverload.substraction(32,14));
		System.out.println("substraction of 3 values=" +usingparameteroverload.substraction(32,10,2));
		System.out.println("Multiplication of two values are = " +usingparameteroverload.multiplication(34,12));
		System.out.println("Multiplication of 3 values are = " +usingparameteroverload.multiplication(34,12,34));
		System.out.println("Division of two values are = "+usingparameteroverload.division(12,4));
		System.out.println("Division of 3 values are = "+usingparameteroverload.division(12,4,32));
		System.out.println("Mod of two values are = "+usingparameteroverload.mod(12,13));
		System.out.println("Mod of 3 values are = "+usingparameteroverload.mod(12,13,10));
		
	}
}


