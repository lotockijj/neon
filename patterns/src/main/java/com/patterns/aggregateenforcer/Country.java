package com.patterns.aggregateenforcer;

public class Country {
	private final Capital capital;

	public Country() {
		capital = new Capital();
	}

	@Override
	public String toString() {
		return "Country [capital=" + capital + "]";
	}
	

}
