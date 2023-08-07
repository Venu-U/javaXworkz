package com.xworkz.app;

public class IronBox {

	public void heat() {
		System.out.println("Invoking heat  no-arg in ironbox");
		heat(10);
		heat("bajaj");
	}
	public void heat(double power) {
		System.out.println("Invoking heat, double in IronBox");
		System.out.println("Power :"+power);
	}
	public void heat(String brand) {
		System.out.println("Invoking heat, String in IronBox");
		System.out.println("Brand :"+brand);
	}
	public void heat(double power, String brand) {
		System.out.println("Invoking heat, double,String in IronBox");
		heat(power);
		heat(brand);
	}
}

