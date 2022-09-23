
public class Methods {

	public static void main(String[] args) {
		sayiBulmaca();
	}
	
	public static void sayiBulmaca() {
		int [] sayilar = new int [] {1,2,5,7,9,0};
		int aranacak = 3;
		boolean varMi = false;
		
		for(int i = 0; i < sayilar.length;i++) {
			if(aranacak == sayilar[i]) {
				varMi = true;
				break;
			}
		}
		
		/*
		 	if(varMi) {
			mesajver("Sayı mevcuttur : "+aranacak);
		}else {
			mesajver("Sayı mevcut degildir : "+aranacak);
		}
		 	
		 */
		
		
		/*	Methodumuza aranan sayıyı ve varMi durumunu gonderdik
		  	varMi durumuna gore gelecek mesaj methoda iletildi.
		 */
		mesajVer(aranacak, varMi);
	}
	
	public static void mesajVer(int aranacak, boolean varMi) {
		if(varMi) {
			System.out.println("Aranan sayi dizide var! -> "+aranacak);
		}else {
			System.out.println("Aranan sayi dizide yok! -> "+aranacak);
		}
		
	}
	
	/*
		
		public static void mesajVer(String mesaj) {
			System.out.println(mesaj);
		}
		
	 */
	

}
