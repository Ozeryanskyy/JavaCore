package com.gmail.jetpack7027;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter odd lenght");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n % 2 == 1) {
			for (int i = 0; i < (n + 1) / 2; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= n - 2 * i; j++) {
					System.out.print("*");
				}
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				System.out.println();
			}
			for (int i = 1; i <= (n - 1) / 2; i++) {
				for (int j = 0; j < (n - 1) / 2 - i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < 1 + 2 * i; j++) {
					System.out.print("*");
				}
				for (int j = 0; j < (n - 1) / 2 - i; j++) {
					System.out.print(" ");
				}
				System.out.println();
			}
		} else {
			System.out.println("Invalid number");
		}
	}
}
