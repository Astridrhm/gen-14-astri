package com.tugas;

public class Perhitungan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lingkaran l = new Lingkaran(4);
		Persegi p = new Persegi(9);
		Segitiga s = new Segitiga(2, 3, 9);
		BelahKetupat b = new BelahKetupat(6, 9, 13);

		BidangDatar[] daftarBidang = new BidangDatar[4];

		BidangDatar bd1 = new BidangDatar("Lingkaran", +l.HitungLuas(), +l.HitungKeliling());
		BidangDatar bd2 = new BidangDatar("Persegi", +p.HitungLuas(), +p.HitungKeliling());
		BidangDatar bd3 = new BidangDatar("Segitiga", +s.HitungLuas(), +s.HitungKeliling());
		BidangDatar bd4 = new BidangDatar("Belah Ketupat", +b.HitungLuas(), +b.HitungKeliling());

		daftarBidang[0] = bd1;
		daftarBidang[1] = bd2;
		daftarBidang[2] = bd3;
		daftarBidang[3] = bd4;

		for (int i = 0; i < daftarBidang.length; i++) {
			System.out.println(daftarBidang[i]);
		}

	}

}
