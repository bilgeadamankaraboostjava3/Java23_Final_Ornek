package com.muhammet.enttiy;

public class Personel {

	/**
	 * Deðiþmez
	 * final -> eðer bir deðiþken final ise ona ilk deðer atamasý yapmak zorundasýnýz.
	 */
	public final String sirket = "BÝLGEADAM";
	/**
	 * Eðer þirket adresi farklý lokasyonlarda ise ve kullanýma göre deðiþiyor sonra
	 * deðiþmiyor ise.
	 * final deðiþkenlere deðer atama iþlemi constructor ile yapýlabilir. çünkü
	 * daha nesne oluþmamýþtýr ve constructor da dðeiþkenlere deðer atmasý yapýlabilir.
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
		// this.sirket = "MUHAMMET"; // Hata -> final deðiþkene bir kere deðer atadý iseniz 
		// deðiþtiremezsiniz.
	}
	
}
