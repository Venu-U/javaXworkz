package com.xworkz.app;

public class Chikkamagalore  extends Coffee {

	public Chikkamagalore() {
		
		System.out.println("Invoking no-arg const in Chikkamagalore");
	}
	
	public Chikkamagalore (String brand,boolean taste,int temp,double price)
	{
		super();
		System.out.println("Invoking String,boolean,int,double in Chikkamagalore");
		this.brand=brand;
		this.taste=taste;
		this.temp=temp;
		this.price=price;
	}

}