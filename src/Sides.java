import java.util.HashMap;

public class Sides {
	/**
	 * side holds the current side item
	 */
	private String side;
	public Sides(String side) { 
		this.side = side; 
	}
	/**
	 * 
	 * @return the side
	 */
	public String getSide() {
		return side; 
	}
	/**
	 * 
	 * @return a formatted string to output the side
	 */
	public String printSide() {
		return side + "\t\t\t" + getPrice();
	}
	/**
	 * 
	 * @return the price of the side 
	 */
	public double getPrice() {
		HashMap<String, Double> sidePrices= new HashMap<String, Double>(); //The prices for each individual side
		sidePrices.put("4 Buffalo Wings", 3.29); 
		sidePrices.put("6 Buffalo Wings", 4.29); 
		sidePrices.put("8 Buffalo Wings", 5.29); 
		sidePrices.put("12 Buffalo Wings", 7.29);
		sidePrices.put("Chicken Alfredo", 6.99); 
		sidePrices.put("Rig w/MeatSauce", 6.99);
		sidePrices.put("Ravioli\t", 6.99); 
		sidePrices.put("Mac and Cheese", 3.99); 
		sidePrices.put("Fried Pickles", 4.99);
		sidePrices.put("Jala Poppers", 4.99);
		sidePrices.put("Mozzarella Sticks", 4.99);
		sidePrices.put("Fried Ravioli", 6.99);
		sidePrices.put("Cup of Red", .50); 
		sidePrices.put("Cup of Ranch", .50); 
		sidePrices.put("Cup of Mild", .50); 
		sidePrices.put("Cup of Buffalo", .50); 
		return sidePrices.get(side);
	}
}
