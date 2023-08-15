package com.xworkz.app;

public abstract class Project {

	public abstract void start();

	public abstract void implement();

	public abstract void test();

	public abstract void review();

	public abstract void complete();

	public void displayInfo() {

		System.out.println("Project Description ");
	}

	public void prioritize() {
		System.out.println("Project is being prioritized.");
	}

	public void scheduleMeeting() {
		System.out.println("A meeting for project  has been scheduled.");
	}

	public void updateStatus() {
		System.out.println("Project  status updated: ");
	}

	public void celebrate() {
		System.out.println("Project  has been successfully completed. Time to celebrate!");
	}
}
