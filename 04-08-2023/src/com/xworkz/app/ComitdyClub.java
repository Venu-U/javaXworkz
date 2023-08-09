package com.xworkz.app;

public class ComedyClub extends Theater{

	@Override
	public void livePerformance() {
		System.out.println("ComedyClub overrides Theater");
		super.livePerformance();
	}

}
