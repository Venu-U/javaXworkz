package com.xworkz.app;

public class Umbrella {

	public void protect() {
		System.out.println("Invoking protect  no-arg in Umbrella ");
		protect(300);
		protect("Camel");
	}
	public void protect(double price) {
		System.out.println("Invoking protect,String inUmbrella ");
		System.out.println("Color :"+price);
	}
	public void protect(String brand) {
		System.out.println("Invoking protect, String in Umbrella ");
		System.out.println("Brand :"+brand);
	}
	public void protect(double price, String brand) {
		System.out.println("Invoking protect, String,String in Umbrella ");
		protect(price);
		protect(brand);
	}

}
