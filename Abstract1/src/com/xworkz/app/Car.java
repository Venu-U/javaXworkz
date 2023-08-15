package com.xworkz.app;

public class Car extends Vehicle {

	@Override
	public void start() {
		System.out.println("Start");
	}

	public void stop() {
		System.out.println("Stop");

	}

	@Override
	public void accelerate() {
		System.out.println("Accelerate");

	}

	@Override
	public void decelerate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void turn() {
		System.out.println("Turn");
	}

}