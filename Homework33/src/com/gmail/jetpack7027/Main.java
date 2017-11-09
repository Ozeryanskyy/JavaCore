package com.gmail.jetpack7027;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();

		if (number < 10000) {
			int one = number / 1000;
			int two = number % 1000 / 100;
			int three = number % 100 / 10;
			int four = number % 10;
			int partOne = one + two;
			int partTwo = three + four;

			if (partOne == partTwo) {
				System.out.println("You are lucky");
			} else {
				System.out.println("Better luck next time");
			}

		} else {
			System.out.println("Invalid number");
		}

	}

}
