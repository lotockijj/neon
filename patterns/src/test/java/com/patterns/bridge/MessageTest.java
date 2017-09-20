package com.patterns.bridge;

import org.junit.Test;

public class MessageTest {

	@Test
	public void test() {
		Data data = new FileData();
		Message message = new TextMesssage(data);
		message.log("Wake up Roman :) "); 
		message = new ToUpperCaseMessage(data);
		message.log("Wake up Roman :O");
	}

}
