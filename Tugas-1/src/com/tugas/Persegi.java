package com.tugas;

public class Persegi {
	public Persegi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persegi(double sisi) {
		super();
		this.sisi = sisi;
	}

	private double sisi;

	public double getSisi() {
		return sisi;
	}

	public void setSisi(double sisi) {
		this.sisi = sisi;
	}

	public double HitungLuas() {
		double Luas = sisi * sisi;
		return Luas;
	}

	public double HitungKeliling() {
		double Keliling = 4 * sisi;
		return Keliling;
	}
}
