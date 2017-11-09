package com.gmail.ozerianskyy;

import java.util.Arrays;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] sequence = new int[10];
		int i = 0;
		Scanner sc = new Scanner(System.in);

		for (int element : sequence) {

			System.out.println("Enter " + (i + 1) + " sequence element ");
			System.out.println("If you want to stop enter <-1>");
			int a = sc.nextInt();
			if (a == -1) {
				break;
			} else {
				sequence[i] = a;
				i++;
			}
		}
		
		if (sequence[3]-sequence[2]==sequence[2]-sequence[1]) {
			one(sequence[i-1], sequence[0]);
		} else if (sequence[3] / sequence[2] == sequence[1]) {
			two(sequence[i-1], sequence[1]);
		} else if (sequence[3] % 4 == 0 && sequence[3] / 4 % 4 == 0) {
			three(i+1, sequence[1]);
		} else {
			System.out.println("invalid insert");
		}
	}

	public static void one(int a, int b) {
		int result = a + b;
		System.out.println(result);
	}

	public static void two(int a, int b) {
		int result = a * b;
		System.out.println(result);
	}
	
	public static void three(int a, int b) {
		int j=0;
		int k=2;
		int result=1;
		while(k<=b) {
			k=2*k;
			j++;
		}
		for(int n=1; n<=j; n++) {
			result=result*a;
		}
		System.out.println(result);
	}

}
