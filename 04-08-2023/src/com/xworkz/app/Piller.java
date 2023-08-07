package com.xworkz.app;

public class Piller {

	public void gripping() {
		System.out.println("Invoking gripping  no-arg in Plier ");
		gripping("Regular Pliers");
		gripping(5);
	}
	public void gripping(String name) {
		System.out.println("Invoking gripping,String in Plier ");
		System.out.println("Plier Name :"+name);
	}
	public void gripping(int length) {
		System.out.println("Invoking gripping,int in Plier");
		System.out.println("Pliers length :"+length);
	}
	public void gripping(String name,  int length) {
		System.out.println("Invoking gripping, int,String in Plier");
		gripping(name);
		gripping(length);
	}

}
