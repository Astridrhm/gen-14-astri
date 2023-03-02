package com.tugas4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MenyimpanBarangkeFile {

	public static void main(String[] args) throws IOException {
		Barang b1 = new Barang("Oreo\t", 5000, 9);
		Barang b2 = new Barang("Silverqueen", 15000, 11);
		Barang b3 = new Barang("Ultra\t", 7000, 9);
		Barang b4 = new Barang("Pocky\t", 9000, 14);

		Barang[] daftarBarang = new Barang[4];
		daftarBarang[0] = b1;
		daftarBarang[1] = b2;
		daftarBarang[2] = b3;
		daftarBarang[3] = b4;

		for (int i = 0; i < daftarBarang.length; i++) {
			String outputText = "Nama Barang : " + daftarBarang[i].getNama() 
					+ "\tHarga : " + daftarBarang[i].getHarga()
					+ "\tPersediaan : " + daftarBarang[i].getPersediaan();

			saveToFile("DaftarBarang.txt", outputText, true);
		}
		
		File berkas = new File ("DaftarBarang.txt");
		Scanner myReader = new Scanner(berkas);
		
		while (myReader.hasNextLine()) {
			String data = myReader.nextLine();
			System.out.println(data);
		}
		myReader.close();
		
	}

	public static void saveToFile(String fileName, String text, boolean append) throws IOException {
		File berkas = new File(fileName);
		FileWriter fw = new FileWriter(berkas, append);	
		PrintWriter pw = new PrintWriter(fw);
		pw.println(text);
		pw.close();
	}

}
