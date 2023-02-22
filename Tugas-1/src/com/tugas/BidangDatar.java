package com.tugas;

public class BidangDatar {
	public BidangDatar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BidangDatar(String nama, double luas, double keliling) {
		super();
		this.Nama = nama;
		this.Luas = luas;
		this.Keliling = keliling;
	}

	private String Nama;
	private double Luas;
	private double Keliling;

	public String getNama() {
		return Nama;
	}

	public void setNama(String nama) {
		Nama = nama;
	}

	public double getLuas() {
		return Luas;
	}

	public void setLuas(double luas) {
		Luas = luas;
	}

	public double getKeliling() {
		return Keliling;
	}

	public void setKeliling(double keliling) {
		Keliling = keliling;
	}

	public String toString() {
		return "Nama : " + this.Nama + ", Luas : " + this.Luas + ", Keliling : " + this.Keliling;
	}
}
