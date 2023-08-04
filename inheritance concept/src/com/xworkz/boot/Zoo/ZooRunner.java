package com.xworkz.boot.zoo;

import com.xworkz.app.zoo.NationalZoo;
import com.xworkz.app.zoo.StateZoo;
import com.xworkz.app.zoo.Zoo;
import com.xworkz.app.zoo.ZooUtil;

public class ZooRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in ZooRunner");

		Zoo zoo = new Zoo();
		StateZoo stateZoo = new StateZoo();

		NationalZoo nationalZoo = new NationalZoo();

		ZooUtil.since(zoo);
		System.out.println("----------------------");

		ZooUtil.since(stateZoo);
		System.out.println("----------------------");

		ZooUtil.since(nationalZoo);

	}

}