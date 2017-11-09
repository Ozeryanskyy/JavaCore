package com.gmail.ozerianskyy;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(calculateFactorial(5));

	}
	
	static long calculateFactorial(int n) {
		if (n<=1) {
			return 1;
		} else {
			return n*calculateFactorial(n-1);
		}
	}

}
