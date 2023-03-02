/**
 * 
 */
package com.tugas3;

import java.util.Scanner;

/**
 * @author astridrhm
 *
 */
public class Soal6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Masukkan kalimat : ");
		String kalimat = input.nextLine();
		input.close();
		
		int a = 0, e = 0, i = 0, u = 0, o = 0;
		
		for (int x = 0 ; x < kalimat.length() ; x++) {
			char ch = kalimat.charAt(x);
			if (ch == 'a') a++; 
			if (ch == 'e') e++; 
			if (ch == 'o') o++; 
			if (ch == 'u') u++; 
			if (ch == 'i') i++; 
		}
		
		System.out.println("a = "+ a);
		System.out.println("i = "+ i);
		System.out.println("u = "+ u);
		System.out.println("e = "+ e);
		System.out.println("o = "+ o);
	}
}
