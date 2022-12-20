package com.sira.learning.javalearningdec22.SudhaVenkat;

public class StringBufferClass {

	public static void main(String[] args) {
		StringBuffer sbobject= new StringBuffer();
		//append method in StringBuffer class
		sbobject.append(" Advanced String Class ");
		System.out.println(sbobject);
		sbobject.append(" in StringBuffer");
		System.out.println("appending one string with another string"+sbobject);
		//insert method in StringBuffer class
		//inserts given string at given position or index
		sbobject.insert(0,"contains more methods");
		System.out.println(sbobject);
		//replace method
		sbobject.replace(22, 30, "than");
		System.out.println(sbobject);
		//delete method
		sbobject.delete(41, 43);
		System.out.println(sbobject);
		//reverse method in StringBuffer class
		sbobject.reverse();
		System.out.println(sbobject);
		

	}

}

