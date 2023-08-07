package com.xworkz.app;

 public class Specs {

	public void lens() {
		System.out.println("Invoking lens  no-arg in Specs");
		lens(1.5);
		lens("Concave");
	}
	public void lens(double power) {
		System.out.println("Invoking lens, double in Specs");
		System.out.println("Power :"+power);
	}
	public void lens(String type) {
		System.out.println("Invoking lens, String in Specs");
		System.out.println("Type :"+type);
	}
	public void lens(double power, String type) {
		System.out.println("Invoking lens, double,String in Specs");
		lens(power);
		lens(type);
	}
}

