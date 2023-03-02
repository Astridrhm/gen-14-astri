package com.prodemy.gen14;

public class CaseHargaBarang {

	public static void main(String[] args) {
		String[] namaBarang = new String[3];
		int[] hargaBarang = new int[3];
		int[] jumlahStok = new int[3];

		namaBarang[0] = "oreo";
		hargaBarang[0] = 5000;
		jumlahStok[0] = 13;

		namaBarang[1] = "coklat";
		hargaBarang[1] = 10000;
		jumlahStok[1] = 10;

		namaBarang[2] = "susu";
		hargaBarang[2] = 7000;
		jumlahStok[2] = 2;

		for (int i = 0; i < namaBarang.length; i++) {
			System.out.println(
					"Nama Barang : " + namaBarang[i] + "-> Harga : " + hargaBarang[i] + "-> Jumlah : " + jumlahStok[i]);
		}

		Barang[] daftarBarang = new Barang[1];

		Barang b1 = new Barang();
		b1.nama= "oreo";
		b1.harga = 5000;
		b1.persediaan = 10;

		daftarBarang[0] = b1;
		for (int i = 0; i < daftarBarang.length; i++) {
			System.out.println("Nama Barang : " + daftarBarang[i].nama + "-> Harga : " + daftarBarang[i].harga + "-> Persediaan :"
					+ daftarBarang[i].persediaan);
		}

	}

}
