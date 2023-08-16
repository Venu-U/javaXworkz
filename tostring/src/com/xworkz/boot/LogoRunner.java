package com.xworkz.boot;

import com.xworkz.app.Logo;

public class LogoRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in Logo");

		Logo logo= new Logo();
		System.out.println(logo);

		System.out.println("_____________________________________");

		Logo logo1=new Logo("Square", "Yellow", "Nature", 15, 17);
		System.out.println(logo1);

		System.out.println("_____________________________________");

		Logo logo2=new Logo("Trapizum", "Orange","Wild", 20, 30);
		System.out.println(logo2);


	}

}