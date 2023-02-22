package com.tugas;

public class BelahKetupat {
	public BelahKetupat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BelahKetupat(double sisi, double diagonal1, double diagonal2) {
		super();
		this.sisi = sisi;
		this.diagonal1 = diagonal1;
		this.diagonal2 = diagonal2;
	}

	private double sisi;
	private double diagonal1;
	private double diagonal2;

	public double getSisi() {
		return sisi;
	}

	public void setSisi(double sisi) {
		this.sisi = sisi;
	}

	public double getDiagonal1() {
		return diagonal1;
	}

	public void setDiagonal1(double diagonal1) {
		this.diagonal1 = diagonal1;
	}

	public double getDiagonal2() {
		return diagonal2;
	}

	public void setDiagonal2(double diagonal2) {
		this.diagonal2 = diagonal2;
	}

	public double HitungLuas() {
		double Luas = 0.5 * diagonal1 * diagonal2;
		return Luas;
	}

	public double HitungKeliling() {
		double Keliling = 4 * sisi;
		return Keliling;
	}

}
