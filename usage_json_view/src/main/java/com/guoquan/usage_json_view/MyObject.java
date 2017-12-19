package com.guoquan.usage_json_view;

import java.util.List;

public class MyObject {

	private int id;
	private String name;
	private String smallObj;
	private List<String> contains; // expensive list with many entries

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSmallObj() {
		return smallObj;
	}

	public void setSmallObj(String smallObj) {
		this.smallObj = smallObj;
	}

	public List<String> getContains() {
		return contains;
	}

	public void setContains(List<String> contains) {
		this.contains = contains;
	}

}
