import com.xworkz.app.Coffee;
import com.xworkz.app.Chikkamagalore;

public class CoffeeRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in CoffeeRunner");
		System.out.println("---------------------------------------------------");
		
		Coffee coffee=new Coffee();
		System.out.println("---------------------------------------------------");
		System.out.println("Brand of coffee is "+coffee.brand);
		System.out.println("Price of coffee is "+coffee.price);
		System.out.println("Taste of coffee is "+coffee.taste);
		System.out.println("Temperature of coffee is "+coffee.temp);
		
		System.out.println("---------------------------------------------------");
		
		Chikkamagalore Chikkamagalore =new Chikkamagalore("Sunrise",false,18,32);
		System.out.println("---------------------------------------------------");
		System.out.println("Brand of coffee is"+Chikkamagalore.brand);
		System.out.println("Price of coffee is "+Chikkamagalore.price);
		System.out.println("Taste of coffee is "+Chikkamagalore.taste);
		System.out.println("Temperature of coffee is "+Chikkamagalore.temp);
	}

}