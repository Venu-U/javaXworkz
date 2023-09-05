package com.xworkz.association.boot;

import com.xwokz.association.app.*;
//import com.xworkz.association.app.Land;

public class FarmerRunner {
	public static void main(String[]args) {
		System.out.println("Invoking main() in FarmerRunner");
		String name="Venu";
		Land land=new Land();
	
        Farmer farmer = new Farmer(name);
		farmer.setLand(land);
		farmer.farming();
		
	}
	

}
