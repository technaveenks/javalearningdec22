package com.sira.learning.javalearningdec22.ramya;

public class ClassL2 extends ClassL1 {
	public static void Method1CL2()
	{
		System.out.println("Method1 CL2 from classL2");
	}
	public void Method2CL2()
	{
		System.out.println("Method1 CL1 from classL2");
	}

	public static void main(String[] args) {
		ClassL2 classl2=new ClassL2();
		ClassL2. Method1CL2();
		ClassL2. Method1CL2();
		classl2.Method1CL1();
		classl2.Method2CL1();
		

	}

}
