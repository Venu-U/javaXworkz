package com.xworkz.boot;

import com.xwork.app.TrainNumber;
import com.xwork.impl.TrainNumberimpl;
import com.xworkz.app.service.TrainNumberService;
import com.xworkz.app.service.TrainNumberServiceimpl;

public class TrainNumberRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in TrainNumberRunner");
		
		TrainNumber trainNumber=new TrainNumberimpl();
		
		TrainNumberService trainNumberService=new TrainNumberServiceimpl(trainNumber);
		
		trainNumberService.validateAndStore(16782);
		
		trainNumberService.validateAndStore(16782);

	}

}