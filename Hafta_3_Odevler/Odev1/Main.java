package Odev1;



public class Main {

	public static void main(String[] args) {
		
		//STACK VE HEAP YAPISI BELLEGİN BÖLÜMÜ OLAN STACK DA YAPAR.
		int[] sayilar1 = {1,2,3};
		int[] sayilar2 = {10,20,30};
		sayilar1 = sayilar2 ;
		
		sayilar2[0] = 1000;
		
		System.out.println(sayilar1[1]);

	}

	
	/*
	 * ORNEK 1
	 * SAYI1 = SAYI2 DEDİĞİMİZ ZAMAN SAYI1'İN DEGERİ SAYI2'NİN DEĞERİ OLARAK OKUNUR.
	 * BU ORNEKTE ATAMA SADECE DEĞER ÜZERİNDEN OLUR.
	 * -----------------------------------
	 * ORNEK 2
	 * DİZİLER REFERANS TİPLERDİR. DEĞER TİP DEĞİLDİR. 
	 * NEW DEDİĞİMİZDE BELLEKTE ONU OLUSTURURUZ. HEAP'DE REFERANSI OLUSTURULUR.
	 * GARBAGE COLLECTOR İLE BELLEKTEN ÇÖPCÜ TARAFINDAN ATILIR.
	 * -----------------------------------
	 * ORNEK 3
	 * 
	 */
	
	
}
