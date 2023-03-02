/**
 * 
 */
package com.tugas;

import java.util.Scanner;

/**
 * @author astridrhm
 *
 */
public class SoalA {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nilai n : ");
		int n = input.nextInt();
<<<<<<< HEAD
		input.close();
=======
>>>>>>> branch 'master' of git@github.com:Astridrhm/gen-14-astri.git

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


