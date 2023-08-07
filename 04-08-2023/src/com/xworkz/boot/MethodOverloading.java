package com.xworkz.boot;

public class MethodOverloading {

	public static void main(String[] args) {
		IronBox ironbox=new IronBox();
		ironbox.heat();
		ironbox.heat(20,"Bajaj");

		System.out.println("----------------------------------------");
		Hotel hotel=new Hotel();
		hotel.food();
		hotel.food(40,"Idli");

		System.out.println("-----------------------------------------");
		Specs specs=new Specs();
		specs.lens();
		specs.lens(1.4, "Convex");

		System.out.println("-----------------------------------------");
		Umbrella umbrella=new Umbrella();
		umbrella.protect();
		umbrella.protect(400.00, "Rylan");

		System.out.println("------------------------------------------");
		Stapler Stapler=new Stapler();
		Stapler.binding();
		Stapler.binding(15, "black");

		System.out.println("------------------------------------------");
		Ladder Ladder=new Ladder();
		Ladder.portable();
		Ladder.portable(15, "Aluminum");

		System.out.println("-------------------------------------------");
		Gadget gadget=new Gadget();
		gadget.camera();
		gadget.camera(1.5, "Bluetooth");

		System.out.println("-------------------------------------------");
		Plier Plier=new Plier();
		Plier.gripping();
		Plier.gripping("Slip-Joint Pliers",10);

		System.out.println("-------------------------------------------");
		Mouse mouse=new Mouse();
		mouse.movement();
		mouse.movement(1,"Non Rechargeble");

		System.out.println("-------------------------------------------");
		Elevator  elevator =new Elevator ();
		elevator.transport();
		elevator.transport(600,"Floor Selection");
	}


}
