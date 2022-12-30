package com.sira.learning.javalearningdec22.pavani;

public class ClassL2 extends ClassL1 {
	
	 public void Method1CL2(){
			
			System.out.println("Method1CL2 from classL2");
			
		}

	 public void Method2CL2(){
			
			System.out.println("Method2CL2 from classL2");
			
		}

	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassL2 cl2 = new ClassL2();
		cl2.Method1CL2();
		cl2.Method2CL2();
		
		cl2.Method1CL1();
		cl2.Method2CL1();
		
	}

}
