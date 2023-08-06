package com.xworkz.app;

public class Mushroom {
	
	public String type;
	public boolean edible;
	public int quantity;
	public double price;
	
	public Mushroom() {
		this("button", true, 10, 8.5);
		System.out.println("Invoking no-arg constructor in Mushroom");
	}
	
	public Mushroom(String type, boolean edible, int quantity, double price) {
		System.out.println("Invoking String, boolean, int, double constructor in Mushroom");
		this.type = type;
		this.edible = edible;
		this.quantity = quantity;
		this.price = price;
	}
}
