package com.patterns.car;

import java.util.HashMap;
import java.util.Map;

public class CAR {
	private static CAR instance;
	private Map<String, Object> groups;
	
	private CAR(){
		groups = new HashMap<>();
	}
	
	public synchronized static CAR getInstance(){
		if(instance == null){
			instance = new CAR();
		}
		return instance;
	}
	
	public void add(String group, String key, Object value){
		if (groups.get(group) == null){
			groups.put(group, new CARGroup(group));
		}
		((CARGroup) groups.get(group)).add(key, value);
	}
	
	public Object getAttribute(String group, String key){
		CARGroup carGroup = (CARGroup) groups.get(group);
		if (carGroup == null){
			return null;
		}
		return carGroup.getAttribute(key);
	}
}