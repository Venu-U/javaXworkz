public class MainRunner {

	public static void main(String[] args) {
		
		System.out.println("Invoking main in MainRunner");
		
		System.out.println("*******************");
		Minister minister=new Minister();
		String name=minister.name;
		System.out.println("Name of minister is "+name);
		int exp=minister.exp;
		System.out.println("Experience of minister is "+exp);
		System.out.println("******************");
		Constituency constituency=minister.constituency;
		int no=constituency.no;
		long noOfPopulation=constituency.noOfPopulation;
		
		System.out.println("Constituency number is "+no);
		System.out.println("Number of population is "+noOfPopulation);
		
		System.out.println("----------------------");
		
		IndiraCanteen indiraCanteen=constituency.indiraCanteen;
		double breakFastPrice=indiraCanteen.breakFastPrice;
		double lunchPrice=indiraCanteen.lunchPrice;
		
		
		System.out.println("Breakfast price in indira canteen is "+breakFastPrice);
		System.out.println("Lunch price in indira canteen is "+lunchPrice);
		
		System.out.println("-----------------------");
	}

}