package com.gmail.jetpack7027;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a;
		double b;
		double c;

		System.out.println("Enter triangle sides length");

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		double p;
		p = (a + b + c) / 2;
		double s;
		s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.println("Triangle area =" + s);

	}

}
