package com.xworkz.boot;

import com.xwork.app.Pincode;
import com.xwork.impl.Pincodeimpl;
import com.xworkz.app.service.PincodeService;
import com.xworkz.app.service.PincodeServiceimpl;

public class PincodeRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PincodeRunner");
		
		Pincode trainNumber=new Pincodeimpl();
		
		PincodeService trainNumberService=new PincodeServiceimpl(trainNumber);
		
		PincodeService.validateAndStore(57723);
		
		PincodeService.validateAndStore(57720);

	}

}