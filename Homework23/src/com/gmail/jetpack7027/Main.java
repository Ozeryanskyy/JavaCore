package com.gmail.jetpack7027;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double radius;
		System.out.println("Enter radius");
		radius = sc.nextDouble();
		double circumference;
		circumference = 2 * Math.PI * radius;
		System.out.println("Circunference=" + circumference);

	}

}
