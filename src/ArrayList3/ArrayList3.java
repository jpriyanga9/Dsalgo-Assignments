package ArrayList3;

import java.util.ArrayList;

public class ArrayList3 {
	public static void main(String[]args) {
		
		ArrayList<String> appetizers = new ArrayList<String>();
		ArrayList<String> meals = new ArrayList<String>();
		ArrayList<String> desserts = new ArrayList<String>();	
		
		appetizers.add("Soup");
		appetizers.add("Mushrooms");
		appetizers.add("Cheese");
		appetizers.add("Chips"); 
		appetizers.add("Fries"); 
		System.out.println("What are your favourite appetizers");
		System.out.println("My favourite appetizers are" );
		for (String str : appetizers)
            System.out.println(str);
		
		meals.add("Hamburger");
		meals.add("Hot dogs");
		meals.add("Pizza");
		meals.add("Rice bowl"); 
		meals.add("Burger"); 
		System.out.println("What are your favourite meals");
		System.out.println("My favourite meals are" );
		for (String str : meals)
            System.out.println(str);
		
		desserts.add("Ice cream");
		desserts.add("Pie");
		desserts.add("Cake");
		desserts.add("Sweets"); 
		desserts.add("Pudding"); 
		System.out.println("What are your favourite desserts");
		System.out.println("My favourite desserts are" );
		for (String str : desserts)
            System.out.println(str);
		
	}


}
