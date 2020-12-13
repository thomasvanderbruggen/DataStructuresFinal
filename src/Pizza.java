import java.util.ArrayList;
import java.util.HashMap;
/**
 * 
 * @author Thomas VanderBruggen
 * The pizza class is used to store pizza orders
 */
public class Pizza {
	/**
	 * Toppings holds the specific toppings for the pizza
	 */
	 
	protected ArrayList<String> toppings;
	protected String sauce; 
	protected Sizes size; 
	protected Crusts crust;
	/*
	 * All possible sizes of pizza
	 */
	enum Sizes { 
		PERSONAL,
		SMALL,
		MEDIUM,
		LARGE,
		XL
	}
	/*
	 * the available crusts for the pizzas 
	 */
	enum Crusts { 
		THIN,
		GF,
		PAN,
		HANDTOSSED
	}
	/**
	 * Default constructor creates Large hand-tossed cheese pizza
	 */
	public Pizza () { 
		toppings = new ArrayList<String>(); 
		sauce = "Traditional"; 
		size = Sizes.LARGE;
		crust = Crusts.HANDTOSSED;
	}
	/**
	 * 
	 * @param toppings to be added to pizza
	 * @param sauce the sauce the ordered pizza uses
	 * @param size the size of the ordered pizza
	 * @param crust what type of crust to use on the pizza
	 */
	public Pizza(ArrayList<String> toppings, String sauce, Sizes size, Crusts crust) { 
		this.toppings = toppings; 
		this.sauce = sauce; 
		this.size = size; 
		this.crust = crust;
	}
	/**
	 * 
	 * @return the price of the pizza
	 */
	public double getPrice() {
		double price = 0; 
		HashMap<String, Double> toppingsWithPrice = new HashMap<String, Double>(); // holds the a la carte pricing for toppings
		toppingsWithPrice.put("Pepperoni", .45); 
		toppingsWithPrice.put("Bacon", .99);
		toppingsWithPrice.put("Beef", .45); 
		toppingsWithPrice.put("Canadian Bacon", .35); 
		toppingsWithPrice.put("Chicken", .40); 
		toppingsWithPrice.put("Italian Sausage", .45); 
		toppingsWithPrice.put("Sausage", .45);
		toppingsWithPrice.put("Banana Peppers", .25); 
		toppingsWithPrice.put("Black Olives", .25); 
		toppingsWithPrice.put("Green Olives", .25); 
		toppingsWithPrice.put("Jalapenos", .25); 
		toppingsWithPrice.put("Mushrooms", .25); 
		toppingsWithPrice.put("Onions", .25); 
		toppingsWithPrice.put("Pineapple", .40); 
		toppingsWithPrice.put("Green Pepper", .25); 
		switch (size) {
		case PERSONAL: 
			price = 4.99;break;
		case SMALL:
			price = 6.99;break;
		case MEDIUM:
			price = 8.99;break;
		case LARGE:
			price = 10.99;break;
		case XL:
			price = 12.99;break;
		}
		for (String topping:toppings) { // for each topping in the ArrayList of toppings, add it's a la carte price
			price += toppingsWithPrice.get(topping);
		}
		return price;
	}
	/**
	 * 
	 * @return a formatted string of the pizza's specifications
	 */
	public String printPizza() {
		/*
		 * example output for large, handtossed pizza with italian sausage and pepperoni
		 * L HT
		 *        italian sausage
		 *              pepperoni
		 */
		String pizzaSize = "", crustType = "",pizzaToppings ="\t";
		switch(size) {
		case PERSONAL:
			pizzaSize = "P";break;
		case SMALL:
			pizzaSize = "S";break;
		case MEDIUM:
			pizzaSize = "M";break;
		case LARGE:
			pizzaSize = "L";break;
		case XL:
			pizzaSize = "XL";break;
		}
		switch(crust) { 
		case THIN:
			crustType = "Thin";break;
		case GF:
			crustType = "GF";break;
		case PAN:
			crustType = "Pan";break;
		case HANDTOSSED:
			crustType = "HandTossed";break;
		}
		for (String topping: toppings) { // for each topping in ArrayList toppings
			pizzaToppings += topping + "\n\t";
		}
		return pizzaSize + " " + crustType + "\t\t\t\t" + getPrice() + "\n" + "\t" + sauce + "\n" + pizzaToppings;
	}
	
	
}
