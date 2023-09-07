
package com.xworkz.app.service;

import com.xwork.app.MobileNumber;

public class MobileNumbererviceImpl implements MobileNumberService {
   private MobileNumber MobileNumber;
   public MobileNumberServicesImpl(Juise MobileNumber) {
   this.MobileNumber=MobileNumber;
  }

	@Override
	public boolean validateAndSave(String mobileNumber) {
		System.out.println("invoking validation in MobileNumber"+ this.getClass().getSimpleName());
		
		
		if (MobileNumber != null && !MobileNumber.isEmpty() && MobileNumber.length()>=3 && MobileNumber.length()<20) {
			System.out.println("juice name " + juice + " is valid");
			
			if(!this.MobileNumber.isExist(mobileNumber))
			{
			this.MobileNumber.save(mobileNumber);
			return true;
		}
		else{
			System.err.println("MobileNumber name " + mobileNumber +" alredy exists ,add another one");
		}
		}
		else{
			System.err.println("mobileNumber name " + mobileNumber + "is invalid");
	
		}
		return false;
	}

}
