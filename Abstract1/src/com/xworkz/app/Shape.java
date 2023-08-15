package com.xworkz.app;

public abstract class Shape {

	public abstract double calculateArea();

	public abstract double calculatePerimeter();

	public abstract void draw();

	public abstract String getName();

	public abstract void resize();

	public void printInfo() {
		System.out.println("Print information");

	}

	public void display() {
		System.out.println("Shape displayed.");
	}

	public void description() {
		System.out.println("This is a geometric shape.");
	}

	public void rotate() {
		System.out.println("Shape rotated.");
	}

	public void translate() {
		System.out.println("Shape translated ");
	}
}