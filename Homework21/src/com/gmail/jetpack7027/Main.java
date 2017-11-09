package com.gmail.jetpack7027;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int number;
		System.out.println("Enter number");
		number = sc.nextInt();
		int one;
		int two;
		int three;
		int four;
		int five;

		one = number / 10000;
		two = number % 10000 / 1000;
		three = number % 1000 / 100;
		four = number % 100 / 10;
		five = number % 10;

		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);

	}

}
