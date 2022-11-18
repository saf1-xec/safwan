package fastFood2;

import java.util.ArrayList;

public class FastFoodCorner {
	
	private String name;
	private String location;
	
	
	public FastFoodCorner(String name,String location) {
		this.name=name;
		this.location=location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	public ArrayList<Snack> orderAtOnce(ArrayList<String> orderList) {
		ArrayList<Snack> ordered = new ArrayList<>();
            for(String s: orderList)
            {
            	ordered.add(order(s));
            }
            
        
		return ordered;
	}
	
	public Snack order(String order) {
		Snack snack=null;
		
		switch (order) {
		
		case "AlooBurger": {
			snack = new AlooBurger(120);
			
			break;
		}
		
		case "CheeseSandwich": {
			snack = new CheeseSandwich(50);
			break;
		}
		
		case "ChickenPizza": {
			snack = new ChickenPizza(300);
			break;
		}
		
		case "EggRoll": {
			snack = new EggRoll(50);
			break;
		}
		
		case "Shawarma": {
			snack = new Shawarma(80);
			break;
		}
		
		case "VadaPav": {
			snack = new Vadapav(20);
			break;
		}
		default:
			System.out.println("No Such Item... Sorry");
			break;
		}
		
		return snack;
	}

	
	

	
	
}
