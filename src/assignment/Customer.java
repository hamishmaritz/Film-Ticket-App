package assignment;

public class Customer {
	// Variables
	String name;
	int age;
	String ifStudent;

	// Default Constructor Variables
	public Customer() {
		this.name = " ";
		this.age = 0;
		this.ifStudent = "NO";
	}
	// Constructor
	public Customer(String name, int age, String ifStudent) {
		this.name = name;
		this.age = age;
		this.ifStudent = ifStudent;
	}
	// Encapsulation
	public String getName() {
		return name;
	}

	public String getifStudent() {
		return ifStudent;
	}

	public int getAge() {
		return age;
	}
	// ToString
	@Override
	public String toString() {
		String student = "No";
		if ("Y" == student || "y" == student)
			student = "Yes";
		return "Customer Name:" + name + "Age: " + age + "Is A Student";

	}

}
