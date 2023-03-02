package com.tugas;

public class Segitiga {
	public Segitiga() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Segitiga(double alas, double tinggi, double sisi) {
		super();
		this.alas = alas;
		this.tinggi = tinggi;
		this.sisi = sisi;
	}

	private double alas;
	private double tinggi;
	private double sisi;

	public double getAlas() {
		return alas;
	}

	public void setAlas(double alas) {
		this.alas = alas;
	}

	public double getTinggi() {
		return tinggi;
	}

	public void setTinggi(double tinggi) {
		this.tinggi = tinggi;
	}

	public double getSisi() {
		return sisi;
	}

	public void setSisi(double sisi) {
		this.sisi = sisi;
	}

	public double HitungLuas() {
		double Luas = 0.5 * alas * tinggi;
		return Luas;
	}

	public double HitungKeliling() {
		double Keliling = sisi + sisi + sisi;
		return Keliling;
	}

}
