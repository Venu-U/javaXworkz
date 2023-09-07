package com.xworkz.app.service;

import com.xwork.app.Country;

public class CountryServicesImpl implements CountryService {
   private Country CountryRepositoray;
   public CuntryServicesImpl(Country countryRepositoray ) {
   this.countryRepositoray=countryRepositoray;
  }

	@Override
	public boolean validateAndSave(String country) {
		System.out.println("invoking validation in country"+ this.getClass().getSimpleName());
		
		
		if (country != null && !country.isEmpty() && country.length()>=3 && country.length()<20) {
			System.out.println("country name " + country + " is valid");
			
			if(!this.countryRepository.isExist(country))
			{
			this.countryRepository.save(country);
			return true;
		}
		else{
			System.err.println("country name " + country +" alredy exists ,add another one");
		}
		}
		else{
			System.err.println("country name " + country + "is invalid");
	
		}
		return false;
	}

}
