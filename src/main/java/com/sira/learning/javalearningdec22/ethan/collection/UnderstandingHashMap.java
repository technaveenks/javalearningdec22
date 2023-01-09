package com.sira.learning.javalearningdec22.ethan.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UnderstandingHashMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(60006, "Robin");
		map.put(60009, "John");
		map.put(60009, "Coyote");
		map.put(60010, "Johns");
		System.out.println(map.get(60009));
		Iterator iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry values = (Map.Entry) iterator.next();
			System.out.println(values.getKey() + "----" + values.getValue());
		}

	}

}
