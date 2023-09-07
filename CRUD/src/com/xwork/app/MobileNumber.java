package com.xwork.app;

public interface MobileNumber {
	int NO_MOBILENUMBER = 5;

	void store(int mobileNumber);

	boolean isExits(int mobileNumber);

}
