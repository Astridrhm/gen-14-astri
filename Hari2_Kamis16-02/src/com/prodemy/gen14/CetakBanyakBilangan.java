/**
 * 
 */
package com.prodemy.gen14;

/**
 * @author astridrhm
 *
 */
public class CetakBanyakBilangan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	int x1 = 1;
	/*
	 * System.out.println(x1);
	 * 
	 * x1 = x1+1; 
	 * System.out.println(x1);
	 * 
	 * x1 = x1+1; 
	 * System.out.println(x1);
	 * 
	 * x1 = x1+1; 
	 * System.out.println(x1);
	 */
	 
	 
	//menggunakan loopig untuk membuat proses pengulangan
	//menggunakan do_while
		do {
			System.out.println(x1);
			//Dapat digunakan
			//x1 = x1+1;
			//x1++; //postincrement = mengembalikan nilai x dan kemudian menambah
			x1 += 1; //operator += -> Pengisian dan Penambahan
		} while (x1<=4);
		
		
	//menggunakan for
//		int x1;
//		for (x1=1;x1<=100;x1=x1+1){
//		System.out.println(x1);}
	}
}
