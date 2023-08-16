package com.xworkz.app;

public class Cave {
	private String location;
	private String animalName;
	private int height;
	private int width;
	private int noOfAnimal;
	private boolean isSafe;
	private boolean isTigerPresent;
	private boolean isInZoo;
	private boolean foodAvailable;

	@Override
	public String toString() {
		return "location:"+location+"animalName:"+animalName+"height:"+height+"width:"+width+"noOfAnimal:"+noOfAnimal+"isSafe:"+isSafe+"isTigerPresent"+isTigerPresent+"isInZoo:"+isInZoo+"foodAvailable:"+foodAvailable;
	}
	public Cave() {
	}
	public Cave(String location, String animalName, int height, int width, int noOfAnimal, boolean isSafe,
			boolean isTigerPresent, boolean isInZoo, boolean foodAvailable) {
		super();
		this.location = location;
		this.animalName = animalName;
		this.height = height;
		this.width = width;
		this.noOfAnimal = noOfAnimal;
		this.isSafe = isSafe;
		this.isTigerPresent = isTigerPresent;
		this.isInZoo = isInZoo;
		this.foodAvailable = foodAvailable;
	}
}

