package com.gmail.jetpack7027;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a;
		int b;
		int c;
		int max = 0;

		System.out.println("Enter a b c");

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		/*if (a > b) {
			if (a > c) {
				max = a;

			} else {
				if (c > a) {
					max = c;
				}
			}
		} else {
			if (b > c) {
				max = b;
			} else {
				max = c;
			}
		}*/
		
		max=a;
		if (b>max) {
			max=b;
		}
		if (c>max) {
			max=c;
		}

		System.out.println(max);
	}
}
