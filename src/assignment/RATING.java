package assignment;

public enum RATING {
	G(0), PG(13), M(16);

	private int minimumAge;

	private RATING(int minimumAge) {
		this.setMinimumAge(minimumAge);
	}

	// Get The Minimum Age;
	public int getMinAge() {
		return this.minimumAge;
	}

	// Set Minimum Age
	public void setMinimumAge(int minimumAge) {
		this.minimumAge = minimumAge;
	}

	// toString
	@Override
	public String toString() {
		return this.name();
	}

}