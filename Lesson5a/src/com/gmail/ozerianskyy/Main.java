package com.gmail.ozerianskyy;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] arrayOne = new int[12];

		for (int i = 0; i < arrayOne.length; i++) {
			arrayOne[i] = (int) (Math.random() * 10000 + 10000);

		}
		Arrays.sort(arrayOne);
//		System.out.print(Arrays.toString(arrayOne));

		int sum = 0;

		// for (int i = 0; i < arrayOne.length; i++) {
		// sum=sum+arrayOne[i];
		// }

		for (int element : arrayOne) {
			sum+=element;

		}

		System.out.println(sum/12);

	}

}