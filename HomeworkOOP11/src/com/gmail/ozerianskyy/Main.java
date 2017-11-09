package com.gmail.ozerianskyy;

public class Main {

	public static void main(String[] args) {

		Cat keks = new Cat("Keks", "white", "meat", 4.5, 5.2);
		Cat urga = new Cat("Urga", "ginger", "tuna", 3.2, 4.0);
		
		urga.getVoice();
		
		keks.checkFood("fish");
		
		keks.feed(2);
		
		System.out.println(keks.toString());
		
		urga.pet();
		
		System.out.println(urga.toString());
	}
}