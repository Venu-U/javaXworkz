package com.xworkz.app;

public class Flag {
	private String country;
	private String color;
	private double price;

	@Override
	public String toString() {
		return "country:"+country+"color:"+color+"price:"+price;
	}
	public Flag() {
	}
	public Flag(String country, String color, double price) {
		super();
		this.country = country;
		this.color = color;
		this.price = price;
	}


}
