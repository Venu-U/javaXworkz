package com.xworkz.app;

public class Router {
	
	public String brand;
	public int througput;
	public int ports;
	public double price;
	
	public Router()
	{
		this("pilips",20,4,100.0);
		
		System.out.println("Invoking no-arg const in Coffee");
	}
	public Router(String string, int i, int j, double d) {
		System.out.println("Invoking String,boolean,int,double in Coffee");
		this.brand=string;
		this.througput=i;
		this.ports=j;
		this.price=d;
	}
	

}