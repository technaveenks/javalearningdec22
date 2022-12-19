package com.sira.learning.javalearningdec22.sandhya;

public class MethodOverloading {
	
	int x;
	public int addition(int a,int b)
	{
		 x = a+b;
		return x;
		
	}
	public int addition(int a,int b, int c)
	{
		 x = a+b+c;
		return x;
		
	}
	
	public int sub(int a, int b)
	{
		 x = a-b;
		return x;

	}
	public int sub(int a, int b,int c)
	{
		 x = (a-b)-c;
		return x;

	}
	public int multiplication(int a, int b)
	{
		
		 x = a*b;
		return x;

	}
	public int multiplication(int a, int b,int c)
	{
		 x = a*b*c;
		return x;
	}
	public int division(int a, int b)
	{
		
		 x = a/b;
		return x;

	
	}
	public int division(int a, int b,int c)
	{
		
		 x = a/b;
		return x;

	
	}
	public int modulus(int a, int b)
	{
		
		x = a%b;
		return x;

	}
	public int modulus(int a, int b,int c)
	{
		
		x = a%b;
		return x;

	}
	
public static void main(String[] args) {
		
		
	MethodOverloading methodOverloading = new MethodOverloading();
		
		System.out.println("addition of two numbers is:"+methodOverloading.addition(44,28));
		System.out.println("addition of three numbers is:"+methodOverloading.addition(44,28,10));

		System.out.println("sub of two numbers is:"+methodOverloading.sub(94,36));
		System.out.println("sub of three numbers is:"+methodOverloading.sub(94,36,100));

		System.out.println("multiplication  of two numbers is:"+methodOverloading.multiplication(2,4));
		System.out.println("multiplication  of three numbers is:"+methodOverloading.multiplication(2,3,2));

		System.out.println("division of two numbers is:"+methodOverloading.division(40,80));
		System.out.println("division of three numbers is:"+methodOverloading.division(40,80,100));

		System.out.println("modulus of two numbers is:"+methodOverloading.modulus(200,100));
		System.out.println("modulus of three numbers is:"+methodOverloading.modulus(200,100));

}

}
