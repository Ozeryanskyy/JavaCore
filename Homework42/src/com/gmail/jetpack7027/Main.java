package com.gmail.jetpack7027;

public class Main {

	public static void main(String[] args) {
		int number;
		int n;
		for (number = 1; number <= 100; number++) {
			n = 0;
			for (int i = 1; i <= number; i++) {
				if (number % i == 0)
					n++;
			}
			if (n <= 2)
				System.out.println(number);
		}
	}
}