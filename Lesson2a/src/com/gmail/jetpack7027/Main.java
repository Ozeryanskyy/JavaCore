package com.gmail.jetpack7027;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double fuelPrice ;
		System.out.println("Input fuel price");
		fuelPrice=sc.nextDouble();
		double fuel ;
		System.out.println("Input fuel per 100 km");
		fuel=sc.nextDouble();
		int distance ;
		System.out.println("Input distance");
		distance=sc.nextInt();
		double totalPrice;

		totalPrice = fuel / 100.0 * fuelPrice * distance * 2;
		
		System.out.println(totalPrice+"UAH");

	}

}
