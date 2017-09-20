package com.patterns.bridge;

public class EncryptedMessage implements Message {
	private Data data;
	private final String encryption = "mnopqrstuvwxyzabcdefghijkl";
	
	public EncryptedMessage(Data data) {
		this.data = data;
	}

	@Override
	public void log(String msg) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < msg.length(); i++) {
			sb.append(encrypt(msg.charAt(i)));
		}
		data.writeData(sb.toString());
	}

	private String encrypt(char charAt) {
		int idx = encryption.indexOf(Character.toLowerCase(charAt));
		if(Character.isUpperCase(charAt)){
			return Character.toString(encryption.charAt(idx)).toUpperCase();
		} else {
			return Character.toString(encryption.charAt(idx));
		}
	}

}
