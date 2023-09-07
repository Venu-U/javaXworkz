package com.xwork.impl;

import com.xwork.app.Country;

public class Countryimpl implements Country{

	String[] Country = new String[TOTAL_COUNTRY];
	int pos;

	@Override
	public void save(String Country) {
		System.out.println("invoking save in juse....");
		if (this.pos < TOTAL_COUNTRY) {
			this.Country[pos] =Country;
			System.out.println(" store " + Country + " in pos " + this.pos);
			this.pos++;

		} else {
			System.err.println("index out bound exeption");
		}
	}

	@Override
	public boolean isExist(int country) {
		for (int index = 0; index <= this.pos; index++) {
			String temp = this.Country[index];
			if (temp != null && temp.equals(country)) {

				System.out.println("juise alredy exists.....");
				return true;
			}
		}

		return Country.super.isExist(country);
	}

}
