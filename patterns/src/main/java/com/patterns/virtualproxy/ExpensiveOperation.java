package com.patterns.virtualproxy;

public class ExpensiveOperation extends Something {
	private ExpensiveObject expObj;
	
	public ExpensiveOperation() {
		super();
		expObj = new ExpensiveObject();
	}


	@Override
	public String createProduct_C() {
		return expObj.createProduct_C();
	}

}
