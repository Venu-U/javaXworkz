package com.xwork.impl;

import com.xwork.app.Venu;

public class Venuimpl implements Venu {

	String[] vegetables = new String[TOTAL_ITEMS];
	int pos;

	@Override
	public void save(String vegetables) {
		System.out.println("invoking save in vegetables....");
		if (this.pos < TOTAL_ITEMS) {
			this.vegetables[pos] = vegetables;
			System.out.println(" store " + vegetables + " in pos " + this.pos);
			this.pos++;

		} else {
			System.err.println("index out bound exeption");
		}
	}

}
