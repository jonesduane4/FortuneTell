import java.util.Scanner;

public class Fortune {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String firstName;
		String lastName;
		int age;
		String favColor;
		int siblings;
		int birthMonth;
		System.out.println("What is your first name? ");
		firstName = input.next();

		System.out.println("What is your last name? ");
		lastName = input.next();

		System.out.println("How old are you? ");
		age = input.nextInt();

		if (age % 2 == 0) {
			System.out.println("You will live a fulfilling life! ");
		} else {
			System.out.println("You will be financially FREE! ");
		}

		System.out.println("What month were 'number' you born? ");
		birthMonth = input.nextInt();

		if (birthMonth >= 1 && birthMonth <= 4) {
			System.out.println("You will make Millions! ");
		} else if (birthMonth >= 5 && birthMonth <= 8) {
			System.out.println("You will make Billions! ");
		} else if (birthMonth >= 9 && birthMonth <= 12) {
			System.out.println("You will make Trillions ");
		} else if (birthMonth > 12 && birthMonth < 1) {
			System.out.println("You probably don't exist! ");
		}

		System.out.println("What is your favorite ROYGBIV Color?: ");
		System.out.println("Type (Help) if you don't know what ROYGBIV is. ");
		favColor = input.next();

		if (favColor.equalsIgnoreCase("Help")) {
			System.out.println("ROYGBIV Stands For: Red, Orange, Yellow, Green, Blue, Indigo, Violet. ");
			System.out.println("Select Your Favorite ROYGBIV Color. ");
			favColor = input.next();
		}

		if (favColor.equalsIgnoreCase("red")) {
			System.out.println("You will use a Broom Stick to Travel! ");

		} else if (favColor.equalsIgnoreCase("orange")) {

			System.out.println("You will use a 'real' Hoverboard to Travel!");
		}
		if (favColor.equalsIgnoreCase("yellow")) {

			System.out.println("You will use a Water Vapor Powered Scooter to Travel!");

		} else if (favColor.equalsIgnoreCase("green")) {
			System.out.println("You will use Dark Matter Skates to Travel!");

		}

		if (favColor.equalsIgnoreCase("blue")) {
			System.out.println("You will use a Solar Powered vehicle to Travel!");

		}

		else if (favColor.equalsIgnoreCase("indigo")) {
			System.out.println("You will use Teleportation to Travel!");

		}

		else if (favColor.equalsIgnoreCase("violet")) {
			System.out.println("You will use a Dragon Fly to Travel! ");
		}

		System.out.println("How many siblings do you have? ");
		siblings = input.nextInt();

		if (siblings == 0) {
			System.out.println("You will OWN multiple properties in Thailand! ");
		} else if (siblings == 1) {
			System.out.println("You will OWN land in Okinawa Japan! ");
		} else if (siblings == 2) {
			System.out.println("You will OWN a resort n Barcelona, Spain! ");
		} else if (siblings == 3) {
			System.out.println("You will OWN a Moorish Temple in Marrakesh, Morocco! ");
		} else if (siblings > 3) {
			System.out.println("You will OWN a Tea Salon in Columbus, Ohio! ");
		} else {
			System.out.println("You will OWN a Bath House in Kiev, Ukraine! ");

			
			//only part I was truly having trouble with.
			System.out.println(firstName + " " + lastName + " " + age + " " + birthMonth + " " + favColor + " " + siblings + ".");

		}

	}

}
