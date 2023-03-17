package com.barang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingBarang {

	public static void main(String[] args) {
		List<Barang> daftarBarang = new ArrayList<>();

		daftarBarang.add(new Barang("Oreo", 5000, 10));
		daftarBarang.add(new Barang("Ultra", 6000, 11));
		daftarBarang.add(new Barang("Silverqueen", 15000, 20));
		daftarBarang.add(new Barang("Pocky", 8000, 30));

		Collections.sort(daftarBarang, new Comparator<Barang>() {

			@Override
			public int compare(Barang o1, Barang o2) {
				return o1.getHarga() - o2.getHarga();
			}
		});

		System.out.println(daftarBarang);

		Collections.sort(daftarBarang, new Comparator<Barang>() {

			@Override
			public int compare(Barang o1, Barang o2) {
				return o1.getPersediaan() - o2.getPersediaan();
			}
		});
		System.out.println(daftarBarang);

		Collections.sort(daftarBarang, new Comparator<Barang>() {

			@Override
			public int compare(Barang o1, Barang o2) {
				return o1.getNama().compareTo(o2.getNama());
			}
		});
		System.out.println(daftarBarang);

		Collections.sort(daftarBarang);
		System.out.println(daftarBarang);
	}

}
