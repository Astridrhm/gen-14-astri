/**
 * 
 */
package com.prodemy.gen14;

/**
 * @author astridrhm
 *
 */
public class SampelTipeData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte b1 = (byte) 65; //angka -127 sampai 127
		short s1 = 2;
		int x = 5;
		long l1 = 1L; //diberikan L dibelakang angka
		double d1 = 0.0; //angka yang ada desimal
		float f1 = 0.1f; //angka desimal lebih panjang dari double
	
	int hasiltambah = x+10;
	short hasilkali = (short)((short)s1*(short)10);
		
	System.out.println(b1);
	System.out.println(hasiltambah);
	System.out.println(hasilkali);
	
	String txt1 = "1" + "2";
	//sysout --> ctrl + spasi = System.out.println();
	System.out.println("txt1 -> " + txt1);
	}
}
