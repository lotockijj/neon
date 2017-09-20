package com.patterns.virtualproxy;

public class ProxyExpensiveOperation extends Something{
	private ExpensiveOperation expOper;
	
	@Override
	public String createProduct_C() {
		if(expOper == null){
			expOper = new ExpensiveOperation();
		}
		return expOper.createProduct_C();
	}

}
