package com.xworkz.app;

public class Speaker extends Mic{

	@Override
	public void sound() {
		System.out.println("Speaker override the Mic");
		super.sound();
	}

}
