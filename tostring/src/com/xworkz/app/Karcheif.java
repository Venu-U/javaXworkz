package com.xworkz.app;

public class Karcheif {
	private String shape;
	private String color;
	private String design;
	private String cloth;
	private int size;
	private double price;
	private  boolean quality;


	@Override
	public String toString() {
		return "shape:"+shape +"color:"+color+"Design:"+design+"cloth:"+cloth+"size:"+size+"price:"+price+"quality:"+quality;
	}

	public Karcheif() {
	}

	public Karcheif(String shape, String color, String design, String cloth, int size, double price, boolean quality) {
		super();
		this.shape = shape;
		this.color = color;
		this.design = design;
		this.cloth = cloth;
		this.size = size;
		this.price = price;
		this.quality = quality;
	}



}
