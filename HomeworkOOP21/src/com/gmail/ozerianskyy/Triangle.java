package com.gmail.ozerianskyy;

public class Triangle extends Shape {

	private Point a;
	private Point b;
	private Point c;
	private double perimetr;
	private double area;
	private double sideA;
	private double sideB;
	private double sideC;

	private void calculateSides() {
		double aX = a.getX();
		double aY = a.getY();
		double bX = b.getX();
		double bY = b.getY();
		double cX = c.getX();
		double cY = c.getY();

		sideA = Math.sqrt(Math.pow(bX - cX, 2) + Math.pow(bY - cY, 2));
		sideB = Math.sqrt(Math.pow(aX - cX, 2) + Math.pow(aY - cY, 2));
		sideC = Math.sqrt(Math.pow(bX - aX, 2) + Math.pow(bY - aY, 2));

	}

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getPerimetr() {
		calculateSides();
		if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
			perimetr = sideA + sideB + sideC;
		} else {
			System.out.println("not a triangle");
			perimetr = 0;
		}
		return perimetr;
	}

	public double getArea() {
		calculateSides();
		double p = perimetr / 2;
		if (p > 0) {
			area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
		} else {
			System.out.println("not a triangle");
			area = 0;
		}
		return area;
	}

}
