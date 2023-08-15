package com.xworkz.app;

public abstract class Vehicle {

	public abstract void start();

	public abstract void stop();

	public abstract void accelerate();

	public abstract void decelerate();

	public abstract void turn();

	public void honk() {
		System.out.println("Vehicle is honking.");
	}

	public void lightsOn() {
		System.out.println("Vehicle's lights are turned on.");
	}

	public void lightsOff() {
		System.out.println("Vehicle's lights are turned off.");
	}

	public void refillFuel() {
		System.out.println("Vehicle is being refueled.");
	}

	public void service() {
		System.out.println("Vehicle is being serviced.");
	}

}
