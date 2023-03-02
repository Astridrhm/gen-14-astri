/**
 * 
 */
package com.tugas3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author astridrhm
 *
 */
public class Soal7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] namaBarang = new String[4];
		int[] hargaBarang = new int[4];

		
		namaBarang[0] = "Oreo";
		hargaBarang[0] = 6000;

		namaBarang[1] = "Tanggo";
		hargaBarang[1] = 5000;

		namaBarang[2] = "Buavita";
		hargaBarang[2] = 7000;

		namaBarang[3] = "Aqua";
		hargaBarang[3] = 3000;

		for (int i = 0; i < namaBarang.length; i++) {
			System.out.println("Nama Barang : " + namaBarang[i] + "\t-> Harga : " + hargaBarang[i]);
		}
		
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan Uang : ");
		int uang = input.nextInt();
		input.close();
				
		int cur_i = namaBarang.length;
		
		for (int i = 0; i < namaBarang.length; i++) {
			if( uang >= hargaBarang[i]) {
				if (cur_i == namaBarang.length || hargaBarang[i] > hargaBarang[cur_i]) {
					cur_i = i;
				}
			}
		}
		System.out.println(namaBarang[cur_i]);		
	}

}
