package com.muhammet.enttiy;

public class Personel {

	/**
	 * De�i�mez
	 * final -> e�er bir de�i�ken final ise ona ilk de�er atamas� yapmak zorundas�n�z.
	 */
	public final String sirket = "B�LGEADAM";
	/**
	 * E�er �irket adresi farkl� lokasyonlarda ise ve kullan�ma g�re de�i�iyor sonra
	 * de�i�miyor ise.
	 * final de�i�kenlere de�er atama i�lemi constructor ile yap�labilir. ��nk�
	 * daha nesne olu�mam��t�r ve constructor da d�ei�kenlere de�er atmas� yap�labilir.
	 */
	public final String sirketAdresi;
	public String ad;
	public String adres;
	public String tel;
	/**
	 * Default constructor.
	 */
	public Personel(String sirketAdresi) {
		this.sirketAdresi = sirketAdresi;
		// this.sirket = "MUHAMMET"; // Hata -> final de�i�kene bir kere de�er atad� iseniz 
		// de�i�tiremezsiniz.
	}
	
}
