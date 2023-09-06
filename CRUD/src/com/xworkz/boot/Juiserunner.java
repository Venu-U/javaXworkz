package com.xworkz.boot;

import com.xwork.app.Juise;
import com.xwork.impl.Juiseimpl;
import com.xworkz.app.service.JuiceService;
import com.xworkz.app.service.JuiceServicesImpl;

public class Juiserunner {

	public static void main(String[] args) {
		System.out.println("invoking main in juicerunner");
		
		Juise juise=new Juiseimpl();
		
		JuiceService juiceRepositor = new JuiceServicesImpl(juise);
		
		juiceRepositor.validateAndSave("String");
		juiceRepositor.validateAndSave("Moutain Dev");

		
		

	}

}
