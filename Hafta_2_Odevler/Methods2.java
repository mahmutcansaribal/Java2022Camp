
public class Methods2 {

	public static void main(String[] args) {
		
		String mesaj = "Bugun hava cok guzel";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		
		int sayi = topla(5,7);
		System.out.println(sayi);
		
		int toplam = topla2(2,3,4,5,6,10);
		System.out.println("Variable Arguments : "+toplam);

		
	}
	
	//Void Fonksiyonlar deger dondurmezler (return) !
	public static void ekle() {
		System.out.println("Eklendi");
	}
	
	public static void sil() {
		System.out.println("Eklendi");
	}
	
	public static void guncelle() {
		System.out.println("Eklendi");
	}
	
	

	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	
	// Ders 26 - Variable Arguments.  3 nokta koyulur int array gibi calisir.
	public static int topla2(int... sayi1ar) {
		int toplam = 0;
		for(int sayi :  sayi1ar) {
			toplam += sayi;
		}
		return toplam;
	}
	
	public static String sehirVer() {
		return "Ankara";
	}
	

}
