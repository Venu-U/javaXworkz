package com.xworkz.app.service;

import com.xwork.app.Pincode;

public class PincodeServiceimpl implements PincodeService {

	private Pincode pincode;

	public PincodeServiceimpl(Pincode pincode) {
		this.pincode = pincode;
	}

	@Override
	public boolean validateAndStore(int pincode) {
		if (pincode > 10000 && pincode <= 50000) {
			if (!pincode.isExits(pincode)) {
				System.out.println("Pincode " + pincode + " is valid ");
				this.pincode.store(pincode);
				return true;
			} else {
				System.err.println("Pincode " + pincode + " already present add another pincode");
			}
		} else {
			System.err.println("Pincode is invalid");
		}
		return false;
	}

}
