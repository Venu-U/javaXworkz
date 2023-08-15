package com.xworkz.boot;

public class MainRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in LigniteCoal");
		Coal coal=new LigniteCoal();
		coal.burn();

		System.out.println("-------------------------------------");
		System.out.println("Invoking main in ProteusAmoeba");
		Amoeba amoeba=new ProteusAmoeba();
		amoeba.locomotion();

		System.out.println("-------------------------------------");
		System.out.println("Invoking main in Bangle");
		Bangle bangle=new GoldBangle();
		bangle.sound();

		System.out.println("-------------------------------------");
		System.out.println("Invoking main in Gate");
		Gate gate=new SlidingGate();
		gate.Control();

		System.out.println("-------------------------------------");
		System.out.println("Invoking main in Dinosaur");
		Dinosaur Dinosaur=new HippedDinosaur();
		Dinosaur.run();

		System.out.println("-------------------------------------");
		System.out.println("Invoking main in Flex");
		Flex  Flex =new Banner();
		Flex .Information();

		System.out.println("-------------------------------------");
		System.out.println("Invoking main in Mic");
		Mic mic =new Speaker();
		mic.sound();

		System.out.println("-------------------------------------");
		System.out.println("Invoking main in Drum");
		Drum drum =new Tank();
		drum.hold();

		System.out.println("-------------------------------------");
		System.out.println("Invoking main in Theater");
		Theater theater =new ComedyClub();
		theater.livePerformance();

		System.out.println("-------------------------------------");
		System.out.println("Invoking main in Ticket");
		Ticket ticket=new MovieTicket();
		ticket.confirmation();
	}

}
