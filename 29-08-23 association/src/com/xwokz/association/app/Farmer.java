package com.xwokz.association.app;

public class Farmer {
	private String name;
	private Land land;
	
	public Farmer(String name)
	{
		this.name=name;
	}
	public void setLand(Land land)
	{
		this.land=land;
		
	}
	public void farming()
	{
		System.out.println("Invoking farming() in farmer");
		this.land.cropGrow();
	}
}
