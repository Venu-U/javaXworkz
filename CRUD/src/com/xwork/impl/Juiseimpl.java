package com.xwork.impl;

import com.xwork.app.Juise;

public class Juiseimpl implements Juise {
	
	String[] juices =new String[TOTAL_ITEMS];
	int pos;

	@Override
	public void save(String juise) {
		System.out.println("invoking save in juse....");
		if(this.pos<TOTAL_ITEMS) {
		this.juices[pos]=juise;
		System.out.println(" store "+juise+" in pos "+this.pos);
		this.pos++;

	}
		else {
			System.err.println("index out bound exeption");
		}
	}
	
	@Override
	public boolean isExist(String juice) {
		for(int index=0;index<=this.pos;index++)
		{
			String temp=this.juices[index];
			if(temp!=null && temp.equals(juice))
			{
		
			System.out.println("juise alredy exists.....");
			return true;
		}
	}
		
		return Juise.super.isExist(juice);
}
	


}
