/**
 * 
 */
package com.tugas;

import java.util.Scanner;

/**
 * @author astridrhm
 *
 */
public class SoalC {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nilai n : ");
		int n = input.nextInt();
		input.close();

		for (int i = 0; i < n; i += 1) {
			for (int j = 0; j < n; j++) {
				System.out.print(j);

			}
			System.out.println();
		}

	}
}
