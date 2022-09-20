
public class arkadasSayilar {
	
	//ARKADAS SAYİLAR
	public static void main(String[] args) {
		int arkadas1 = 1184;
		int arkadas2 = 1210;
		int toplam = 0;
		
		for(int i = 1; i < arkadas1; i++) {
			if(arkadas1 % i == 0) {
				toplam = toplam + i;
			}
		}
		if(toplam == arkadas2) {
			System.out.println(arkadas1+" sayisi ile "+arkadas2+" sayisi arkadas sayilardir");
		}else {
			System.out.println("Arkadas sayi degillerdir!");
		}
	}

}
