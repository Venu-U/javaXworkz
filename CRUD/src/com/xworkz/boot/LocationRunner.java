package com.xworkz.boot;

import com.xwork.app.Location;


public class Locationrunner {

	public static void main(String[] args) {
		System.out.println("invoking main in Locationrunner");
		
		Location=new Locationimpl();
		
		LocationService juiceRepositor = new LocationServicesImpl(location);
		
		LocationRepositor.validateAndSave("Bhadaravthi");
		LocationRepositor.validateAndSave("Bangalore");

		
		

	}

}
