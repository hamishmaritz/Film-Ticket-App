package assignment;

public class Ticket {
	
	// CUSTOMER AND FILM OBJECTS(PROBABLY WRONG --- NEEDS FIXIN)
	Customer customer = new Customer();
	Film film = new Film();

	double cost() {
		double pamount = 0;
		
		// If Customer Is 18 Or Over and 65 and Under
		if (customer.age >= 18 && customer.age <= 65) {
			pamount = 10;
		}
		// If Customer Is Under 18
		else if (customer.age < 18) {
			pamount = 7;
		}
		
		else if(customer.age > 65)
		{
			pamount = 10;
		}

		// The CUSTOMER DISCOUNT
		double discount = 0;

		// If Student and Between 10 and 25 
		if ("Y" == customer.ifStudent || "y" == customer.ifStudent) {
			if (customer.age >= 10 && customer.age <= 25) {
				discount = 0.15;
			}
			// If Over 25 
			else if (customer.age > 25) {
				discount = 0.10;
			}
			// Default Discount
			else
				discount = 0;
		}
		
		// If Customer Is Not A Student 
		else if ("N" == customer.ifStudent || "n" == customer.ifStudent) {
			if (customer.age >= 65) {
				discount = 0.07;
			}
			else
				discount = 1;
		}
		// Returns Ticket Amount and Discount Applied
		
		return pamount * (1 - discount);	
	}
	// Constructor
	public Ticket(Customer customer, Film film) {
		this.customer = customer;
		this.film = film;
	}

	@Override
	public String toString() {
		return "FILM TICKET for: " + film.title + " Rating: (" + film.rating + ")" + "\n" + "CUSTOMER DETAILS: "
				+ customer.name + " Age: " + customer.age + " Student? " + customer.ifStudent + "\n" + "TOTAL COST: $"
				+ cost();

	}
}
