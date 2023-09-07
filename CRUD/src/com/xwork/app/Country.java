package com.xwork.app;

public interface Country {

	int TOTAL_COUNTRY = 5;

	void save(String country);

	boolean isExits(int country);

}
