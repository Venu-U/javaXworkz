package com.xworkz.app;

public class SoftwareProject extends Project {

	@Override
	public void start() {
		System.out.println("started");

	}

	@Override
	public void implement() {
		System.out.println("Implemented");

	}

	@Override
	public void test() {
		System.out.println("Tested");

	}

	@Override
	public void review() {
		System.out.println("Reviewed");

	}

	@Override
	public void complete() {
		System.out.println("Completed");

	}

}