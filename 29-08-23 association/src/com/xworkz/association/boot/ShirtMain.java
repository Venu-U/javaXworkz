package com.xworkz.association.boot;

import javax.swing.ButtonGroup;

import com.xworkz.association.app.Button;
import com.xworkz.association.app.Shirt;

public class ShirtMain {

	public static void main(String[] args) {

		Button button = new ButtonGroup();

		Shirt shirt = new Shirt("Denim");
		shirt.setButton(button);
		System.out.println("stich method returns : " + shirt.stich());

	}

}