package com.tugas;

public class Lingkaran {
	public Lingkaran() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lingkaran(double jarijari) {
		super();
		this.jarijari = jarijari;
	}

	private double phi = 3.14;
	private double jarijari;

	public double getPhi() {
		return phi;
	}

	public void setPhi(double phi) {
		this.phi = phi;
	}

	public double getJarijari() {
		return jarijari;
	}

	public void setJarijari(double jarijari) {
		this.jarijari = jarijari;
	}

	public double HitungLuas() {
		double Luas = phi * jarijari * jarijari;
		return Luas;
	}

	public double HitungKeliling() {
		double Keliling = 2 * phi * jarijari;
		return Keliling;
	}

}
