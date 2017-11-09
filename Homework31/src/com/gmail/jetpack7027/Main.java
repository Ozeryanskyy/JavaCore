package com.gmail.jetpack7027;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter x y");
		
		double x;
		double y;
		
		x=sc.nextDouble();
		y=sc.nextDouble();
		
		double length = Math.sqrt(x*x+y*y);
		
		if(length < 4) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		

	}

}
