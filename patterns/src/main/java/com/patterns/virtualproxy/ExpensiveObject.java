package com.patterns.virtualproxy;

public class ExpensiveObject extends Something{

	@Override
	public String createProduct_C() {
		return "Operation 3 has done some EXPENSIVE job";
	}
	
}
