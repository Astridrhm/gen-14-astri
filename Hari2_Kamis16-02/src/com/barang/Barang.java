/**
 * 
 */
package com.barang;

/**
 * @author astridrhm
 *
 */
public class Barang implements Comparable<Barang> {

	/**
	 * @param args
	 */
	private String nama;
	private int harga;
	private int persediaan;

	public Barang() {
		super();
	}

	public Barang(String nama, int harga, int persediaan) {
		super();
		this.nama = nama;
		this.harga = harga;
		this.persediaan = persediaan;
	}

	/**
	 * @return the nama
	 */
	public String getNama() {
		return nama;
	}

	/**
	 * @param nama the nama to set
	 */
	public void setNama(String nama) {
		this.nama = nama;
	}

	/**
	 * @return the harga
	 */
	public int getHarga() {
		return harga;
	}

	/**
	 * Method untuk menentukan harga barang
	 * 
	 * @param harga the harga to set
	 */
	public void setHarga(int harga) throws Exception {
		// Harga tidak boleh negatif, maka diberi validasi disini
		if (harga > 0) {
			this.harga = harga;
		} else {
			throw new Exception("Harga tidak boleh negatif");
		}
	}

	/**
	 * @return the persediaan
	 */
	public int getPersediaan() {
		return persediaan;
	}

	/**
	 * @param persediaan the persediaan to set
	 */
	public void setPersediaan(int persediaan) {
		this.persediaan = persediaan;
	}

	@Override
	public String toString() {
		return "nama:" + this.nama + ", harga:" + StringUtil.toRupiah(this.harga) + ", stok:" + this.persediaan;
	}

	@Override
	public int compareTo(Barang o) {
		return o.getHarga() - this.harga;
	}
}

