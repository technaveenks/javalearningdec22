package com.sira.learning.javalearningdec22;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class UnderstandingStringBuilder {

	public static void main(String[] args) {

		// String name = "Kumar barath ram naveen"; 
		StringBuilder stringBuilder = new
		StringBuilder();
		stringBuilder.append("Kumar");
		System.out.println(stringBuilder);
		stringBuilder.capacity();

		System.out.println(stringBuilder.capacity());
		stringBuilder.trimToSize();
		System.out.println(stringBuilder.capacity());
		stringBuilder.append("Kumar");
		System.out.println(stringBuilder);
		System.out.println(stringBuilder.capacity());
		stringBuilder.trimToSize();
		System.out.println(stringBuilder.capacity());

		System.out.println(stringBuilder.capacity());
		stringBuilder.trimToSize();
		System.out.println(stringBuilder);
		System.out.println(stringBuilder.capacity());

		System.out.println("Capacity is " + stringBuilder.capacity());
		System.out.println(stringBuilder.charAt(3)); //
		System.out.println(stringBuilder.length());

		Calendar c = new GregorianCalendar(1995, 0, 22);
		System.out.println(" Print date " + c);

		String s = String.format("Duke's Birthday: %1$tB %1$te,%1$tY - %1$tA", c);
		System.out.println(s);
		s = String.format("Duke's Birthday: %1$tb %1$te,%1$ty - %1$ta", c);
		System.out.println(s);

		long value = 100;

		String modValue = Long.toString(value);
		System.out.println(modValue);

		int age = 22;
		// int display = age;
		String ageValue = Integer.toString(age);
		System.out.println(ageValue.getClass());
		age = Integer.valueOf(ageValue);

	}

}
