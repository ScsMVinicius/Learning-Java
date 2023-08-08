package application;

import java.util.Scanner;

import entities.Student;

public class testeArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Student[] vet = new Student[10];

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i + 1) + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("E-Mail: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vet[room] = new Student(name, email);
		}

		System.out.println("Busy rooms:");

		for (int i = 0; i < 10; i++) {
			if (vet[i] != null) {
				System.out.println(i + ":" + vet[i].getName() 
				+ ", " + vet[i].getEmail());
			}

		}

		sc.close();
	}

}
