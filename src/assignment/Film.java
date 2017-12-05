package assignment;

public class Film {
	
	// Variables
	public String title;
	public RATING rating;

	// Default Constructor With Values
	public Film() {
		this.title = "Unknown";
		this.rating = RATING.G;
	}

	// Constructor With Input
	public Film(String title, RATING rating) {
		this.title = title;
		this.rating = rating;
	}

	// Data Encapsulation
	public String getTitle() {
		return title;
	}

	public RATING getRating() {
		return rating;
	}

	// To String
	@Override 
	public String toString() {
		return title + "  " + rating + "";
	}

}
