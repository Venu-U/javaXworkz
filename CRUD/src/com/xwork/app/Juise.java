package com.xwork.app;

public interface Juise {
	
	int TOTAL_ITEMS=10;
	
	void save(String juise );
	 
	default boolean isExist(String juice) {
	return false;
	
	
	}

}
