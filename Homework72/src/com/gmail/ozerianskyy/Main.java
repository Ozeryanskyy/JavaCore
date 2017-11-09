package com.gmail.ozerianskyy;

public class Main {

	public static void main(String[] args) {
		int a = 117;
		int b = 17;
		int[] arrA = intToBinary(a);
		int[] arrB = intToBinary(b);
		int distance=0;
		for (int i = 0; i < arrB.length; i++) {
			if (arrB[i]!=arrA[i]) {
				distance++;
			}
			
		}
		System.out.println(distance);
	}

	public static int[] intToBinary(int a) {
		int b;
		int i=7;
		int arr[]=new int[8];
		while (a != 0) {
			b = a % 2;
			arr[i]=b;
			a = a / 2;
			i--;
		}
		return arr;
		}

}
