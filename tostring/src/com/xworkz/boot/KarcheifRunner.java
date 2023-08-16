package com.xworkz.boot;

import com.xworkz.app.Karcheif;

public class KarcheifRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in Karcheif");

		KarcheifRunner cheif= new KarcheifRunner();
		System.out.println(cheif);

		System.out.println("*********************");

		Karcheif cheif1=new Karcheif("Square", "Skyblue", "checks", "Cotton", 12, 20,true);
		System.out.println(cheif1);

		System.out.println("*********************");


		Karcheif cheif2=new Karcheif("rectangle", "brown", "Panda", "Nylon", 10, 10,false);
		System.out.println(cheif2);



	}

}
