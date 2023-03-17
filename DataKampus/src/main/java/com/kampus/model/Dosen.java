package com.kampus.model;

public class Dosen {
	private String kodeDosen;
	private String namaDosen;

	public Dosen() {
		// TODO Auto-generated constructor stub
	}

	public String getKodeDosen() {
		return kodeDosen;
	}

	public void setKodeDosen(String kodeDosen) {
		this.kodeDosen = kodeDosen;
	}

	public String getNamaDosen() {
		return namaDosen;
	}

	public void setNamaDosen(String namaDosen) {
		this.namaDosen = namaDosen;
	}

	@Override
	public String toString() {
		return "Kode Dosen=" + kodeDosen + " \t Nama Dosen=" + namaDosen ;
	}
	
	
}