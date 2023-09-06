package com.xwork.impl;


    import com.xwork.app.Pincode;

public class Pincodeimpl implements Pincode {

	private int[] pincodes = new int[NO_OFPINCODES];
	private int position;
	private int pincode;

	@Override
	public void store(int trainNo) {
		System.out.println("invoking store() in "+this.getClass().getSimpleName());
		if (this.position < NO_OFPINCODES ) {
			this.pincodes[position] = pincode;
			System.out.println("pin code " + pincode + " added at position " + this.position);
			position++;
		} else {
			System.err.println("Data store is full cannot add new pincode");

		}
	}
	


	@Override
	public boolean isExits(int pincode) {

System.out.println("Invoking isExist() in "+this.getClass().getSimpleName());
		
		for(int index=0;index<=this.position;index++)
		{
			int temp=pincodes[index];
			if(temp==pincode)
			{
				System.out.println("pincode is already present");
				return true;
			}
		}
		return false;
		}

}


