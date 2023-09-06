package com.xworkz.app.service;

import com.xwork.app.Juise;

public class JuiceServicesImpl implements JuiceService {
   private Juise juiceRepositoray;
   public JuiceServicesImpl(Juise juiceRepositoray ) {
   this.juiceRepositoray=juiceRepositoray;
  }

	@Override
	public boolean validateAndSave(String juice) {
		System.out.println("invoking validation in juice"+ this.getClass().getSimpleName());
		
		
		if (juice != null && !juice.isEmpty() && juice.length()>=3 && juice.length()<20) {
			System.out.println("juice name " + juice + " is valid");
			
			if(!this.juiceRepositoray.isExist(juice))
			{
			this.juiceRepositoray.save(juice);
			return true;
		}
		else{
			System.err.println("Juice name " + juice +" alredy exists ,add another one");
		}
		}
		else{
			System.err.println("juice name " + juice + "is invalid");
	
		}
		return false;
	}

}
