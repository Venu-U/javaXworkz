package com.xwork.impl;

import com.xwork.app.MobileNumber;

public class MobileNumberimpl implements MobileNumber {

	private int[] MobileNumber = new String[TOTAL_MOBILENUMBER];
	private int position;

	@Override
	public void store(int MobileNumber) {
		System.out.println("invoking store() in " + this.getClass().getSimpleName());
		if (this.position < TOTAL_MOBILENUMBER) {
			this.MobileNumber[position] = MobileNumber;
			System.out.println(" MobileNumber " + MobileNumber + " added at position " + this.position);
			position++;
		} else {
			System.err.println("Data store is full cannot add new MobileNumber ");

		}
	}

	@Override
	public boolean isExits(int MobileNumber) {

		System.out.println("Invoking isExist() in " + this.getClass().getSimpleName());

		for (int index = 0; index <= this.position; index++) {
			int temp = MobileNumber[index];
			if (temp == MobileNumber) {
				System.out.println("MobileNumber is already present");
				return true;
			}
		}
		return false;
	}

}
