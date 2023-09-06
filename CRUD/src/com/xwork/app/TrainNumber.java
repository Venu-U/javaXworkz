package com.xwork.app;

public interface TrainNumber {
	
	int NO_OFTRAINS=5;
	void store(int trainNo);
	
	boolean isExits(int trainNo);

}
