package com.xwork.impl;

import com.xwork.app.Location;

public class Locationimpl implements Location {

	private int[] Location = new String[TOTAL_LOCTION];
	private int position;

	@Override
	public void store(int Location) {
		System.out.println("invoking store() in " + this.getClass().getSimpleName());
		if (this.position < TOTAL_LOCTION) {
			this.Location[position] = trainNo;
			System.out.println("Train No " + Location + " added at position " + this.position);
			position++;
		} else {
			System.err.println("Data store is full cannot add new train no");

		}
	}

	@Override
	public boolean isExits(int Location) {

		System.out.println("Invoking isExist() in " + this.getClass().getSimpleName());

		for (int index = 0; index <= this.position; index++) {
			int temp = Location[index];
			if (temp == Location) {
				System.out.println("Location is already present");
				return true;
			}
		}
		return false;
	}

}
