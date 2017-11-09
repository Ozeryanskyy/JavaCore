package com.gmail.ozerianskyy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter apartment number");

		int number = sc.nextInt();

		if (number <= 144 && number >= 1) {
			int entrance = number / 36 + 1;
			int floor = number % 36 / 4 + 1;
			System.out.println("Entrance:" + entrance + " Floor:" + floor);
		} else {
			System.out.println("Invalid number");
		}

	}

}
