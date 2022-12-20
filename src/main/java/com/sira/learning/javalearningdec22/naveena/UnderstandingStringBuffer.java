package com.sira.learning.javalearningdec22.naveena;

public class UnderstandingStringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("United");
		System.out.println(sb);
		sb.append("States");
		System.out.println(sb);
		sb.append("of");
		System.out.println(sb);
		sb.append("America");
		System.out.println(sb);
		//Methods
		System.out.println(sb.capacity());
		sb.append("Washington DC");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("   Maryland");
		System.out.println(sb);
		System.out.println(sb.charAt(4));
		System.out.println(sb.charAt(15));
		
		
		
		
		

	}

}
