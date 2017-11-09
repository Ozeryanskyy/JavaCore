package com.gmail.ozerianskyy;

public class Main {

	public static void main(String[] args) {

		int a = calculateSum(1, 123);
		System.out.println(a);
		drawLine(20);
		int b = calculateSum(1, 123, 123);
		System.out.println(b);
		drawLine(123);

	}

	static int calculateSum(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	static int calculateSum(int a, int b, int c) {
		int sum = a + b + c;
		return sum;
	}

	static void drawLine(int lenght) {
		for (int i = 0; i <= lenght; i++) {
			System.out.print("-");
		}
	}

}
