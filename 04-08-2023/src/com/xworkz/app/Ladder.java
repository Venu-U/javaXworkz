package com.xworkz.app;

public class Ladder {
	public void portable() {
		System.out.println("Invoking portable  no-arg in Ladder ");
		portable(10);
		portable("Wood");
	}
	public void portable(int length) {
		System.out.println("Invoking portable,int in Ladder ");
		System.out.println("Length :"+length);
	}
	public void portable(String material) {
		System.out.println("Invoking portable, String in Ladder");
		System.out.println("Material :"+material);
	}
	public void portable(int length,  String material) {
		System.out.println("Invoking portable, int,String in Ladder ");
		portable(length);
		portable(material);
	}

}
