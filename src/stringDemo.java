
public class stringDemo {

	public static void main(String[] args) {
		String mesaj = "     Bugun h cok guzel.      ";
		System.out.println(mesaj);
		
		//Lenght metodu dizinin eleman sayisi verir.
		System.out.println("Eleman Sayisi : "+mesaj.length());
		
		//CharAt indexler arasında dolasmamızı saglar.
		System.out.println("5. Elaman : "+mesaj.charAt(4));
		//Concat string birlestir.
		System.out.println(mesaj.concat(" Yasasin!"));
		
		//Eğer B ile başlıyorsa True başlamıyorsa False Dondurur.
		System.out.println(mesaj.startsWith("b"));
		// Eğer nokta ile bitiyorsa True bitmiyorsa false dondurur.
		System.out.println(mesaj.endsWith("."));

		// B ile b arasında fark vardır Java da!
		
		/* Char Array ister yani depolamak gibi dusunebiliriz Karakterler alır */
		char[] karakterler = new char[5];
		// 1. parametre baslangic index 
		// 2. parametre gidilecek index
		// 3. parametre aktarılacak char 
		// 4. parametre aktarılan char'a hangi indexden itibaren aktarmasını soyleriz!
		// ONEMLI : 4 dahil etmez! o yuzden 5 yaptık
		mesaj.getChars(0,5,karakterler,0);
		System.out.println(karakterler);
		// Bu karakterin mesajin icinde kacinci eleman oldugunu bulmaya yarar.
		System.out.println(mesaj.indexOf('a'));
		// Aramaya en sondan baslar en sagdan yani
		System.out.println(mesaj.lastIndexOf('a'));
		
		
		System.out.println("----------------");
		
		// STRINGLER VIDEO 2 //
		
		
		// İlgili metindeki degerleri degistirebiliriz
		String yenimesaj =mesaj.replace(' ', '-');
		System.out.println(yenimesaj);
		// 2. Indexden itibaren  metini baslatır
		// gun hava cok guzel. YAZAR
		// 2 den baslar 4 e kadar gider 5. ındexi hesaba katmaz!
		System.out.println(mesaj.substring(2,5));
		
		// Belli bir karakter dizisini parcalamaya yarar.
		// Bosluklara gore cumleyi ayirdi.
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);

		}
		// Kelimeleri kucultur
		System.out.println(mesaj.toLowerCase());
		// Kelimeleri buyutur.
		System.out.println(mesaj.toUpperCase());
		// trim fonksiyonu baslangic ve sonundaki boslukları atar siler.
		System.out.println(mesaj.trim());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
