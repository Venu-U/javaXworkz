package com.xworkz.app;
public class HippedDinosaur extends Dinosaur{

	@Override
	public void run() {
		System.out.println("HippedDinosaur overrides the Dinosaur ");
		super.run();
	}

}
