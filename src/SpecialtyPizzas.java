import java.util.ArrayList;
/**
 * The SpecialtyPizzas class inherits the Pizza class and adds on types of pre-defined specialties
 * @author Thomas VanderBruggen
 * 
 */
public class SpecialtyPizzas extends Pizza {
	private Specialties specialty; 
	/**
	 * Holds each available specialty pizza 
	 * SELECT_ONE is used for the GUI as the default selection in a dropdown menu
	 */
	enum Specialties { 
		SELECT_ONE,
		MEATLOVERS, // pepperoni, italian sausage, sausage, canadian bacon, ham, chicken, red
		SUPREME, // pepperoni, sausage, green pepper, onion, black olive, red
		HAWAIIAN, // bacon, candian bacon, pineapple, red
		VEGGIE, // mushroom, green pepper, onion, black olive, green olive, red
		CHICKENBACONRANCH, // chicken, bacon, ranch
		BUFFALOCHICKEN, // chicken, banana pepper, buffalo
	}
	public SpecialtyPizzas(Specialties specialty, ArrayList<String> toppings, String sauce, Sizes size, Crusts crust) {
		super(toppings, sauce, size, crust);
		this.specialty = specialty; 
	}
	
	@Override
	/**
	 * @return Pizza.printPizaa() with the type of specialty pizza printed first 
	 */
	public String printPizza() {
		/**
		 * example output of a Large Pan Hawaiian pizza
		 * Hawaiian
		 * L Pan 
		 *      Traditional
		 *      Canadian Bacon
		 *      Bacon
		 *      Pineapple
		 */
		String pizzaSpecialty = ""; 
		switch(specialty) {
		case MEATLOVERS:
			pizzaSpecialty = "Meatlovers";break;
		case SUPREME:
			pizzaSpecialty = "Supreme";break;
		case HAWAIIAN:
			pizzaSpecialty = "Hawaiian";break;
		case VEGGIE:
			pizzaSpecialty = "Veggie";break;
		case CHICKENBACONRANCH:
			pizzaSpecialty = "CBR";break;
		case BUFFALOCHICKEN:
			pizzaSpecialty = "Buffalo Chicken"; break;
			
		}
		return pizzaSpecialty + "\n" + super.printPizza();
	}
	/**
	 * @return the price of the specialty pizza
	 */
	public double getPrice() {
		double price = 0;
		switch (size) {
		case PERSONAL:
			price = 6.99;break;
		case SMALL:
			price = 8.99;break;
		case MEDIUM:
			price = 10.99;break;
		case LARGE:
			price = 12.99;break;
		case XL:
			price = 14.99;break;
		}
		return price;
	}
	
}
