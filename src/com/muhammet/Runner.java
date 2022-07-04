package com.muhammet;

import com.muhammet.enttiy.Personel;

public class Runner {

	public static void main(String[] args) {


		Personel personel = new Personel("Ankara");
		personel.ad="Ahmet";
		personel.adres="Ankara";
		personel.tel="0 555 555 55 55";
		//personel.sirket = "322";
		//personel.sirketAdresi = "ÝZMÝR";
		personel = new Personel("Ýzmir");
		personel.ad="Deniz";
		personel.adres="izmir";
		personel.tel="0 555 555 55 55";

	}

}
