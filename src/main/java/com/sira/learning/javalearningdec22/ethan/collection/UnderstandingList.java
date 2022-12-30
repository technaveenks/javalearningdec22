package com.sira.learning.javalearningdec22.ethan.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UnderstandingList {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("iPhone");
		list.add("xbox");
		// System.out.println(list);
		list.add("watch");
		list.add("iPhone");
		list.add("xbox");
		// System.out.println(list);

		// System.out.println(list.get(0));
		// list.remove(0);
		// System.out.println(list);

		// iteration
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// order of the array

		Collections.sort(list);
		System.out.println(list);

	}

}
