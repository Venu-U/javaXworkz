package com.xworkz.app;

public class Mouse {

	public void movement() {
		System.out.println("Invoking movement  no-arg in Mouse ");
		movement(1);
		movement("Rechargeble");
	}
	public void movement(int connectivity) {
		System.out.println("Invoking movement,String in Mouse");
		System.out.println("Connectivity :"+connectivity);
	}
	public void movement(String battery) {
		System.out.println("Invoking movement,int in Mouse");
		System.out.println("Batttery :"+battery);
	}
	public void movement(int connectivity,String  battery) {
		System.out.println("Invoking movement, int,String in Mouse");
		movement(connectivity);
		movement(battery);
	}

}
