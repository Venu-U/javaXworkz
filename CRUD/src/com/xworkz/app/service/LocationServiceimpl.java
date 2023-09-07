
package com.xworkz.app.service;

import com.xwork.app.Location;

public class LocationServiceimpl implements LocationService {
	private Location Location;

	public LocationService( LocationService) {
   this.MobileNumber=MobileNumber;
  }

	@Override
	public boolean validateAndSave(String mobileNumber) {
		System.out.println("invoking validation in MobileNumber" + this.getClass().getSimpleName());

		if (Location != null && !Location.isEmpty() && Location.length() >= 3 && Location.length() < 20) {
			System.out.println("location name " + locationService + " is valid");

			if (!this.Location.isExist(LocationService)) {
				this.Service.save(LocationService);
				return true;
			} else {
				System.err.println("Location name " + Location + " alredy exists ,add another one");
			}
		} else {
			System.err.println("Location name " + Location + "is invalid");

		}
		return false;
	}

}
