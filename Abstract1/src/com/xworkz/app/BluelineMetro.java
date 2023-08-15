package com.xworkz.app;

public class BluelineMetro extends Metro{

	@Override
	public void move() {
		System.out.println("Invoking move");

	}

	@Override
	public void stop() {
		System.out.println("Invoking stop");

	}

	@Override
	public void announcement() {
		System.out.println("Invoking announcement");

	}

	@Override
	public void start() {
		System.out.println("Invoking start");

	}

	@Override
	public void openDoors() {
		System.out.println("Invoking openDoors");

	}

}