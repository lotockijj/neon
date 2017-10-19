package com.patterns;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
	private static final Charset UTF_8 = Charset.forName("UTF-8");

	private static String preProcess(String msg) {
		msg = msg.substring(msg.length() - 1) +
				msg.substring(0, msg.length() - 1);
		return msg;
	};

	@SuppressWarnings("unused")
	private static byte[] convertToBinary(String msg){
		String text = "Hello World!";
		byte[] bytes = text.getBytes(UTF_8);
		//		System.out.println("bytes= " + Arrays.toString(bytes));
		//		System.out.println("text again= " + new String(bytes, UTF_8));
		return bytes;
	}

	private static byte[] convertToBinaryTwo(String msg){
		return msg.getBytes();
	}

	public static String bytesToAlphabeticString(byte[] bytes) {
		String str = "";
	    try {
	    	str =  new String(bytes, 0, bytes.length, "ASCII");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	    return str;
	}

	public static void main( String[] args ){
		@SuppressWarnings("unused")
		String str = App.preProcess("Hello World!!!");
		byte[] result = convertToBinaryTwo("Hello World!!!");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();
		System.out.println(bytesToAlphabeticString(result));
		List<String> list = new ArrayList<>();
		list.add("something");
		list.add("something 2 :) ");
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
		list.clear();
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
			throw new NumberFormatException();
		}
	}
}
