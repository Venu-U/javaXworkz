package com.xworkz.app.service;

import com.xwork.app.TrainNumber;

public class TrainNumberServiceimpl implements TrainNumberService {

	private TrainNumber trainNumber;

	public TrainNumberServiceimpl(TrainNumber trainNumber) {
		this.trainNumber = trainNumber;
	}

	@Override
	public boolean validateAndStore(int trainNo) {
		if (trainNo > 10000 && trainNo < 50000) {
			if (!trainNumber.isExits(trainNo)) {
				System.out.println("Train number " + trainNo + " is valid ");
				this.trainNumber.store(trainNo);
				return true;
			} else {
				System.err.println("Train No " + trainNo + " already present add another train");
			}
		} else {
			System.err.println("Train No is invalid");
		}
		return false;
	}

}
