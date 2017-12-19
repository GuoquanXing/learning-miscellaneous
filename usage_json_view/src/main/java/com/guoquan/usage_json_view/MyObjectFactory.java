package com.guoquan.usage_json_view;

import java.util.ArrayList;
import java.util.List;

public class MyObjectFactory {

	private MyObjectFactory() {

	}

	public static List<MyObject> createMyObjectList(int capacity) {

		List<MyObject> lmo = new ArrayList<MyObject>();
		MyObject mo = new MyObject();

		for (int i = 0; i < capacity; i++) {
			mo.setId(i);
			mo.setName("name of " + i);
			mo.setSmallObj("Small Object" + i);
			List<String> ls = new ArrayList<String>();

			for (int j = 0; j < 3; j++) {
				ls.add("hello" + j);
			}
			mo.setContains(ls);

			lmo.add(mo);
		}

		return lmo;

	}

}
