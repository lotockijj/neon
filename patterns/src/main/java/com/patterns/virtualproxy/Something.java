package com.patterns.virtualproxy;

public abstract class Something {
	private Operation1 operation1;
	private Operation2 operation2;
	
	public Something() {
		operation1 = new Operation1();
		operation2 = new Operation2();
	}

	public String createProduct_A(){
		return operation1.createSomething();
	}
	
	public String createProduct_B(){
		return operation2.createSomthing();
	}
	
	public abstract String createProduct_C();

}
