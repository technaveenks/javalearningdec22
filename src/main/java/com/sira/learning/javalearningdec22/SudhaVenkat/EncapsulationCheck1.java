package com.sira.learning.javalearningdec22.SudhaVenkat;

import java.lang.reflect.Method;

public class EncapsulationCheck1 {

	public static void main(String[] args) throws Exception
	// IllegalAccessException, InvocationTargetException, NoSuchMethodException,
	// SecurityException
	{
		EncapsulationCheck encapcheck = new EncapsulationCheck();
		// we can not access private variable or method from EncapsulationCheck Class
		// it will throw error
		// System.out.println(encapcheck.privatenum());
		// encapcheck.privatemethodaccess();
		System.out.println("accessing default number from EncapsulationCheck class = " + encapcheck.defaultnum);
		encapcheck.defaultmethodaccess();

		// To access the private variable from EncapsulationCheck Class
		// need to create getter and setter methods in Encapsulation Class
		// from these methods we can access private variable
		encapcheck.setPrivatenum(30);
		System.out.println("accessing Private variable declaration from EncapsulationCheck Class using getter method "
				+ encapcheck.getPrivatenum());

		// Accessing private method from EncapsulationCheck class using java reflection
		// package getDeclarationMethod()
		Method m = EncapsulationCheck.class.getDeclaredMethod("privatemethodaccess");
		m.setAccessible(true);
		m.invoke(encapcheck);
	}

}
