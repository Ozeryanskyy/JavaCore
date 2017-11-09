package com.gmail.ozerianskyy;

public class Circle extends Shape {
	
	private Point a;
	private Point b;
	private double perimetr;
	private double radius;
	
	public void calculateRadius() {
		double aX=a.getX();
		double aY=a.getY();
		double bX=b.getX();
		double bY=b.getY();
		
		radius = Math.sqrt(Math.pow(bX - aX, 2) + Math.pow(bY - aY, 2));
		
	}
	
	public double getPerimetr() {
		calculateRadius();
		perimetr = 2*Math.PI*radius;
		
		return radius;
	}
	
	public double getArea() {
		calculateRadius();
		
		double area = Math.PI * (Math.pow(radius, 2));
		return area;
		
	}
}
