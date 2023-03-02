package com.prodemy.gen14;

import java.util.Arrays;

public class SampelArray {

	public static void main(String[] args) {
		// array dengan integer
		int[] arrayGanjil = new int[5];

		arrayGanjil[0] = 1;
		arrayGanjil[1] = 3;
		arrayGanjil[2] = 5;
		arrayGanjil[3] = 7;
		arrayGanjil[4] = 9;

		System.out.println(Arrays.toString(arrayGanjil));

		for (int i = 0; i < arrayGanjil.length; i++) {
			System.out.print(arrayGanjil[i] + " ");
		}

		// array dengan menggunakan string
		String[] arrayString = new String[5];

		arrayString[0] = "test1";
		arrayString[1] = "test1";
		arrayString[2] = "test1";
		arrayString[3] = "test1";

		for (int i = 0; i < arrayString.length; i++) {
			System.out.print(arrayString[i] + " ");
		}
	}
}