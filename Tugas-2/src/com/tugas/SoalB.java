/**
 * 
 */
package com.tugas;

import java.util.Scanner;

/**
 * @author astridrhm
 *
 */
public class SoalB {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nilai n : ");
		int n = input.nextInt();
		input.close();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j || i+j == n-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
