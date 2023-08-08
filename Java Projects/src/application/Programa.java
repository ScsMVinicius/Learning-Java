package application;

import java.util.Scanner;

import entities.Holder;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter accout number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter accout holder: ");
		sc.nextLine();
		String name = sc.nextLine();

		Holder holder = new Holder(accountNumber, name);
		System.out.print("Is there an initial deposity (y/n)");
		char answer = sc.next().charAt(0);

		if (answer == 'y') {

			System.out.print("Enter Initial deposit value : ");
			double value = sc.nextDouble();
			holder.deposit(value);
			System.out.println();
			System.out.printf("Account data: %n" + holder);
			System.out.println();

		} else {
			System.out.println();
		}

		System.out.print("Enter a deposit value: ");
		double value = sc.nextDouble();
		holder.deposit(value);
		System.out.printf("Account data: %n" + holder);
		System.out.println();
		System.out.println();

		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		holder.withdraw(value);
		System.out.printf("Account data: %n" + holder);
		System.out.println();

		sc.close();

	}

}
