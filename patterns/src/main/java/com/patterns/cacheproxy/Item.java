package com.patterns.cacheproxy;

import java.math.BigDecimal;

public class Item {
	private String barCode;
	private double weight;
	private double volume;
	private String description;
	private BigDecimal price;
	
	public Item(String barCode, double weight, double volume, String description, BigDecimal price) {
		this.barCode = barCode;
		this.weight = weight;
		this.volume = volume;
		this.description = description;
		this.price = price;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [barCode=" + barCode + ", weight=" + weight +
				", volume=" + volume + ", description=" + description
				+ ", price=" + price + "]";
	}
	
	
	
}
