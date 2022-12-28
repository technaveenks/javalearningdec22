package com.sira.learning.javalearningdec22.Madhavi;

public class UnderstandingMethods {
	int firstvalue = 10;
	int secondvalue = 20;
	
	public void addition() {
		
		int addition =firstvalue + secondvalue;
		System.out.println("Addition of two values are ="+addition);
	}
		
	public void substraction1() {
		
		int substraction = firstvalue - secondvalue ;
		System.out.println("Substraction of two values are ="+ substraction);

	}
	public void Multiplication1() {
		
		int multiplication = firstvalue * secondvalue ;
		System.out.println("Multiplication of two values are ="+ multiplication);
	}

		public void Division11() {
			
			int division1 = firstvalue / secondvalue ;
			System.out.println("Division of two values are ="+ division1);
		
		}	
			public void Mod1() {
				
				int Mod1 = firstvalue * secondvalue ;
				System.out.println("Mod of two values are ="+ Mod1);
			}
	
	public static void main(String[] args) {
		UnderstandingMethods  understandingMethods = new UnderstandingMethods();
		understandingMethods.addition();
		understandingMethods.substraction1();
		understandingMethods.Multiplication1();
		understandingMethods.Division11();
		understandingMethods.Mod1();

	}
		
	
	
		
	

	
		// Method with parameter
	
		public void addition(int fValue, int sValue ) {
			int A =firstvalue + secondvalue;
			
		}
			public static void main1(String[] args, String addition) {
			UnderstandingMethods  understandingMethods = new UnderstandingMethods();
			understandingMethods.addition(28,46);
			System.out.println("Addition of two values are ="+addition);
			
			}
			
		
		
		
			
			//Method with Return
			
			public int addition1 (int fValue1, int sValue1   ) {
			int addition = fValue1 + sValue1;
		    return addition ;
			
			}
			
			public static void main1(String[] args) {
				
				UnderstandingMethods  understandingMethods = new UnderstandingMethods();
				String addition1 = null;
				understandingMethods.addition1(28,46);
				System.out.println("result = "+ addition1 );
				}		
			
			// Method overload
			 
			public int addition1 (int fValue1, int sValue1 , int tValue1 ) {
				int addition = fValue1 + sValue1 +tValue1 ;
			    return addition ;
			}
				
			    public static void main2(String[] args, String addition) {
					
			//UnderstandingMethods  understandingMethods = new UnderstandingMethods();
			
			    	System.out.println("result="+addition);
		  }
				
}
		
