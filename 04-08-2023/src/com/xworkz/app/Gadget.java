package com.xworkz.app;

public class Gadget {

	public void camera() {
		System.out.println("Invoking camera  no-arg in Gadget ");
		camera(1.2);
		camera("Wi-Fi");
	}
	public void camera(double resolution) {
		System.out.println("Invoking camera,double in Gadget ");
		System.out.println("Camera resolution :"+resolution);
	}
	public void camera(String connecting) {
		System.out.println("Invoking camera, String in Gadget");
		System.out.println("Connectivity :"+connecting);
	}
	public void camera(double resolution,  String connecting) {
		System.out.println("Invoking camera, int,String in Gadget");
		camera(resolution);
		camera(connecting);
	}

}
