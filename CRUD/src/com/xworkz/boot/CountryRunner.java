package com.xworkz.boot;

import com.xwork.app.Country;

public class CountryRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in CountryRunner");

		Country juise = new Countryimpl();

		Service countryRepositor = new CountryServicesImpl(Country);

		CountryRepositor.validateAndSave("Bharath");
		CountryRepositor.validateAndSave("ENGLAND");

	}

}
