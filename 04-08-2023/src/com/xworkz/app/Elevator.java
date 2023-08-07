package com.xworkz.app;

	public class Elevator {

		public void transport() {
			System.out.println("Invoking transport  no-arg in Elevator");
			transport(500);
			transport("door operation");
		}
		public void transport(double weight) {
			System.out.println("Invoking transport,double in Elevator");
			System.out.println("Weight :"+weight);
		}
		public void transport(String system) {
			System.out.println("Invoking transport,String in Elevator");
			System.out.println("Control System :"+system);
		}
		public void transport(double weight,String system) {
			System.out.println("Invoking transport,String and double in Elevator");
			transport(weight);
			transport(system);
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
