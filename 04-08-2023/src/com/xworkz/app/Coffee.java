package com.xworkz.app;

public class Coffee {
	
	public String brand;
	public boolean taste;
	public int temp;
	public double price;
	
	public Coffee()
	{
		this("bru",true,22,14);
		
		System.out.println("Invoking no-arg const in Coffee");
	}
	public Coffee(String brand,boolean taste,int temp,double price)
	{
		System.out.println("Invoking String,boolean,int,double in Coffee");
		this.brand=brand;
		this.taste=taste;
		this.temp=temp;
		this.price=price;
	}
	

}