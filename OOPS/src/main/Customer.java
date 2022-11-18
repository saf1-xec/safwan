package main;

import java.util.ArrayList;

import fastFood2.FastFoodCorner;
import fastFood2.Snack;

public class Customer {

	
	public static void main(String[] args) {
		 Integer total=0;
		
		FastFoodCorner shop = new FastFoodCorner("Temptation" , "Margao");
		
		System.out.println("Welcome to "+ shop.getName()+ " " +shop.getLocation());
		
		ArrayList<String> orderList = new ArrayList<>();
		
        orderList.add("VadaPav");
        orderList.add("CheeseSandwich");
        orderList.add("ChickenPizza");
               
		
        
        ArrayList<Snack> o= shop.orderAtOnce(orderList);
        
    

		
		System.out.println("Thank You for ordering: ");
		for (Snack snack : o) {
			System.out.println(snack.getProductName());
			total+=snack.getPrice();
		}
		System.out.println("Your Total Will be: "+total);
	
		
	
	}

}
