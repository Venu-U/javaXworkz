package com.xworkz.app;

public class Stapler {

	public void binding() {
		System.out.println("Invoking binding  no-arg in Stapler ");
		binding(10);
		binding("green");
	}
	public void binding(double capacity) {
		System.out.println("Invoking binding,String in Stapler ");
		System.out.println("Capacity :"+capacity);
	}
	public void binding(String color) {
		System.out.println("Invoking protect, String in Stapler");
		System.out.println("Color :"+color);
	}
	public void binding(double capacity,  String color) {
		System.out.println("Invoking binding, String,String in Stapler ");
		binding(capacity);
		binding(color);
	}

}
