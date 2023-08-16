package com.xworkz.boot;

import com.xworkz.app.*;

public class PendantRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in Pendant");

		Pendant pen=new Pendant();
		System.out.println(pen);
		System.out.println("*****************");
		Pendant pen1=new Pendant("Silver", "silver", "Vinayaka Jewallry", "circle", "Lakshmi", 0, 0, 1, 20, 0, true, true);
		System.out.println(pen1);
		System.out.println("**************");
		Pendant pen2=new Pendant("Gold", "gold", "Tanishq", "circle", "Ganesha", 0, 0, 1, 20, 0, true, true);
		System.out.println(pen2);
	}

}
