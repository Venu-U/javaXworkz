package com.xworkz.app;

public class MovieTicket extends Ticket{

	@Override
	public void confirmation() {
		System.out.println("MovieTicket overrides the Ticket");
		super.confirmation();
	}



}
