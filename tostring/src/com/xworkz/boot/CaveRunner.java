package com.xworkz.boot;

import com.xworkz.app.Cave;

public class CaveRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in Cave");

		Cave cave = new Cave();
		System.out.println(cave);

		System.out.println("________________________________");

		Cave cave1=new Cave("Mysore", "Tiger", 20,30,4, true, true, true, true);
		System.out.println(cave1);

		System.out.println("________________________________");

		Cave cave2=new Cave("Banerghtaa","Lion",15,20,5, false, false, false, false);
		System.out.println(cave2);
	}

}
