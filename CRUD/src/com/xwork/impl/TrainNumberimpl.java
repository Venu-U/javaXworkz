package com.xwork.impl;

import com.xwork.app.TrainNumber;

public class TrainNumberimpl implements TrainNumber {

	private int[] trainNos = new int[NO_OFTRAINS];
	private int position;

	@Override
	public void store(int trainNo) {
		System.out.println("invoking store() in "+this.getClass().getSimpleName());
		if (this.position < NO_OFTRAINS) {
			this.trainNos[position] = trainNo;
			System.out.println("Train No " + trainNo + " added at position " + this.position);
			position++;
		} else {
			System.err.println("Data store is full cannot add new train no");

		}
	}
	


	@Override
	public boolean isExits(int trainNo) {

System.out.println("Invoking isExist() in "+this.getClass().getSimpleName());
		
		for(int index=0;index<=this.position;index++)
		{
			int temp=trainNos[index];
			if(temp==trainNo)
			{
				System.out.println("Train No is already present");
				return true;
			}
		}
		return false;
		}

}
