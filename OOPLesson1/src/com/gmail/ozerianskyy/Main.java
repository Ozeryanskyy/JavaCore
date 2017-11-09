package com.gmail.ozerianskyy;

public class Main {

	public static void main(String[] args) {
		Car carOne = new Car();

		carOne.setColor("red"); 
		carOne.setYear(1992);
		carOne.setWeight(2000);
		carOne.acceleration(30);

		Car carTwo = new Car("Blue", 1500, 2009);

		System.out.println(carOne);
		System.out.println(carTwo);
	}

}
