package com.sira.learning.javalearningdec22.ethan.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UnderstandingSets {
	
	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add("xbox");
		set.add("iPhone");
		
		System.out.println(set);
		
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
