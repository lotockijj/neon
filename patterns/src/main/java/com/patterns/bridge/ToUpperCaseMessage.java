package com.patterns.bridge;

public class ToUpperCaseMessage implements Message {
	private Data data;
	
	public ToUpperCaseMessage(Data data) {
		this.data = data;
	}

	@Override
	public void log(String msg) {
		data.writeData(msg.toUpperCase());
	}

}
