package com.xwork.app;

public interface Location {
	int TOTAL_LOCATION = 5;

	void save(int location);

	boolean isExits(int location);
}
