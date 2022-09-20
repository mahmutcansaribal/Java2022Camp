
public class sayiBulma {

	public static void main(String[] args) {
		int [] sayilar = new int [] {1,2,5,7,9,0};
		int aranacak = 8;
		boolean varMi = false;
		
		for(int i = 0; i < sayilar.length;i++) {
			if(aranacak == i) {
				varMi = true;
				break;
			}
		}
		if(varMi) {
			System.out.println("Aranan sayi dizide var!");
		}else {
			System.out.println("Aranan sayi dizide yok!");
		}
	}
}
