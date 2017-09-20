package com.patterns.bridge;

public class TextMesssage implements Message {
	private Data data;
	
	public TextMesssage(Data data) {
		this.data = data;
	}

	@Override
	public void log(String msg) {
		data.writeData(msg);
	}

}
