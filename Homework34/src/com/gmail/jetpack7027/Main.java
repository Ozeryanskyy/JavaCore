package com.gmail.jetpack7027;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		
	    int number = sc.nextInt();
	    if (number < 1000000) {
	    	int one = number / 100000;
	    	int two = number % 100000 / 10000;
	    	int three = number % 10000/ 1000;
	    	int four = number % 1000 / 100;
	    	int five = number % 100 / 10;
	    	int six = number % 10;
	    	
	    	if ( one == six&&two==five&&three==four) {
	    		System.out.println("Palindrome");
	    	} else {
	    		System.out.println("Not a palindrome");
	    	}
	    } else {
	    	System.out.println("Invalid number");
	    }
		
	}

}
