package com.patterns.car;

import java.util.HashMap;
import java.util.Map;

public class CARGroup {
	private String name;
	private Map<Object, Object> attributes;
	
	public CARGroup(String name) {
		this.setName(name);
		attributes = new HashMap<>();
	}
	
	public void add(String key, Object value){
		attributes.put(key, value);
	}
	
	public Object getAttribute(String key){
		return attributes.get(key);
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}