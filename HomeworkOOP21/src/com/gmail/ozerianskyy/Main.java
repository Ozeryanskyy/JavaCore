package com.gmail.ozerianskyy;

public class Main {

	public static void main(String[] args) {
		Point a = new Point(0, 0);
		Point b = new Point(0, 1);
		Point c = new Point(1, 1);
		Point d = new Point(3, 1);
		
		Square square = new Square(a, b, c, d);
		
		double squarePerimetr = square.getPerimetr();
		System.out.println(squarePerimetr);
		
		double squareArea = square.getArea();
		System.out.println(squareArea);
		
		Triangle tri = new Triangle(a, b , c);
		
		double triPerimetr = tri.getPerimetr();
		System.out.println(triPerimetr);
		
		double triArea = tri.getArea();
		System.out.println(triArea);
	}

}
