package com.xworkz.app;

public class Hotel {

	public void food() {
		System.out.println("Invoking food no-arg in Hotel");
		food(50);
		food("Dosa");
	}
	public void food(double foodPrice) {
		System.out.println("Invoking food, double in Hotel");
		System.out.println("FoodPrice :"+foodPrice);
	}
	public void food(String name) {
		System.out.println("Invoking heat, String in Hotel");
		System.out.println("Name :"+name);
	}
	public void food(double foodPrice, String name) {
		System.out.println("Invoking food, double,String in Hotel");
		food(foodPrice);
		food(name);
	}

}



