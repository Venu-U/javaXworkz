import com.xworkz.app.Coffee;
import com.xworkz.app.Chikkamagalore;

public class MushroomKiller {

	public static void main(String[] args) {
		System.out.println("invoking main in MushroomKiller");
		System.out.println("---------------------------------------------------");
		
		Mushroom Mushroom=new Mushroom();
		System.out.println("---------------------------------------------------");
		System.out.println("type of Mushroom is "+Mushroom.type);
		System.out.println("edible of Mushroom is "+Mushroom.edible);
		System.out.println("quantity of Mushroom is "+Mushroom.quantity);
		System.out.println("prise of Mushroom is "+Mushroom.prise);
		
		System.out.println("---------------------------------------------------");
		
		Poison Poison=new Poison("Round",true,10,8.5);
		System.out.println("---------------------------------------------------");
		System.out.println("type of Mushroom is"+Poison.type);
		System.out.println("edible of Mushroom is "+Poison.edible);
		System.out.println("quantity of Mushroom is "+Poison.quantity);
		System.out.println("prise of Mushroom is "+Poison.prise);
	}

}