package com.xworkz.app;

public class Poison  extends Mushroom {

	public Poison() {
		
		System.out.println("Invoking no-arg const in Poison");
	}
	
	public Poison (String type,boolean edible,int quantity,double price)
	{
		super();
		System.out.println("Invoking String,boolean,int,double in poison");
		this.type=type;
		this.edible=edible;
		this.quantity=quantity;
		this.price=price;
	}

}