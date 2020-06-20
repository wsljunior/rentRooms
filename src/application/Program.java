package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bedrooms;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			Bedrooms[] vect = new Bedrooms[9];
			System.out.println("How many rooms will be rented: ");
			int rooms = sc.nextInt();

			for (int i = 1; i <= rooms; i++) {
				System.out.println("\nrent #" + i);
				System.out.printf("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.printf("Email: ");
				String email = sc.nextLine();
				System.out.printf("Room: ");
				int room = sc.nextInt();
				vect[room] = new Bedrooms(name, email, room);
			}
			System.out.println("\nBusy Rooms: ");
			for (int i = 0; i < vect.length; i++) {
				if (vect[i] != null) {
					System.out.println(vect[i].getRoom() + ": " + vect[i].getName() + ", " + vect[i].getEmail());
				}
			}
		}

	}

}
