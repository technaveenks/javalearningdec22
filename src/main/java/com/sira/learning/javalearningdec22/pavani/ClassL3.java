package com.sira.learning.javalearningdec22.pavani;

public class ClassL3 extends ClassL1{
	
	public void Method1CL3(){
		
		System.out.println("Method1CL3 from classL3");
		
	}
	public void Method2CL3(){
		
		System.out.println("Method2CL3 from classL3");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassL3 cl3 = new ClassL3();
		cl3.Method1CL3();
		cl3.Method2CL3();
		
		cl3.Method1CL1();
		cl3.Method2CL1();
	}

}
