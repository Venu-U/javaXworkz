package com.xwork.app;

public interface Pincode {
	int NO_OFPINCODES = 5;

	void store(int pinCode);

	boolean isExits(int pinCode);

}
