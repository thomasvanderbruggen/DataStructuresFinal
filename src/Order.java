import java.util.ArrayList;

public class Order {
	/** 
	 * Two parallel ArrayLists that either the items in the order (orderItems) or the price for each item(orderItemsPrices)
	 */
	private ArrayList<Object> orderItems; 
	private ArrayList<Double> orderItemsPrices;
	public Order() {
		orderItems = new ArrayList<Object>(); 
		orderItemsPrices= new ArrayList<Double>();
	}
	/**
	 * Adds a Side object to the order
	 * @param item Side object to be added onto the order
	 */
	public void add(Sides item) {
		orderItems.add(item); 
		orderItemsPrices.add(item.getPrice());
	}
	/**
	 * Adds a Pizza object to the order
	 * @param item Pizza object to be added to order
	 */
	public void add(Pizza item) {
		orderItems.add(item); 
		orderItemsPrices.add(item.getPrice()); 
	}
	/**
	 * Adds a SpecialtyPizzas object to the order
	 * @param item SpecialtyPizzas object to be added to order
	 */
	public void add(SpecialtyPizzas item) { 
		orderItems.add(item); 
		orderItemsPrices.add(item.getPrice());
	}
	/**
	 * Descending order selectionSort algorithm based on the prices in orderItemsPrices
	 */
	public void sortOrder() {
		int n = orderItemsPrices.size(); 
		
		for (int i = 0; i < n-1; i++) {
			int max_index = i; 
			for (int j = i+1; j < n; j++) {
				if (orderItemsPrices.get(j) > orderItemsPrices.get(max_index)) {
					max_index = j;
				}
			}
			Object tempItem = orderItems.get(max_index); 
			double tempPrice = orderItemsPrices.get(max_index); 
			orderItems.set(max_index, orderItems.get(i)); 
			orderItemsPrices.set(max_index, orderItemsPrices.get(i)); 
			orderItems.set(i, tempItem);
			orderItemsPrices.set(i, tempPrice);
			
		}
	}
	/**
	 * returns a string object containing a formatted string of the order
	 * @return formatted string of the order 
	 */
	public String printOrder() {
		String orderOut = ""; 
		for (Object item: orderItems) {
			if (item instanceof Pizza) {
				Pizza a = (Pizza) item; 
				orderOut += a.printPizza();
			}else if (item instanceof SpecialtyPizzas) {
				SpecialtyPizzas x = (SpecialtyPizzas) item; 
				orderOut += x.printPizza(); 
			}else if (item instanceof Sides) {
				Sides x = (Sides) item; 
				orderOut += x.printSide();
			}
		orderOut += "\n";
		}
		return orderOut;
	}
	/**
	 * returns a double object containing the total price of the order
	 * @return the total price of the order
	 */
	public double getPrice() {
		double price = 0; 
		for (Double cost: orderItemsPrices) {
			price += cost;
		}
		return price;
	}
	public void clear() {
		orderItems = new ArrayList<Object>();
		orderItemsPrices = new ArrayList<Double>();
	}
}
