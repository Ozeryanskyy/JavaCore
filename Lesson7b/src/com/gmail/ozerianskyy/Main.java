package com.gmail.ozerianskyy;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(getStringFromDouble(Math.PI, 10));

	}
	
	public static String getStringFromDouble(double number, int n) {
		String text = String.format("%."+ n +"f", number);
		return text;
	}


}