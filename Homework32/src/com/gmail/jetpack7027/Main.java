package com.gmail.jetpack7027;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double ax = 0;
		double ay = 0;
		double bx = 4;
		double by = 4;
		double cx = 6;
		double cy = 1;

		double a = Math.sqrt(Math.pow(bx - cx, 2) + Math.pow(by - cy, 2));
		double b = Math.sqrt(Math.pow(ax - cx, 2) + Math.pow(ay - cy, 2));
		double c = Math.sqrt(Math.pow(bx - ax, 2) + Math.pow(by - ay, 2));

		double p = (a + b + c) / 2;
		double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		System.out.println("Enter the coordinates of the point M");
		Scanner sc = new Scanner(System.in);
		double mx = sc.nextDouble();
		double my = sc.nextDouble();

		double ma = Math.sqrt(Math.pow(mx - ax, 2) + Math.pow(my - ay, 2));
		double mb = Math.sqrt(Math.pow(mx - bx, 2) + Math.pow(my - by, 2));
		double mc = Math.sqrt(Math.pow(mx - cx, 2) + Math.pow(my - cy, 2));

		double pa = (mb + mc + a) / 2;
		double areaA = Math.sqrt(pa * (pa - a) * (p - mb) * (p - mc));
		double pb = (ma + mc + b) / 2;
		double areaB = Math.sqrt(pb * (pb - ma) * (p - b) * (p - mc));
		double pc = (ma + mb + c) / 2;
		double areaC = Math.sqrt(pc * (pc - ma) * (p - mb) * (p - c));
		double areaM = areaA + areaB + areaC;

		if (areaM == area) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
