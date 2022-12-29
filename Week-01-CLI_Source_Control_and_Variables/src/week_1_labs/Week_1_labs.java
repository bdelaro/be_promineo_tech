package week_1_labs;

import javax.print.attribute.standard.MediaSize.ISO;

//Variables and Operations
public class Week_1_labs {
	public static void main(String[] args) {

		// create a variable to hold the quantity of available plane seats left on a
		// flight
		int availablePlaneSeats = 7;
		// create a variable to hold the cost of groceries
		double costOfGroceries = 12.99;
		// create a variable to hold a person's middle initial
		char middleInitial = 'A';
		// create a variable to hold true if it's hot outside and false if it's cold
		// outside
		boolean isHotOutside = false;
		// create a variable to hold a customer's first name
		String customerFirstName = "Adam";
		// create a variable to hold a street address
		String streetAddress = "123 W 123rd St";
		// Print all variables to the console
		System.out.println("Available seats left on the plane: " + availablePlaneSeats);
		System.out.println(costOfGroceries + " is the price for groceries.");
		System.out.println("The person's middle intial is " + middleInitial);
		System.out.println("It is hot outside - " + isHotOutside);
		System.out.println("The customer's first name is " + customerFirstName);
		System.out.println(streetAddress + " is where the person lives.");
//		---------------------------------------------------------------------------------------
		// a customer booked 2 plane seats, remove 2 seats from the available seats
		// variable
		availablePlaneSeats -= 2;
		System.out.println(availablePlaneSeats);
		// impulse candy bar purchase, add 2.15 to the grocery total
		costOfGroceries += 2.15;
		System.out.println(costOfGroceries);
		// birth certificate was printed incorrectly, change the middle initial to
		// something else
		middleInitial = 'D';
		System.out.println(middleInitial);
		// the season has changed, update the hot outside variable to be opposite of
		// what it was
		isHotOutside = true;
		System.out.println(isHotOutside);
		// create a new variable called full name using the customer's first name, the
		// middle initial, and a last name of your choice
		String fullName = customerFirstName + " " + middleInitial + " Bates";
		System.out.println(fullName);
		// print a line to the console that introduces the customer and says they live
		// at the address variable
		System.out.println("This is " + fullName + ", and they live at " + streetAddress);

	}
}
