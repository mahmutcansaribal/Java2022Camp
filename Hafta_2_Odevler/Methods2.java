
public class Methods2 {

	public static void main(String[] args) {
		
		String mesaj = "Bugun hava cok guzel";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(5,7);
		System.out.println(sayi);

		
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
	
	public static String sehirVer() {
		return "Ankara";
	}
	

}
