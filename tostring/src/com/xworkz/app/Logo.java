package com.xworkz.app;

public class Logo {
	private String shape;
	private String color;
	private String theme;
	private int height;
	private int width;

	@Override
	public String toString() {
		System.out.println("To string method is overriding");
		return "shape:"+shape+ "color:"+color+ "theme:"+theme+ "Height:"+height+ "width:"+width;
	}

	public Logo() {
	}

	public Logo(String shape, String color, String theme, int height, int width) {

		this.shape = shape;
		this.color = color;
		this.theme = theme;
		this.height = height;
		this.width = width;
	}
}
