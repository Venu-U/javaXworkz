package com.xworkz.boot;

import com.xwork.app.MobileNumber;

public class MobileNumberrunner {

	public static void main(String[] args) {
		System.out.println("invoking main in MobileNumberrunner");
		
		MobileNumber MobileNumber=new MobileNumberimpl();
		
		MobileNumber = new MobileNumberServicesImpl(juise);
		
		MobileNumberRepositor.validateAndSave("1234567898");
		MobileNumberRepositor.validateAndSave("8987654321");

		
		

	}

}
