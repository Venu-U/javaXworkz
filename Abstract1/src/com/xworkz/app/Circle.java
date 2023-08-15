package com.xworkz.app;

public class Circle extends Shape {

	@Override
	public double calculateArea() {
		System.out.println("Invoke CalculateArea");
		return 0;
	}

	@Override
	public double calculatePerimeter() {
		System.out.println("Invoke calculatePerimeter");
		return 0;
	}

	@Override
	public void draw() {
		System.out.println("Invoke draw");

	}

	@Override
	public String getName() {
		System.out.println("Invoke getName");
		return null;
	}

	@Override
	public void resize() {
		System.out.println("Invoke size");

	}

}