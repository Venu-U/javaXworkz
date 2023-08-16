package com.xworkz.app;

public class Pendant {
	private String material;
	private String color;
	private String shopName;
	private String shape;
	private String design;
	private double gram;
	private double cost;
	private int height;
	private int width;
	private int noOfPendant;
	private boolean isAvailable;
	private boolean isQualityGood;

	@Override
	public String toString() {
		return "material:"+material+"color:"+color+"shopName:"+shopName+"shape:"+shape+"design:"+design+"gram:"+gram+"cost:"+cost+"height:"+height+"width:"+width+"NoOfPendant:"+noOfPendant+"isAvailable:"+isAvailable+"isQualityGood:"+isQualityGood;
	}
	public Pendant() {
	}
	public Pendant(String material, String color, String shopName, String shape, String design, double gram,
			double cost, int height, int width, int noOfPendant, boolean isAvailable, boolean isQualityGood) {
		super();
		this.material = material;
		this.color = color;
		this.shopName = shopName;
		this.shape = shape;
		this.design = design;
		this.gram = gram;
		this.cost = cost;
		this.height = height;
		this.width = width;
		this.noOfPendant = noOfPendant;
		this.isAvailable = isAvailable;
		this.isQualityGood = isQualityGood;
	}


}
