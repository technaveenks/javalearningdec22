package com.sira.learning.javalearningdec22.ramya;

public class ClassL3 extends ClassL2 {
	public static void Method1CL3 ()
	{
		System.out.println("Method1 CL2 from classL2");
	}
	public void Method2CL3()
	{
		System.out.println("Method1 CL1 from classL2");
	}


	public static void main(String[] args) {
		ClassL3 classl3=new ClassL3();
		ClassL3.Method1CL3();
		classl3.Method2CL3();
		classl3.Method1CL1();
		classl3.Method2CL1();
		ClassL2.Method1CL2();
		classl3.Method2CL2();
		

	}

}
