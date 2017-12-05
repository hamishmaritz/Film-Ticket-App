package assignment;

import java.util.Scanner;

public class CinemaTicketBookingApplication {
	// Variables
	static Scanner scan = new Scanner(System.in);
	private static int NUMBER_OF_FILMS = 4;
	public static Film[] film = new Film[NUMBER_OF_FILMS];
	String name;
	int age;
	String ifStudent;

	// Request Customer Details With Scanner
	private static Customer customerDetailsInput() 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String name = keyboard.nextLine();

		Scanner keyboard2 = new Scanner(System.in);
		System.out.println("Please enter your age:");
		int age = keyboard2.nextInt();

		Scanner keyboard3 = new Scanner(System.in);
		System.out.println("Are you a student?(Y/N)");
		String ifStudent = keyboard3.nextLine();
		// Save Customer Details into Details with Name, Age, If Student
		Customer details = new Customer(name, age, ifStudent);

		return details;
	}

	// Issue Film Selection
	private static Film filmSelection() 
	{
		scan = new Scanner(System.in);
		System.out.println("Which film would you like to watch?");
		// For Loop To Print Out Films In Array, Up to the total Film Amount(4)
		for (int i = 0; i < film.length; i++) 
		{
			System.out.println((i + 1) + " " + film[i].toString());
		}
		int selectFilm = scan.nextInt();
		return film[selectFilm - 1];
	}

	// Issue Ticket
	public static Ticket issueTicket(Customer aCustomer, Film aFilm) 
	{
		// If The Customer Age is lower than the Rating/Minimum Age then return null
		if (aCustomer.getAge() < aFilm.getRating().getMinAge()) 
		{
			return null;
		}
		// Save Details Into Ticket Object
		Ticket ticket = new Ticket(aCustomer, aFilm);	
		return ticket;
	}
	
	public static void main(String[] args) 
	{
		String choice = "";
		// Hard Coded Films Inside the Main, Lists All 4 Films alongside ENUM Ratings
		Film film1 = new Film("McLaren", RATING.G);
		Film film2 = new Film("Despicable Me 3", RATING.PG);
		Film film3 = new Film("Dunkirk", RATING.M);
		Film film4 = new Film("Cars 3", RATING.G);
		// Primitive Film Array
		film[0] = film1;
		film[1] = film2;
		film[2] = film3;
		film[3] = film4;

		// Runs The Cinema Ticket Purchasing System
		System.out.println("Welcome to the Cinema Ticket Purchasing System");
		do {
			Customer cd = customerDetailsInput();
			Film film = filmSelection();
			Object ticket = issueTicket(cd, film);
			// If Age Is Under Film Restriction Then Print Out Cannot Issue Ticket
			if (ticket == null) {
				System.out.println("Sorry cannot issue ticket for age restricted film.");
			}

			else {
				System.out.println("Your ticket is ready to be collected!");
				System.out.println("-------------------------------------");
				System.out.println(ticket.toString());
				System.out.println("-------------------------------------");
			}
			// Ask If Customer Would Like Another Ticket
			System.out.println("Another ticket?");
			scan = new Scanner(System.in);
			choice = scan.nextLine();
		} while (choice.equals("Y") || choice.equals("y"));

	}

}
